import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uu extends vh {
   private static final int c = 12;
   public static final uu a = new uu(0.0F);
   public static final vq<uu> b = new vq.a<uu>() {
      public uu a(DataInput $$0, va $$1) throws IOException {
         return uu.a(d($$0, $$1));
      }

      @Override
      public vl.b a(DataInput $$0, vl $$1, va $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, va $$1) throws IOException {
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

   private uu(float $$0) {
      this.w = $$0;
   }

   public static uu a(float $$0) {
      return $$0 == 0.0F ? a : new uu($$0);
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
   public vq<uu> c() {
      return b;
   }

   public uu e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uu && this.w == ((uu)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(vs $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return ayy.d(this.w);
   }

   @Override
   public short h() {
      return (short)(ayy.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(ayy.d(this.w) & 0xFF);
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
   public vl.b a(vl $$0) {
      return $$0.a(this.w);
   }
}
