/**
 * Sep 2, 2016NIRAKAR
 */
package com.nirakar.java.automatic.resource.management;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NIRAKAR
 * 
 */
public class AutomaticResourceManagement {

	/**
	 * In this method file is tried to be read which is surrounded by
	 * try-catch-finally block.
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void beforeTryWithResourcesStatement() {
		FileInputStream in = null;
		try {
			in = new FileInputStream("java7.txt");
			System.out.println(in.read());

		} catch (IOException ex) {
			System.out.println("Info.xml is not found");
		} finally {

			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This method is used without try-catch-finally block.
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void afterTryWithResourcesStatement() throws FileNotFoundException,
			IOException {

		try (FileInputStream in = new FileInputStream("java7.txt")) {
			System.out.println(in.read());

		} catch (FileNotFoundException ex) {
			System.out.println("Info.xml is not found");
		}

	}

	public void afterTryWithResourcesStatementV2() {
		try (FileInputStream fin = new FileInputStream("info.xml");
				BufferedReader br = new BufferedReader(new InputStreamReader(
						fin));) {
			if (br.ready()) {
				String line1 = br.readLine();
				System.out.println(line1);
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Info.xml is not found");
		} catch (IOException ex) {
			System.out.println("Can't read the file");
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		AutomaticResourceManagement automaticResourceManagement = new AutomaticResourceManagement();

		automaticResourceManagement.beforeTryWithResourcesStatement();

		automaticResourceManagement.afterTryWithResourcesStatement();

		automaticResourceManagement.afterTryWithResourcesStatementV2();
	}

}
