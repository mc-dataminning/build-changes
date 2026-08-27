import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class sk extends sz {
   private static final int c = 16;
   public static final sk a = new sk(0.0);
   public static final ti<sk> b = new ti.a<sk>() {
      public sk a(DataInput $$0, ss $$1) throws IOException {
         return sk.a(d($$0, $$1));
      }

      @Override
      public td.b a(DataInput $$0, td $$1, ss $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, ss $$1) throws IOException {
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

   private sk(double $$0) {
      this.w = $$0;
   }

   public static sk a(double $$0) {
      return $$0 == 0.0 ? a : new sk($$0);
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
   public ti<sk> c() {
      return b;
   }

   public sk e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof sk && this.w == ((sk)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(tk $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return aty.a(this.w);
   }

   @Override
   public short h() {
      return (short)(aty.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(aty.a(this.w) & 0xFF);
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
   public td.b a(td $$0) {
      return $$0.a(this.w);
   }
}
