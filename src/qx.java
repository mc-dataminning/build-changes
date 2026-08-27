import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qx extends rh {
   private static final int c = 12;
   public static final qx a = new qx(0.0F);
   public static final rp<qx> b = new rp.a<qx>() {
      public qx a(DataInput $$0, int $$1, rd $$2) throws IOException {
         $$2.a(12L);
         return qx.a($$0.readFloat());
      }

      @Override
      public rk.b a(DataInput $$0, rk $$1) throws IOException {
         return $$1.a($$0.readFloat());
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "FLOAT";
      }

      @Override
      public String b() {
         return "TAG_Float";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final float w;

   private qx(float $$0) {
      this.w = $$0;
   }

   public static qx a(float $$0) {
      return $$0 == 0.0F ? a : new qx($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeFloat(this.w);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 5;
   }

   @Override
   public rp<qx> c() {
      return b;
   }

   public qx e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qx && this.w == ((qx)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(rr $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return ars.d(this.w);
   }

   @Override
   public short h() {
      return (short)(ars.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(ars.d(this.w) & 0xFF);
   }

   @Override
   public double j() {
      return (double)this.w;
   }

   @Override
   public float k() {
      return this.w;
   }

   @Override
   public Number l() {
      return this.w;
   }

   @Override
   public rk.b a(rk $$0) {
      return $$0.a(this.w);
   }
}
