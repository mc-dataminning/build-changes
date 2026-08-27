import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sa extends sp {
   private static final int c = 16;
   public static final sa a = new sa(0.0);
   public static final sy<sa> b = new sy.a<sa>() {
      public sa a(DataInput $$0, si $$1) throws IOException {
         return sa.a(d($$0, $$1));
      }

      @Override
      public st.b a(DataInput $$0, st $$1, si $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, si $$1) throws IOException {
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

   private sa(double $$0) {
      this.w = $$0;
   }

   public static sa a(double $$0) {
      return $$0 == 0.0 ? a : new sa($$0);
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
   public sy<sa> c() {
      return b;
   }

   public sa e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof sa && this.w == ((sa)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(ta $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return atm.a(this.w);
   }

   @Override
   public short h() {
      return (short)(atm.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(atm.a(this.w) & 0xFF);
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
   public st.b a(st $$0) {
      return $$0.a(this.w);
   }
}
