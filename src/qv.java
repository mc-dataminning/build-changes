import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qv extends rh {
   private static final int c = 16;
   public static final qv a = new qv(0.0);
   public static final rp<qv> b = new rp.a<qv>() {
      public qv a(DataInput $$0, int $$1, rd $$2) throws IOException {
         $$2.a(16L);
         return qv.a($$0.readDouble());
      }

      @Override
      public rk.b a(DataInput $$0, rk $$1) throws IOException {
         return $$1.a($$0.readDouble());
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "DOUBLE";
      }

      @Override
      public String b() {
         return "TAG_Double";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final double w;

   private qv(double $$0) {
      this.w = $$0;
   }

   public static qv a(double $$0) {
      return $$0 == 0.0 ? a : new qv($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeDouble(this.w);
   }

   @Override
   public int a() {
      return 16;
   }

   @Override
   public byte b() {
      return 6;
   }

   @Override
   public rp<qv> c() {
      return b;
   }

   public qv e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qv && this.w == ((qv)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(rr $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return ars.a(this.w);
   }

   @Override
   public short h() {
      return (short)(ars.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(ars.a(this.w) & 0xFF);
   }

   @Override
   public double j() {
      return this.w;
   }

   @Override
   public float k() {
      return (float)this.w;
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
