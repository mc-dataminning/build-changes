import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class us extends vh {
   private static final int c = 16;
   public static final us a = new us(0.0);
   public static final vq<us> b = new vq.a<us>() {
      public us a(DataInput $$0, va $$1) throws IOException {
         return us.a(d($$0, $$1));
      }

      @Override
      public vl.b a(DataInput $$0, vl $$1, va $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, va $$1) throws IOException {
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

   private us(double $$0) {
      this.w = $$0;
   }

   public static us a(double $$0) {
      return $$0 == 0.0 ? a : new us($$0);
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
   public vq<us> c() {
      return b;
   }

   public us e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof us && this.w == ((us)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(vs $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return ayy.a(this.w);
   }

   @Override
   public short h() {
      return (short)(ayy.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(ayy.a(this.w) & 0xFF);
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
   public vl.b a(vl $$0) {
      return $$0.a(this.w);
   }
}
