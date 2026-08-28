import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class tv extends ug {
   private static final int b = 12;
   public static final up<tv> a = new up.a<tv>() {
      public tv a(DataInput $$0, tz $$1) throws IOException {
         return tv.a(d($$0, $$1));
      }

      @Override
      public uk.b a(DataInput $$0, uk $$1, tz $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, tz $$1) throws IOException {
         $$1.b(12L);
         return $$0.readInt();
      }

      @Override
      public int c() {
         return 4;
      }

      @Override
      public String a() {
         return "INT";
      }

      @Override
      public String b() {
         return "TAG_Int";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final int c;

   tv(int $$0) {
      this.c = $$0;
   }

   public static tv a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? tv.a.a[$$0 - -128] : new tv($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c);
   }

   @Override
   public int a() {
      return 12;
   }

   @Override
   public byte b() {
      return 3;
   }

   @Override
   public up<tv> c() {
      return a;
   }

   public tv e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof tv && this.c == ((tv)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(ur $$0) {
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
      return (short)(this.c & 65535);
   }

   @Override
   public byte i() {
      return (byte)(this.c & 0xFF);
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
   public uk.b a(uk $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final tv[] a = new tv[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new tv(-128 + $$0);
         }
      }
   }
}
