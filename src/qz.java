import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qz extends rm {
   private static final int c = 16;
   public static final qz a = new qz(0.0);
   public static final ru<qz> b = new ru.a<qz>() {
      public qz a(DataInput $$0, rh $$1) throws IOException {
         return qz.a(d($$0, $$1));
      }

      @Override
      public rp.b a(DataInput $$0, rp $$1, rh $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, rh $$1) throws IOException {
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

   private qz(double $$0) {
      this.w = $$0;
   }

   public static qz a(double $$0) {
      return $$0 == 0.0 ? a : new qz($$0);
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
   public ru<qz> c() {
      return b;
   }

   public qz e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qz && this.w == ((qz)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(rw $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return ary.a(this.w);
   }

   @Override
   public short h() {
      return (short)(ary.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(ary.a(this.w) & 0xFF);
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
   public rp.b a(rp $$0) {
      return $$0.a(this.w);
   }
}
