import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class rb extends rl {
   private static final int c = 12;
   public static final rb a = new rb(0.0F);
   public static final rt<rb> b = new rt.a<rb>() {
      public rb a(DataInput $$0, int $$1, rh $$2) throws IOException {
         $$2.a(12L);
         return rb.a($$0.readFloat());
      }

      @Override
      public ro.b a(DataInput $$0, ro $$1) throws IOException {
         return $$1.a($$0.readFloat());
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "FLOAT";
      }

      @Override
      public String b() {
         return "TAG_Float";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final float w;

   private rb(float $$0) {
      this.w = $$0;
   }

   public static rb a(float $$0) {
      return $$0 == 0.0F ? a : new rb($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeFloat(this.w);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 5;
   }

   @Override
   public rt<rb> c() {
      return b;
   }

   public rb e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof rb && this.w == ((rb)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(rv $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return arx.d(this.w);
   }

   @Override
   public short h() {
      return (short)(arx.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(arx.d(this.w) & 0xFF);
   }

   @Override
   public double j() {
      return (double)this.w;
   }

   @Override
   public float k() {
      return this.w;
   }

   @Override
   public Number l() {
      return this.w;
   }

   @Override
   public ro.b a(ro $$0) {
      return $$0.a(this.w);
   }
}
