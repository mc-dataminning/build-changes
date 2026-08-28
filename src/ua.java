import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ua extends un {
   private static final int c = 12;
   public static final ua a = new ua(0.0F);
   public static final uw<ua> b = new uw.a<ua>() {
      public ua a(DataInput $$0, ug $$1) throws IOException {
         return ua.a(d($$0, $$1));
      }

      @Override
      public ur.b a(DataInput $$0, ur $$1, ug $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, ug $$1) throws IOException {
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

   private ua(float $$0) {
      this.w = $$0;
   }

   public static ua a(float $$0) {
      return $$0 == 0.0F ? a : new ua($$0);
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
   public uw<ua> c() {
      return b;
   }

   public ua e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ua && this.w == ((ua)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(uy $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return azk.d(this.w);
   }

   @Override
   public short h() {
      return (short)(azk.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(azk.d(this.w) & 0xFF);
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
   public ur.b a(ur $$0) {
      return $$0.a(this.w);
   }
}
