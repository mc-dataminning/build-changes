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

public class rh {
   public static qw a(File $$0) throws IOException {
      qw var2;
      try (InputStream $$1 = new FileInputStream($$0)) {
         var2 = a($$1);
      }

      return var2;
   }

   private static DataInputStream b(InputStream $$0) throws IOException {
      return new DataInputStream(new arg(new GZIPInputStream($$0)));
   }

   public static qw a(InputStream $$0) throws IOException {
      qw var2;
      try (DataInputStream $$1 = b($$0)) {
         var2 = a($$1, rf.a());
      }

      return var2;
   }

   public static void a(File $$0, rn $$1, rf $$2) throws IOException {
      try (InputStream $$3 = new FileInputStream($$0)) {
         a($$3, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, rn $$1, rf $$2) throws IOException {
      try (DataInputStream $$3 = b($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static void a(qw $$0, File $$1) throws IOException {
      try (OutputStream $$2 = new FileOutputStream($$1)) {
         a($$0, $$2);
      }
   }

   public static void a(qw $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$1)))) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(qw $$0, File $$1) throws IOException {
      try (
         FileOutputStream $$2 = new FileOutputStream($$1);
         DataOutputStream $$3 = new DataOutputStream($$2);
      ) {
         a($$0, (DataOutput)$$3);
      }
   }

   @Nullable
   public static qw b(File $$0) throws IOException {
      if (!$$0.exists()) {
         return null;
      } else {
         qw var3;
         try (
            FileInputStream $$1 = new FileInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a($$2, rf.a());
         }

         return var3;
      }
   }

   public static qw a(DataInput $$0) throws IOException {
      return a($$0, rf.a());
   }

   public static qw a(DataInput $$0, rf $$1) throws IOException {
      rq $$2 = c($$0, $$1);
      if ($$2 instanceof qw) {
         return (qw)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(qw $$0, DataOutput $$1) throws IOException {
      b($$0, $$1);
   }

   public static void a(DataInput $$0, rn $$1, rf $$2) throws IOException {
      rs<?> $$3 = rt.a($$0.readByte());
      if ($$3 == qy.a) {
         if ($$1.b(qy.a) == rn.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               ro.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               ro.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static rq b(DataInput $$0, rf $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (rq)($$2 == 0 ? qy.b : a($$0, $$1, $$2));
   }

   public static void a(rq $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(rq $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   private static rq c(DataInput $$0, rf $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return qy.b;
      } else {
         ro.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static rq a(DataInput $$0, rf $$1, byte $$2) {
      try {
         return rt.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new y($$4);
      }
   }
}
