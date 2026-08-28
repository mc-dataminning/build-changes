import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class um extends vb {
   private static final int c = 16;
   public static final um a = new um(0.0);
   public static final vk<um> b = new vk.a<um>() {
      public um a(DataInput $$0, uu $$1) throws IOException {
         return um.a(d($$0, $$1));
      }

      @Override
      public vf.b a(DataInput $$0, vf $$1, uu $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, uu $$1) throws IOException {
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

   private um(double $$0) {
      this.w = $$0;
   }

   public static um a(double $$0) {
      return $$0 == 0.0 ? a : new um($$0);
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
   public vk<um> c() {
      return b;
   }

   public um e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof um && this.w == ((um)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(vm $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return azm.a(this.w);
   }

   @Override
   public short h() {
      return (short)(azm.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(azm.a(this.w) & 0xFF);
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
   public vf.b a(vf $$0) {
      return $$0.a(this.w);
   }
}
