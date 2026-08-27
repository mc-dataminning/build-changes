import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class so extends td {
   private static final int c = 16;
   public static final so a = new so(0.0);
   public static final tm<so> b = new tm.a<so>() {
      public so a(DataInput $$0, sw $$1) throws IOException {
         return so.a(d($$0, $$1));
      }

      @Override
      public th.b a(DataInput $$0, th $$1, sw $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, sw $$1) throws IOException {
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

   private so(double $$0) {
      this.w = $$0;
   }

   public static so a(double $$0) {
      return $$0 == 0.0 ? a : new so($$0);
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
   public tm<so> c() {
      return b;
   }

   public so e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof so && this.w == ((so)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(to $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return aun.a(this.w);
   }

   @Override
   public short h() {
      return (short)(aun.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(aun.a(this.w) & 0xFF);
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
   public th.b a(th $$0) {
      return $$0.a(this.w);
   }
}
