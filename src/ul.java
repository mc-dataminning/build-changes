import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ul extends uw {
   private static final int b = 12;
   public static final vf<ul> a = new vf.a<ul>() {
      public ul a(DataInput $$0, up $$1) throws IOException {
         return ul.a(d($$0, $$1));
      }

      @Override
      public va.b a(DataInput $$0, va $$1, up $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, up $$1) throws IOException {
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

   ul(int $$0) {
      this.c = $$0;
   }

   public static ul a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? ul.a.a[$$0 - -128] : new ul($$0);
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
   public vf<ul> c() {
      return a;
   }

   public ul e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ul && this.c == ((ul)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(vh $$0) {
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
   public va.b a(va $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ul[] a = new ul[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ul(-128 + $$0);
         }
      }
   }
}
