import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;

public class rj {
   public static qy a(File $$0) throws IOException {
      qy var2;
      try (InputStream $$1 = new FileInputStream($$0)) {
         var2 = a($$1);
      }

      return var2;
   }

   private static DataInputStream b(InputStream $$0) throws IOException {
      return new DataInputStream(new ari(new GZIPInputStream($$0)));
   }

   public static qy a(InputStream $$0) throws IOException {
      qy var2;
      try (DataInputStream $$1 = b($$0)) {
         var2 = a($$1, rh.a());
      }

      return var2;
   }

   public static void a(File $$0, rp $$1, rh $$2) throws IOException {
      try (InputStream $$3 = new FileInputStream($$0)) {
         a($$3, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, rp $$1, rh $$2) throws IOException {
      try (DataInputStream $$3 = b($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static void a(qy $$0, File $$1) throws IOException {
      try (OutputStream $$2 = new FileOutputStream($$1)) {
         a($$0, $$2);
      }
   }

   public static void a(qy $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$1)))) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(qy $$0, File $$1) throws IOException {
      try (
         FileOutputStream $$2 = new FileOutputStream($$1);
         DataOutputStream $$3 = new DataOutputStream($$2);
      ) {
         a($$0, (DataOutput)$$3);
      }
   }

   @Nullable
   public static qy b(File $$0) throws IOException {
      if (!$$0.exists()) {
         return null;
      } else {
         qy var3;
         try (
            FileInputStream $$1 = new FileInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a($$2, rh.a());
         }

         return var3;
      }
   }

   public static qy a(DataInput $$0) throws IOException {
      return a($$0, rh.a());
   }

   public static qy a(DataInput $$0, rh $$1) throws IOException {
      rs $$2 = c($$0, $$1);
      if ($$2 instanceof qy) {
         return (qy)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(qy $$0, DataOutput $$1) throws IOException {
      b($$0, $$1);
   }

   public static void a(DataInput $$0, rp $$1, rh $$2) throws IOException {
      $$2.b(8L);
      ru<?> $$3 = rv.a($$0.readByte());
      if ($$3 == ra.a) {
         if ($$1.b(ra.a) == rp.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               rq.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               rq.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static rs b(DataInput $$0, rh $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (rs)($$2 == 0 ? ra.b : a($$0, $$1, $$2));
   }

   public static void a(rs $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(rs $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   private static rs c(DataInput $$0, rh $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return ra.b;
      } else {
         rq.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static rs a(DataInput $$0, rh $$1, byte $$2) {
      try {
         return rv.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new y($$4);
      }
   }
}
