/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *     |_ SaveImageFromUrl
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 26.
 * </pre>
 *
 * @author	: 오준용
 * @version 	: 1.0
 */
public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://mms.businesswire.com/media/20150909006590/en/484982/5/iPhone6s-2Up-HeroFish-PR-PRINT.jpg";
		try {
			URL url = new URL(imageUrl);
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/iphone.jpg")) {
				int result;
				byte[] buf = new byte[100];
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
				System.out.println("파일 생성 완료");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
