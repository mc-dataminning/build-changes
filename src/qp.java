import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qp extends re {
   private static final int w = 9;
   public static final rm<qp> a = new rm.a<qp>() {
      public qp a(DataInput $$0, int $$1, ra $$2) throws IOException {
         $$2.a(9L);
         return qp.a($$0.readByte());
      }

      @Override
      public rh.b a(DataInput $$0, rh $$1) throws IOException {
         return $$1.a($$0.readByte());
      }

      @Override
      public int c() {
         return 1;
      }

      @Override
      public String a() {
         return "BYTE";
      }

      @Override
      public String b() {
         return "TAG_Byte";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   public static final qp b = a((byte)0);
   public static final qp c = a((byte)1);
   private final byte x;

   qp(byte $$0) {
      this.x = $$0;
   }

   public static qp a(byte $$0) {
      return qp.a.a[128 + $$0];
   }

   public static qp a(boolean $$0) {
      return $$0 ? c : b;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeByte(this.x);
   }

   @Override
   public int a() {
      return 9;
   }

   @Override
   public byte b() {
      return 1;
   }

   @Override
   public rm<qp> c() {
      return a;
   }

   public qp e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qp && this.x == ((qp)$$0).x;
   }

   @Override
   public int hashCode() {
      return this.x;
   }

   @Override
   public void a(ro $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.x;
   }

   @Override
   public int g() {
      return this.x;
   }

   @Override
   public short h() {
      return (short)this.x;
   }

   @Override
   public byte i() {
      return this.x;
   }

   @Override
   public double j() {
      return (double)this.x;
   }

   @Override
   public float k() {
      return (float)this.x;
   }

   @Override
   public Number l() {
      return this.x;
   }

   @Override
   public rh.b a(rh $$0) {
      return $$0.a(this.x);
   }

   static class a {
      static final qp[] a = new qp[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new qp((byte)($$0 - 128));
         }
      }
   }
}
