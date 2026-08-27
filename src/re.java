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

public class re {
   public static qu a(File $$0) throws IOException {
      qu var2;
      try (InputStream $$1 = new FileInputStream($$0)) {
         var2 = a($$1);
      }

      return var2;
   }

   private static DataInputStream b(InputStream $$0) throws IOException {
      return new DataInputStream(new arc(new GZIPInputStream($$0)));
   }

   public static qu a(InputStream $$0) throws IOException {
      qu var2;
      try (DataInputStream $$1 = b($$0)) {
         var2 = a($$1, rd.a);
      }

      return var2;
   }

   public static void a(File $$0, rk $$1) throws IOException {
      try (InputStream $$2 = new FileInputStream($$0)) {
         a($$2, $$1);
      }
   }

   public static void a(InputStream $$0, rk $$1) throws IOException {
      try (DataInputStream $$2 = b($$0)) {
         a((DataInput)$$2, $$1);
      }
   }

   public static void a(qu $$0, File $$1) throws IOException {
      try (OutputStream $$2 = new FileOutputStream($$1)) {
         a($$0, $$2);
      }
   }

   public static void a(qu $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$1)))) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(qu $$0, File $$1) throws IOException {
      try (
         FileOutputStream $$2 = new FileOutputStream($$1);
         DataOutputStream $$3 = new DataOutputStream($$2);
      ) {
         a($$0, (DataOutput)$$3);
      }
   }

   @Nullable
   public static qu b(File $$0) throws IOException {
      if (!$$0.exists()) {
         return null;
      } else {
         qu var3;
         try (
            FileInputStream $$1 = new FileInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a($$2, rd.a);
         }

         return var3;
      }
   }

   public static qu a(DataInput $$0) throws IOException {
      return a($$0, rd.a);
   }

   public static qu a(DataInput $$0, rd $$1) throws IOException {
      rn $$2 = a($$0, 0, $$1);
      if ($$2 instanceof qu) {
         return (qu)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(qu $$0, DataOutput $$1) throws IOException {
      b($$0, $$1);
   }

   public static void a(DataInput $$0, rk $$1) throws IOException {
      rp<?> $$2 = rq.a($$0.readByte());
      if ($$2 == qw.a) {
         if ($$1.b(qw.a) == rk.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$2)) {
            case c:
            default:
               break;
            case b:
               rl.a($$0);
               $$2.a($$0);
               break;
            case a:
               rl.a($$0);
               $$2.a($$0, $$1);
         }
      }
   }

   public static rn b(DataInput $$0, rd $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (rn)($$2 == 0 ? qw.b : a($$0, 0, $$1, $$2));
   }

   public static void a(rn $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(rn $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   private static rn a(DataInput $$0, int $$1, rd $$2) throws IOException {
      byte $$3 = $$0.readByte();
      if ($$3 == 0) {
         return qw.b;
      } else {
         rl.a($$0);
         return a($$0, $$1, $$2, $$3);
      }
   }

   private static rn a(DataInput $$0, int $$1, rd $$2, byte $$3) {
      try {
         return rq.a($$3).b($$0, $$1, $$2);
      } catch (IOException var7) {
         o $$5 = o.a(var7, "Loading NBT data");
         p $$6 = $$5.a("NBT Tag");
         $$6.a("Tag type", $$3);
         throw new y($$5);
      }
   }
}
