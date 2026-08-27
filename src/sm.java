import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
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

public class sm {
   public static rz a(File $$0, si $$1) throws IOException {
      rz var3;
      try (InputStream $$2 = new FileInputStream($$0)) {
         var3 = a($$2, $$1);
      }

      return var3;
   }

   private static DataInputStream a(InputStream $$0) throws IOException {
      return new DataInputStream(new asv(new GZIPInputStream($$0)));
   }

   public static rz a(InputStream $$0, si $$1) throws IOException {
      rz var3;
      try (DataInputStream $$2 = a($$0)) {
         var3 = a((DataInput)$$2, $$1);
      }

      return var3;
   }

   public static void a(File $$0, st $$1, si $$2) throws IOException {
      try (InputStream $$3 = new FileInputStream($$0)) {
         a($$3, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, st $$1, si $$2) throws IOException {
      try (DataInputStream $$3 = a($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static byte[] a(rz $$0) throws IOException {
      ByteArrayOutputStream $$1 = new ByteArrayOutputStream();

      try (DataOutputStream $$2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$1)))) {
         a($$0, (DataOutput)$$2);
      }

      return $$1.toByteArray();
   }

   public static byte[] b(rz $$0) throws IOException {
      ByteArrayOutputStream $$1 = new ByteArrayOutputStream();

      try (DataOutputStream $$2 = new DataOutputStream($$1)) {
         a($$0, (DataOutput)$$2);
      }

      return $$1.toByteArray();
   }

   public static void a(rz $$0, File $$1) throws IOException {
      try (OutputStream $$2 = new FileOutputStream($$1)) {
         a($$0, $$2);
      }
   }

   public static void a(rz $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$1)))) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(rz $$0, File $$1) throws IOException {
      try (
         FileOutputStream $$2 = new FileOutputStream($$1);
         DataOutputStream $$3 = new DataOutputStream($$2);
      ) {
         a($$0, (DataOutput)$$3);
      }
   }

   @Nullable
   public static rz a(File $$0) throws IOException {
      if (!$$0.exists()) {
         return null;
      } else {
         rz var3;
         try (
            FileInputStream $$1 = new FileInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a((DataInput)$$2, si.a());
         }

         return var3;
      }
   }

   public static rz a(DataInput $$0) throws IOException {
      return a($$0, si.a());
   }

   public static rz a(DataInput $$0, si $$1) throws IOException {
      sw $$2 = c($$0, $$1);
      if ($$2 instanceof rz) {
         return (rz)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(rz $$0, DataOutput $$1) throws IOException {
      b($$0, $$1);
   }

   public static void a(DataInput $$0, st $$1, si $$2) throws IOException {
      sy<?> $$3 = sz.a($$0.readByte());
      if ($$3 == sb.a) {
         if ($$1.b(sb.a) == st.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               su.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               su.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static sw b(DataInput $$0, si $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (sw)($$2 == 0 ? sb.b : a($$0, $$1, $$2));
   }

   public static void a(sw $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(sw $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   private static sw c(DataInput $$0, si $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return sb.b;
      } else {
         su.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static sw a(DataInput $$0, si $$1, byte $$2) {
      try {
         return sz.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new sq($$4);
      }
   }
}
