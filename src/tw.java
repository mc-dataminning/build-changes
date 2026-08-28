import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public final class tw implements ty {
   private static final int b = 24;
   public static final va<tw> a = new va.b<tw>() {
      public tw a(DataInput $$0, ui $$1) throws IOException {
         return new tw(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte[] d(DataInput $$0, ui $$1) throws IOException {
         $$1.b(24L);
         int $$2 = $$0.readInt();
         $$1.a(1L, (long)$$2);
         byte[] $$3 = new byte[$$2];
         $$0.readFully($$3);
         return $$3;
      }

      @Override
      public void b(DataInput $$0, ui $$1) throws IOException {
         $$0.skipBytes($$0.readInt() * 1);
      }

      @Override
      public String a() {
         return "BYTE[]";
      }

      @Override
      public String b() {
         return "TAG_Byte_Array";
      }
   };
   private byte[] c;

   public tw(byte[] $$0) {
      this.c = $$0;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c.length);
      $$0.write(this.c);
   }

   @Override
   public int a() {
      return 24 + 1 * this.c.length;
   }

   @Override
   public byte b() {
      return 7;
   }

   @Override
   public va<tw> c() {
      return a;
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   @Override
   public uy d() {
      byte[] $$0 = new byte[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new tw($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof tw && Arrays.equals(this.c, ((tw)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(vc $$0) {
      $$0.a(this);
   }

   public byte[] e() {
      return this.c;
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public tx a(int $$0) {
      return tx.a(this.c[$$0]);
   }

   @Override
   public boolean a(int $$0, uy $$1) {
      if ($$1 instanceof up $$2) {
         this.c[$$0] = $$2.j();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, uy $$1) {
      if ($$1 instanceof up $$2) {
         this.c = ArrayUtils.add(this.c, $$0, $$2.j());
         return true;
      } else {
         return false;
      }
   }

   public tx b(int $$0) {
      byte $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return tx.a($$1);
   }

   @Override
   public void clear() {
      this.c = new byte[0];
   }

   @Override
   public Optional<byte[]> f() {
      return Optional.of(this.c);
   }

   @Override
   public uv.b a(uv $$0) {
      return $$0.a(this.c);
   }
}
