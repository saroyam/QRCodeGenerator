/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QRCodeGenerator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.file.*;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
/**
 *
 * @author mukul
 */
public class QRGenerator {
    
    public static void QRGenerator(String details) throws Exception
    {
        
        ByteArrayOutputStream out= QRCode.from(details).to(ImageType.JPG).stream();
        
        
        File f = new File("C:\\Work\\Bar Code generator\\web\\images\\new.JPG");
        FileOutputStream fos = new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush();
        
    }
}
