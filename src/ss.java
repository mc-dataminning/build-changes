import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ss extends td {
   private static final int b = 12;
   public static final tm<ss> a = new tm.a<ss>() {
      public ss a(DataInput $$0, sw $$1) throws IOException {
         return ss.a(d($$0, $$1));
      }

      @Override
      public th.b a(DataInput $$0, th $$1, sw $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, sw $$1) throws IOException {
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

   ss(int $$0) {
      this.c = $$0;
   }

   public static ss a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? ss.a.a[$$0 - -128] : new ss($$0);
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
   public tm<ss> c() {
      return a;
   }

   public ss e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ss && this.c == ((ss)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(to $$0) {
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
   public th.b a(th $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ss[] a = new ss[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ss(-128 + $$0);
         }
      }
   }
}
