import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sz extends to {
   private static final int c = 16;
   public static final sz a = new sz(0.0);
   public static final tx<sz> b = new tx.a<sz>() {
      public sz a(DataInput $$0, th $$1) throws IOException {
         return sz.a(d($$0, $$1));
      }

      @Override
      public ts.b a(DataInput $$0, ts $$1, th $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, th $$1) throws IOException {
         $$1.b(16L);
         return $$0.readDouble();
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

   private sz(double $$0) {
      this.w = $$0;
   }

   public static sz a(double $$0) {
      return $$0 == 0.0 ? a : new sz($$0);
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
   public tx<sz> c() {
      return b;
   }

   public sz e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof sz && this.w == ((sz)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(tz $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return awm.a(this.w);
   }

   @Override
   public short h() {
      return (short)(awm.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(awm.a(this.w) & 0xFF);
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
   public ts.b a(ts $$0) {
      return $$0.a(this.w);
   }
}
