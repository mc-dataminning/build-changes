import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ry extends sh {
   private static final int b = 12;
   public static final sp<ry> a = new sp.a<ry>() {
      public ry a(DataInput $$0, sc $$1) throws IOException {
         return ry.a(d($$0, $$1));
      }

      @Override
      public sk.b a(DataInput $$0, sk $$1, sc $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, sc $$1) throws IOException {
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

   ry(int $$0) {
      this.c = $$0;
   }

   public static ry a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? ry.a.a[$$0 - -128] : new ry($$0);
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
   public sp<ry> c() {
      return a;
   }

   public ry e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ry && this.c == ((ry)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(sr $$0) {
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
   public sk.b a(sk $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ry[] a = new ry[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ry(-128 + $$0);
         }
      }
   }
}
