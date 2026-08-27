import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class qq extends rf {
   private static final int w = 9;
   public static final rn<qq> a = new rn.a<qq>() {
      public qq a(DataInput $$0, int $$1, rb $$2) throws IOException {
         $$2.a(9L);
         return qq.a($$0.readByte());
      }

      @Override
      public ri.b a(DataInput $$0, ri $$1) throws IOException {
         return $$1.a($$0.readByte());
      }

      @Override
      public int c() {
         return 1;
      }

      @Override
      public String a() {
         return "BYTE";
      }

      @Override
      public String b() {
         return "TAG_Byte";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   public static final qq b = a((byte)0);
   public static final qq c = a((byte)1);
   private final byte x;

   qq(byte $$0) {
      this.x = $$0;
   }

   public static qq a(byte $$0) {
      return qq.a.a[128 + $$0];
   }

   public static qq a(boolean $$0) {
      return $$0 ? c : b;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeByte(this.x);
   }

   @Override
   public int a() {
      return 9;
   }

   @Override
   public byte b() {
      return 1;
   }

   @Override
   public rn<qq> c() {
      return a;
   }

   public qq e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof qq && this.x == ((qq)$$0).x;
   }

   @Override
   public int hashCode() {
      return this.x;
   }

   @Override
   public void a(rp $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.x;
   }

   @Override
   public int g() {
      return this.x;
   }

   @Override
   public short h() {
      return (short)this.x;
   }

   @Override
   public byte i() {
      return this.x;
   }

   @Override
   public double j() {
      return (double)this.x;
   }

   @Override
   public float k() {
      return (float)this.x;
   }

   @Override
   public Number l() {
      return this.x;
   }

   @Override
   public ri.b a(ri $$0) {
      return $$0.a(this.x);
   }

   static class a {
      static final qq[] a = new qq[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new qq((byte)($$0 - 128));
         }
      }
   }
}
