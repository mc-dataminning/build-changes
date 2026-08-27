import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qv extends rf {
   private static final int c = 12;
   public static final qv a = new qv(0.0F);
   public static final rn<qv> b = new rn.a<qv>() {
      public qv a(DataInput $$0, int $$1, rb $$2) throws IOException {
         $$2.a(12L);
         return qv.a($$0.readFloat());
      }

      @Override
      public ri.b a(DataInput $$0, ri $$1) throws IOException {
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

   private qv(float $$0) {
      this.w = $$0;
   }

   public static qv a(float $$0) {
      return $$0 == 0.0F ? a : new qv($$0);
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
   public rn<qv> c() {
      return b;
   }

   public qv e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qv && this.w == ((qv)$$0).w;
   }

   @Override
   public int hashCode() {
      return Float.floatToIntBits(this.w);
   }

   @Override
   public void a(rp $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.w;
   }

   @Override
   public int g() {
      return aro.d(this.w);
   }

   @Override
   public short h() {
      return (short)(aro.d(this.w) & 65535);
   }

   @Override
   public byte i() {
      return (byte)(aro.d(this.w) & 0xFF);
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
   public ri.b a(ri $$0) {
      return $$0.a(this.w);
   }
}
