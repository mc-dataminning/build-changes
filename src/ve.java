import java.io.BufferedOutputStream;
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

public class ve {
   private static final OpenOption[] a = new OpenOption[]{
      StandardOpenOption.SYNC, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   };

   public static ur a(Path $$0, va $$1) throws IOException {
      ur var4;
      try (
         InputStream $$2 = Files.newInputStream($$0);
         InputStream $$3 = new ayh($$2);
      ) {
         var4 = a($$3, $$1);
      }

      return var4;
   }

   private static DataInputStream a(InputStream $$0) throws IOException {
      return new DataInputStream(new ayh(new GZIPInputStream($$0)));
   }

   private static DataOutputStream a(OutputStream $$0) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$0)));
   }

   public static ur a(InputStream $$0, va $$1) throws IOException {
      ur var3;
      try (DataInputStream $$2 = a($$0)) {
         var3 = a((DataInput)$$2, $$1);
      }

      return var3;
   }

   public static void a(Path $$0, vl $$1, va $$2) throws IOException {
      try (
         InputStream $$3 = Files.newInputStream($$0);
         InputStream $$4 = new ayh($$3);
      ) {
         a($$4, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, vl $$1, va $$2) throws IOException {
      try (DataInputStream $$3 = a($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static void a(ur $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
      ) {
         a($$0, $$3);
      }
   }

   public static void a(ur $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = a($$1)) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(ur $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
         DataOutputStream $$4 = new DataOutputStream($$3);
      ) {
         a($$0, (DataOutput)$$4);
      }
   }

   @Nullable
   public static ur a(Path $$0) throws IOException {
      if (!Files.exists($$0)) {
         return null;
      } else {
         ur var3;
         try (
            InputStream $$1 = Files.newInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a((DataInput)$$2, va.a());
         }

         return var3;
      }
   }

   public static ur a(DataInput $$0) throws IOException {
      return a($$0, va.a());
   }

   public static ur a(DataInput $$0, va $$1) throws IOException {
      vo $$2 = c($$0, $$1);
      if ($$2 instanceof ur) {
         return (ur)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(ur $$0, DataOutput $$1) throws IOException {
      c($$0, $$1);
   }

   public static void a(DataInput $$0, vl $$1, va $$2) throws IOException {
      vq<?> $$3 = vr.a($$0.readByte());
      if ($$3 == ut.a) {
         if ($$1.b(ut.a) == vl.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               vm.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               vm.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static vo b(DataInput $$0, va $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (vo)($$2 == 0 ? ut.b : a($$0, $$1, $$2));
   }

   public static void a(vo $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(vo $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   public static void c(vo $$0, DataOutput $$1) throws IOException {
      b($$0, new ve.a($$1));
   }

   private static vo c(DataInput $$0, va $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return ut.b;
      } else {
         vm.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static vo a(DataInput $$0, va $$1, byte $$2) {
      try {
         return vr.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new vi($$4);
      }
   }

   public static class a extends ayb {
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
