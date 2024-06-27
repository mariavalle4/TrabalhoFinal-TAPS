package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Modelo;

public class Dao {

		File arq;

		public Dao() {
			arq = new File("dao.txt");
		}
		
		public boolean cadastraPaciente(Modelo m)
		{
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				fw = new FileWriter(arq, true);
				bw = new BufferedWriter(fw);
				
				bw.write(m.toString());
				bw.newLine();
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			finally
			{
				try {
					fw.close();
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return true;
		}
		
		public boolean consultaPaciente(Modelo m)
		{
			boolean resp = false;
			
			try {
				FileReader fr = new FileReader(arq);
				BufferedReader br = new BufferedReader(fr);
				
				String linha = null;
				String[] campos = new String[2];
				
				try {
					while((linha = br.readLine())!=null)
					{
						campos = linha.split("#");
						if(campos[0].equals(m.getCPF()))
						{
							m.setNome(campos[1]);
							m.setEndereco(campos[2]);
							
							resp = true;
							break;
						
					}}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return resp;
		}
	}
