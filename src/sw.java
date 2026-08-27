import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UTFDataFormatException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.annotation.Nullable;

public class sw {
   private static final OpenOption[] a = new OpenOption[]{
      StandardOpenOption.SYNC, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   };

   public static sj a(Path $$0, ss $$1) throws IOException {
      sj var3;
      try (InputStream $$2 = Files.newInputStream($$0)) {
         var3 = a($$2, $$1);
      }

      return var3;
   }

   private static DataInputStream a(InputStream $$0) throws IOException {
      return new DataInputStream(new ath(new GZIPInputStream($$0)));
   }

   private static DataOutputStream a(OutputStream $$0) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$0)));
   }

   public static sj a(InputStream $$0, ss $$1) throws IOException {
      sj var3;
      try (DataInputStream $$2 = a($$0)) {
         var3 = a((DataInput)$$2, $$1);
      }

      return var3;
   }

   public static void a(Path $$0, td $$1, ss $$2) throws IOException {
      try (InputStream $$3 = Files.newInputStream($$0)) {
         a($$3, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, td $$1, ss $$2) throws IOException {
      try (DataInputStream $$3 = a($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static byte[] a(sj $$0) throws IOException {
      ByteArrayOutputStream $$1 = new ByteArrayOutputStream();

      try (DataOutputStream $$2 = a($$1)) {
         a($$0, (DataOutput)$$2);
      }

      return $$1.toByteArray();
   }

   public static byte[] b(sj $$0) throws IOException {
      ByteArrayOutputStream $$1 = new ByteArrayOutputStream();

      try (DataOutputStream $$2 = new DataOutputStream($$1)) {
         a($$0, (DataOutput)$$2);
      }

      return $$1.toByteArray();
   }

   public static void a(sj $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
      ) {
         a($$0, $$3);
      }
   }

   public static void a(sj $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = a($$1)) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(sj $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
         DataOutputStream $$4 = new DataOutputStream($$3);
      ) {
         a($$0, (DataOutput)$$4);
      }
   }

   @Nullable
   public static sj a(Path $$0) throws IOException {
      if (!Files.exists($$0)) {
         return null;
      } else {
         sj var3;
         try (
            InputStream $$1 = Files.newInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a((DataInput)$$2, ss.a());
         }

         return var3;
      }
   }

   public static sj a(DataInput $$0) throws IOException {
      return a($$0, ss.a());
   }

   public static sj a(DataInput $$0, ss $$1) throws IOException {
      tg $$2 = c($$0, $$1);
      if ($$2 instanceof sj) {
         return (sj)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(sj $$0, DataOutput $$1) throws IOException {
      c($$0, $$1);
   }

   public static void a(DataInput $$0, td $$1, ss $$2) throws IOException {
      ti<?> $$3 = tj.a($$0.readByte());
      if ($$3 == sl.a) {
         if ($$1.b(sl.a) == td.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               te.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               te.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static tg b(DataInput $$0, ss $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (tg)($$2 == 0 ? sl.b : a($$0, $$1, $$2));
   }

   public static void a(tg $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(tg $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   public static void c(tg $$0, DataOutput $$1) throws IOException {
      b($$0, new sw.a($$1));
   }

   private static tg c(DataInput $$0, ss $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return sl.b;
      } else {
         te.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static tg a(DataInput $$0, ss $$1, byte $$2) {
      try {
         return tj.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new ta($$4);
      }
   }

   public static class a extends atc {
      public a(DataOutput $$0) {
         super($$0);
      }

      @Override
      public void writeUTF(String $$0) throws IOException {
         try {
            super.writeUTF($$0);
         } catch (UTFDataFormatException var3) {
            ac.a("Failed to write NBT String", var3);
            super.writeUTF("");
         }
      }
   }
}
