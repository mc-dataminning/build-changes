import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class tx extends tz<ty> {
   private static final int b = 24;
   public static final uz<tx> a = new uz.b<tx>() {
      public tx a(DataInput $$0, uj $$1) throws IOException {
         return new tx(d($$0, $$1));
      }

      @Override
      public uu.b a(DataInput $$0, uu $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte[] d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(24L);
         int $$2 = $$0.readInt();
         $$1.a(1L, (long)$$2);
         byte[] $$3 = new byte[$$2];
         $$0.readFully($$3);
         return $$3;
      }

      @Override
      public void b(DataInput $$0, uj $$1) throws IOException {
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

   public tx(byte[] $$0) {
      this.c = $$0;
   }

   public tx(List<Byte> $$0) {
      this(a($$0));
   }

   private static byte[] a(List<Byte> $$0) {
      byte[] $$1 = new byte[$$0.size()];

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         Byte $$3 = $$0.get($$2);
         $$1[$$2] = $$3 == null ? 0 : $$3;
      }

      return $$1;
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
   public uz<tx> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   @Override
   public ux d() {
      byte[] $$0 = new byte[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new tx($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof tx && Arrays.equals(this.c, ((tx)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(vb $$0) {
      $$0.a(this);
   }

   public byte[] e() {
      return this.c;
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public ty a(int $$0) {
      return ty.a(this.c[$$0]);
   }

   public ty a(int $$0, ty $$1) {
      byte $$2 = this.c[$$0];
      this.c[$$0] = $$1.i();
      return ty.a($$2);
   }

   public void b(int $$0, ty $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.i());
   }

   @Override
   public boolean a(int $$0, ux $$1) {
      if ($$1 instanceof uq) {
         this.c[$$0] = ((uq)$$1).i();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, ux $$1) {
      if ($$1 instanceof uq) {
         this.c = ArrayUtils.add(this.c, $$0, ((uq)$$1).i());
         return true;
      } else {
         return false;
      }
   }

   public ty b(int $$0) {
      byte $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return ty.a($$1);
   }

   @Override
   public byte f() {
      return 1;
   }

   @Override
   public void clear() {
      this.c = new byte[0];
   }

   @Override
   public uu.b a(uu $$0) {
      return $$0.a(this.c);
   }
}
