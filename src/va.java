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

public class va {
   private static final OpenOption[] a = new OpenOption[]{
      StandardOpenOption.SYNC, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING
   };

   public static un a(Path $$0, uw $$1) throws IOException {
      un var4;
      try (
         InputStream $$2 = Files.newInputStream($$0);
         InputStream $$3 = new ayx($$2);
      ) {
         var4 = a($$3, $$1);
      }

      return var4;
   }

   private static DataInputStream a(InputStream $$0) throws IOException {
      return new DataInputStream(new ayx(new GZIPInputStream($$0)));
   }

   private static DataOutputStream a(OutputStream $$0) throws IOException {
      return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream($$0)));
   }

   public static un a(InputStream $$0, uw $$1) throws IOException {
      un var3;
      try (DataInputStream $$2 = a($$0)) {
         var3 = a((DataInput)$$2, $$1);
      }

      return var3;
   }

   public static void a(Path $$0, vh $$1, uw $$2) throws IOException {
      try (
         InputStream $$3 = Files.newInputStream($$0);
         InputStream $$4 = new ayx($$3);
      ) {
         a($$4, $$1, $$2);
      }
   }

   public static void a(InputStream $$0, vh $$1, uw $$2) throws IOException {
      try (DataInputStream $$3 = a($$0)) {
         a((DataInput)$$3, $$1, $$2);
      }
   }

   public static void a(un $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
      ) {
         a($$0, $$3);
      }
   }

   public static void a(un $$0, OutputStream $$1) throws IOException {
      try (DataOutputStream $$2 = a($$1)) {
         a($$0, (DataOutput)$$2);
      }
   }

   public static void b(un $$0, Path $$1) throws IOException {
      try (
         OutputStream $$2 = Files.newOutputStream($$1, a);
         OutputStream $$3 = new BufferedOutputStream($$2);
         DataOutputStream $$4 = new DataOutputStream($$3);
      ) {
         a($$0, (DataOutput)$$4);
      }
   }

   @Nullable
   public static un a(Path $$0) throws IOException {
      if (!Files.exists($$0)) {
         return null;
      } else {
         un var3;
         try (
            InputStream $$1 = Files.newInputStream($$0);
            DataInputStream $$2 = new DataInputStream($$1);
         ) {
            var3 = a((DataInput)$$2, uw.a());
         }

         return var3;
      }
   }

   public static un a(DataInput $$0) throws IOException {
      return a($$0, uw.a());
   }

   public static un a(DataInput $$0, uw $$1) throws IOException {
      vk $$2 = c($$0, $$1);
      if ($$2 instanceof un) {
         return (un)$$2;
      } else {
         throw new IOException("Root tag must be a named compound tag");
      }
   }

   public static void a(un $$0, DataOutput $$1) throws IOException {
      c($$0, $$1);
   }

   public static void a(DataInput $$0, vh $$1, uw $$2) throws IOException {
      vm<?> $$3 = vn.a($$0.readByte());
      if ($$3 == up.a) {
         if ($$1.b(up.a) == vh.b.a) {
            $$1.a();
         }
      } else {
         switch ($$1.b($$3)) {
            case c:
            default:
               break;
            case b:
               vi.a($$0);
               $$3.b($$0, $$2);
               break;
            case a:
               vi.a($$0);
               $$3.a($$0, $$1, $$2);
         }
      }
   }

   public static vk b(DataInput $$0, uw $$1) throws IOException {
      byte $$2 = $$0.readByte();
      return (vk)($$2 == 0 ? up.b : a($$0, $$1, $$2));
   }

   public static void a(vk $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$0.a($$1);
      }
   }

   public static void b(vk $$0, DataOutput $$1) throws IOException {
      $$1.writeByte($$0.b());
      if ($$0.b() != 0) {
         $$1.writeUTF("");
         $$0.a($$1);
      }
   }

   public static void c(vk $$0, DataOutput $$1) throws IOException {
      b($$0, new va.a($$1));
   }

   private static vk c(DataInput $$0, uw $$1) throws IOException {
      byte $$2 = $$0.readByte();
      if ($$2 == 0) {
         return up.b;
      } else {
         vi.a($$0);
         return a($$0, $$1, $$2);
      }
   }

   private static vk a(DataInput $$0, uw $$1, byte $$2) {
      try {
         return vn.a($$2).c($$0, $$1);
      } catch (IOException var6) {
         o $$4 = o.a(var6, "Loading NBT data");
         p $$5 = $$4.a("NBT Tag");
         $$5.a("Tag type", $$2);
         throw new ve($$4);
      }
   }

   public static class a extends ayr {
      public a(DataOutput $$0) {
         super($$0);
      }

      @Override
      public void writeUTF(String $$0) throws IOException {
         try {
            super.writeUTF($$0);
         } catch (UTFDataFormatException var3) {
            ae.a("Failed to write NBT String", var3);
            super.writeUTF("");
         }
      }
   }
}
