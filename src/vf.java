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

public class vf {
   private static final OpenOption[] a = new OpenOption[]{
      StandardOpenOption.SYNC, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   };

   public static us a(Path $$0, vb $$1) throws IOException {
      us var4;
      try (
         InputStream $$2 = Files.newInputStream($$0);
         InputStream $$3 = new ayi($$2);
      ) {
         var4 = a($$3, $$1);
      }

      return var4;
   }

   private static DataInputStream a(InputStream $$0) throws IOException {
      return new DataInputStream(new ayi(new GZIPInputStream($$0)));
   }

   private static DataOutputStream a(OutputStream $$0) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$0)));
   }

   public static us a(InputStream $$0, vb $$1) throws IOException {
      us var3;
      try (DataInputStream $$2 = a($$0)) {
         var3 = a((DataInput)$$2, $$1);
      }

      return var3;
   }

   public static void a(Path $$0, vm $$1, vb $$2) throws IOException {
      try (
         InputStream $$3 = Files.newInputStream($$0);
         InputStream $$4 = new ayi($$3);
      ) {
         a($$4, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, vm $$1, vb $$2) throws IOException {
      try (DataInputStream $$3 = a($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static void a(us $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
      ) {
         a($$0, $$3);
      }
   }

   public static void a(us $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = a($$1)) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(us $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
         DataOutputStream $$4 = new DataOutputStream($$3);
      ) {
         a($$0, (DataOutput)$$4);
      }
   }

   @Nullable
   public static us a(Path $$0) throws IOException {
      if (!Files.exists($$0)) {
         return null;
      } else {
         us var3;
         try (
            InputStream $$1 = Files.newInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a((DataInput)$$2, vb.a());
         }

         return var3;
      }
   }

   public static us a(DataInput $$0) throws IOException {
      return a($$0, vb.a());
   }

   public static us a(DataInput $$0, vb $$1) throws IOException {
      vp $$2 = c($$0, $$1);
      if ($$2 instanceof us) {
         return (us)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(us $$0, DataOutput $$1) throws IOException {
      c($$0, $$1);
   }

   public static void a(DataInput $$0, vm $$1, vb $$2) throws IOException {
      vr<?> $$3 = vs.a($$0.readByte());
      if ($$3 == uu.a) {
         if ($$1.b(uu.a) == vm.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               vn.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               vn.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static vp b(DataInput $$0, vb $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (vp)($$2 == 0 ? uu.b : a($$0, $$1, $$2));
   }

   public static void a(vp $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(vp $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   public static void c(vp $$0, DataOutput $$1) throws IOException {
      b($$0, new vf.a($$1));
   }

   private static vp c(DataInput $$0, vb $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return uu.b;
      } else {
         vn.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static vp a(DataInput $$0, vb $$1, byte $$2) {
      try {
         return vs.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new vj($$4);
      }
   }

   public static class a extends ayc {
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
