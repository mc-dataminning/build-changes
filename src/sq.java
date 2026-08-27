import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;

public class sq {
   public static sd a(Path $$0, sm $$1) throws IOException {
      sd var3;
      try (InputStream $$2 = Files.newInputStream($$0)) {
         var3 = a($$2, $$1);
      }

      return var3;
   }

   private static DataInputStream a(InputStream $$0) throws IOException {
      return new DataInputStream(new asz(new GZIPInputStream($$0)));
   }

   private static DataOutputStream a(OutputStream $$0) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$0)));
   }

   public static sd a(InputStream $$0, sm $$1) throws IOException {
      sd var3;
      try (DataInputStream $$2 = a($$0)) {
         var3 = a((DataInput)$$2, $$1);
      }

      return var3;
   }

   public static void a(Path $$0, sx $$1, sm $$2) throws IOException {
      try (InputStream $$3 = Files.newInputStream($$0)) {
         a($$3, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, sx $$1, sm $$2) throws IOException {
      try (DataInputStream $$3 = a($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static byte[] a(sd $$0) throws IOException {
      ByteArrayOutputStream $$1 = new ByteArrayOutputStream();

      try (DataOutputStream $$2 = a($$1)) {
         a($$0, (DataOutput)$$2);
      }

      return $$1.toByteArray();
   }

   public static byte[] b(sd $$0) throws IOException {
      ByteArrayOutputStream $$1 = new ByteArrayOutputStream();

      try (DataOutputStream $$2 = new DataOutputStream($$1)) {
         a($$0, (DataOutput)$$2);
      }

      return $$1.toByteArray();
   }

   public static void a(sd $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, StandardOpenOption.SYNC);
         OutputStream $$3 = new BufferedOutputStream($$2);
      ) {
         a($$0, $$3);
      }
   }

   public static void a(sd $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = a($$1)) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(sd $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, StandardOpenOption.SYNC);
         OutputStream $$3 = new BufferedOutputStream($$2);
         DataOutputStream $$4 = new DataOutputStream($$3);
      ) {
         a($$0, (DataOutput)$$4);
      }
   }

   @Nullable
   public static sd a(Path $$0) throws IOException {
      if (Files.exists($$0)) {
         return null;
      } else {
         sd var3;
         try (
            InputStream $$1 = Files.newInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a((DataInput)$$2, sm.a());
         }

         return var3;
      }
   }

   public static sd a(DataInput $$0) throws IOException {
      return a($$0, sm.a());
   }

   public static sd a(DataInput $$0, sm $$1) throws IOException {
      ta $$2 = c($$0, $$1);
      if ($$2 instanceof sd) {
         return (sd)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(sd $$0, DataOutput $$1) throws IOException {
      b($$0, $$1);
   }

   public static void a(DataInput $$0, sx $$1, sm $$2) throws IOException {
      tc<?> $$3 = td.a($$0.readByte());
      if ($$3 == sf.a) {
         if ($$1.b(sf.a) == sx.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               sy.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               sy.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static ta b(DataInput $$0, sm $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (ta)($$2 == 0 ? sf.b : a($$0, $$1, $$2));
   }

   public static void a(ta $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(ta $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   private static ta c(DataInput $$0, sm $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return sf.b;
      } else {
         sy.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static ta a(DataInput $$0, sm $$1, byte $$2) {
      try {
         return td.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new su($$4);
      }
   }
}
