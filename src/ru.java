import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ru extends sh {
   private static final int c = 16;
   public static final ru a = new ru(0.0);
   public static final sp<ru> b = new sp.a<ru>() {
      public ru a(DataInput $$0, sc $$1) throws IOException {
         return ru.a(d($$0, $$1));
      }

      @Override
      public sk.b a(DataInput $$0, sk $$1, sc $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, sc $$1) throws IOException {
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

   private ru(double $$0) {
      this.w = $$0;
   }

   public static ru a(double $$0) {
      return $$0 == 0.0 ? a : new ru($$0);
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
   public sp<ru> c() {
      return b;
   }

   public ru e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ru && this.w == ((ru)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(sr $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return asy.a(this.w);
   }

   @Override
   public short h() {
      return (short)(asy.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(asy.a(this.w) & 0xFF);
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
   public sk.b a(sk $$0) {
      return $$0.a(this.w);
   }
}
