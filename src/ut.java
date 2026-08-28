import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ut extends vi {
   private static final int c = 16;
   public static final ut a = new ut(0.0);
   public static final vr<ut> b = new vr.a<ut>() {
      public ut a(DataInput $$0, vb $$1) throws IOException {
         return ut.a(d($$0, $$1));
      }

      @Override
      public vm.b a(DataInput $$0, vm $$1, vb $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, vb $$1) throws IOException {
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

   private ut(double $$0) {
      this.w = $$0;
   }

   public static ut a(double $$0) {
      return $$0 == 0.0 ? a : new ut($$0);
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
   public vr<ut> c() {
      return b;
   }

   public ut e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ut && this.w == ((ut)$$0).w;
   }

   @Override
   public int hashCode() {
      long $$0 = Double.doubleToLongBits(this.w);
      return (int)($$0 ^ $$0 >>> 32);
   }

   @Override
   public void a(vt $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)Math.floor(this.w);
   }

   @Override
   public int g() {
      return ayz.a(this.w);
   }

   @Override
   public short h() {
      return (short)(ayz.a(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(ayz.a(this.w) & 0xFF);
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
   public vm.b a(vm $$0) {
      return $$0.a(this.w);
   }
}
