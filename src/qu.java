import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qu extends re {
   private static final int c = 12;
   public static final qu a = new qu(0.0F);
   public static final rm<qu> b = new rm.a<qu>() {
      public qu a(DataInput $$0, int $$1, ra $$2) throws IOException {
         $$2.a(12L);
         return qu.a($$0.readFloat());
      }

      @Override
      public rh.b a(DataInput $$0, rh $$1) throws IOException {
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

   private qu(float $$0) {
      this.w = $$0;
   }

   public static qu a(float $$0) {
      return $$0 == 0.0F ? a : new qu($$0);
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
   public rm<qu> c() {
      return b;
   }

   public qu e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qu && this.w == ((qu)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(ro $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return apa.d(this.w);
   }

   @Override
   public short h() {
      return (short)(apa.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(apa.d(this.w) & 0xFF);
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
   public rh.b a(rh $$0) {
      return $$0.a(this.w);
   }
}
