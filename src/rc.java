import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class rc extends rk {
   private static final int b = 12;
   public static final rs<rc> a = new rs.a<rc>() {
      public rc a(DataInput $$0, int $$1, rg $$2) throws IOException {
         $$2.a(12L);
         return rc.a($$0.readInt());
      }

      @Override
      public rn.b a(DataInput $$0, rn $$1) throws IOException {
         return $$1.a($$0.readInt());
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

   rc(int $$0) {
      this.c = $$0;
   }

   public static rc a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? rc.a.a[$$0 - -128] : new rc($$0);
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
   public rs<rc> c() {
      return a;
   }

   public rc e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof rc && this.c == ((rc)$$0).c;
   }

   @Override
   public int hashCode() {
      return this.c;
   }

   @Override
   public void a(ru $$0) {
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
   public rn.b a(rn $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final rc[] a = new rc[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new rc(-128 + $$0);
         }
      }
   }
}
