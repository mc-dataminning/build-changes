import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ul extends va {
   private static final int c = 16;
   public static final ul a = new ul(0.0);
   public static final vj<ul> b = new vj.a<ul>() {
      public ul a(DataInput $$0, ut $$1) throws IOException {
         return ul.a(d($$0, $$1));
      }

      @Override
      public ve.b a(DataInput $$0, ve $$1, ut $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, ut $$1) throws IOException {
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

   private ul(double $$0) {
      this.w = $$0;
   }

   public static ul a(double $$0) {
      return $$0 == 0.0 ? a : new ul($$0);
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
   public vj<ul> c() {
      return b;
   }

   public ul e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ul && this.w == ((ul)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(vl $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return azk.a(this.w);
   }

   @Override
   public short h() {
      return (short)(azk.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(azk.a(this.w) & 0xFF);
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
   public ve.b a(ve $$0) {
      return $$0.a(this.w);
   }
}
