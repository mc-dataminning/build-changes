import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ri extends rh {
   private static final int b = 10;
   public static final rp<ri> a = new rp.a<ri>() {
      public ri a(DataInput $$0, int $$1, rd $$2) throws IOException {
         $$2.a(10L);
         return ri.a($$0.readShort());
      }

      @Override
      public rk.b a(DataInput $$0, rk $$1) throws IOException {
         return $$1.a($$0.readShort());
      }

      @Override
      public int c() {
         return 2;
      }

      @Override
      public String a() {
         return "SHORT";
      }

      @Override
      public String b() {
         return "TAG_Short";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final short c;

   ri(short $$0) {
      this.c = $$0;
   }

   public static ri a(short $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? ri.a.a[$$0 - -128] : new ri($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeShort(this.c);
   }

   @Override
   public int a() {
      return 10;
   }

   @Override
   public byte b() {
      return 2;
   }

   @Override
   public rp<ri> c() {
      return a;
   }

   public ri e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ri && this.c == ((ri)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(rr $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return (long)this.c;
   }

   @Override
   public int g() {
      return this.c;
   }

   @Override
   public short h() {
      return this.c;
   }

   @Override
   public byte i() {
      return (byte)(this.c & 255);
   }

   @Override
   public double j() {
      return (double)this.c;
   }

   @Override
   public float k() {
      return (float)this.c;
   }

   @Override
   public Number l() {
      return this.c;
   }

   @Override
   public rk.b a(rk $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ri[] a = new ri[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ri((short)(-128 + $$0));
         }
      }
   }
}
