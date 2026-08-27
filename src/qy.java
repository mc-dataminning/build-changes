import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qy extends rk {
   private static final int c = 16;
   public static final qy a = new qy(0.0);
   public static final rs<qy> b = new rs.a<qy>() {
      public qy a(DataInput $$0, int $$1, rg $$2) throws IOException {
         $$2.a(16L);
         return qy.a($$0.readDouble());
      }

      @Override
      public rn.b a(DataInput $$0, rn $$1) throws IOException {
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

   private qy(double $$0) {
      this.w = $$0;
   }

   public static qy a(double $$0) {
      return $$0 == 0.0 ? a : new qy($$0);
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
   public rs<qy> c() {
      return b;
   }

   public qy e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qy && this.w == ((qy)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(ru $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return arx.a(this.w);
   }

   @Override
   public short h() {
      return (short)(arx.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(arx.a(this.w) & 0xFF);
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
   public rn.b a(rn $$0) {
      return $$0.a(this.w);
   }
}
