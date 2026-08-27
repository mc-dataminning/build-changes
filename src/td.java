import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class td extends tq {
   private static final int c = 12;
   public static final td a = new td(0.0F);
   public static final tz<td> b = new tz.a<td>() {
      public td a(DataInput $$0, tj $$1) throws IOException {
         return td.a(d($$0, $$1));
      }

      @Override
      public tu.b a(DataInput $$0, tu $$1, tj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static float d(DataInput $$0, tj $$1) throws IOException {
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

   private td(float $$0) {
      this.w = $$0;
   }

   public static td a(float $$0) {
      return $$0 == 0.0F ? a : new td($$0);
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
   public tz<td> c() {
      return b;
   }

   public td e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof td && this.w == ((td)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(ub $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return aww.d(this.w);
   }

   @Override
   public short h() {
      return (short)(aww.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(aww.d(this.w) & 0xFF);
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
   public tu.b a(tu $$0) {
      return $$0.a(this.w);
   }
}
