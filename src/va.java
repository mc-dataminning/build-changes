import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class va extends vn {
   private static final int c = 12;
   public static final va a = new va(0.0F);
   public static final vw<va> b = new vw.a<va>() {
      public va a(DataInput $$0, vg $$1) throws IOException {
         return va.a(d($$0, $$1));
      }

      @Override
      public vr.b a(DataInput $$0, vr $$1, vg $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, vg $$1) throws IOException {
         $$1.b(12L);
         return $$0.readFloat();
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

   private va(float $$0) {
      this.w = $$0;
   }

   public static va a(float $$0) {
      return $$0 == 0.0F ? a : new va($$0);
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
   public vw<va> c() {
      return b;
   }

   public va e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof va && this.w == ((va)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(vy $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return bae.d(this.w);
   }

   @Override
   public short h() {
      return (short)(bae.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(bae.d(this.w) & 0xFF);
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
   public vr.b a(vr $$0) {
      return $$0.a(this.w);
   }
}
