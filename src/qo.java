import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class qo extends qq<qp> {
   private static final int b = 24;
   public static final rm<qo> a = new rm.b<qo>() {
      public qo a(DataInput $$0, int $$1, ra $$2) throws IOException {
         $$2.a(24L);
         int $$3 = $$0.readInt();
         $$2.a(1L * (long)$$3);
         byte[] $$4 = new byte[$$3];
         $$0.readFully($$4);
         return new qo($$4);
      }

      @Override
      public rh.b a(DataInput $$0, rh $$1) throws IOException {
         int $$2 = $$0.readInt();
         byte[] $$3 = new byte[$$2];
         $$0.readFully($$3);
         return $$1.a($$3);
      }

      @Override
      public void a(DataInput $$0) throws IOException {
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

   public qo(byte[] $$0) {
      this.c = $$0;
   }

   public qo(List<Byte> $$0) {
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
   public rm<qo> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.m_();
   }

   @Override
   public rk d() {
      byte[] $$0 = new byte[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new qo($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qo && Arrays.equals(this.c, ((qo)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   @Override
   public void a(ro $$0) {
      $$0.a(this);
   }

   public byte[] e() {
      return this.c;
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public qp a(int $$0) {
      return qp.a(this.c[$$0]);
   }

   public qp a(int $$0, qp $$1) {
      byte $$2 = this.c[$$0];
      this.c[$$0] = $$1.i();
      return qp.a($$2);
   }

   public void b(int $$0, qp $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.i());
   }

   @Override
   public boolean a(int $$0, rk $$1) {
      if ($$1 instanceof re) {
         this.c[$$0] = ((re)$$1).i();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, rk $$1) {
      if ($$1 instanceof re) {
         this.c = ArrayUtils.add(this.c, $$0, ((re)$$1).i());
         return true;
      } else {
         return false;
      }
   }

   public qp b(int $$0) {
      byte $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return qp.a($$1);
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
   public rh.b a(rh $$0) {
      return $$0.a(this.c);
   }
}
