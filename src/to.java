import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class to extends ug {
   private static final int w = 9;
   public static final up<to> a = new up.a<to>() {
      public to a(DataInput $$0, tz $$1) throws IOException {
         return to.a(d($$0, $$1));
      }

      @Override
      public uk.b a(DataInput $$0, uk $$1, tz $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static byte d(DataInput $$0, tz $$1) throws IOException {
         $$1.b(9L);
         return $$0.readByte();
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
   public static final to b = a((byte)0);
   public static final to c = a((byte)1);
   private final byte x;

   to(byte $$0) {
      this.x = $$0;
   }

   public static to a(byte $$0) {
      return to.a.a[128 + $$0];
   }

   public static to a(boolean $$0) {
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
   public up<to> c() {
      return a;
   }

   public to e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof to && this.x == ((to)$$0).x;
   }

   @Override
   public int hashCode() {
      return this.x;
   }

   @Override
   public void a(ur $$0) {
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
   public uk.b a(uk $$0) {
      return $$0.a(this.x);
   }

   static class a {
      static final to[] a = new to[256];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new to((byte)($$0 - 128));
         }
      }
   }
}
