import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ur extends uz {
   private static final int b = 16;
   public static final vi<ur> a = new vi.a<ur>() {
      public ur a(DataInput $$0, us $$1) throws IOException {
         return ur.a(d($$0, $$1));
      }

      @Override
      public vd.b a(DataInput $$0, vd $$1, us $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long d(DataInput $$0, us $$1) throws IOException {
         $$1.b(16L);
         return $$0.readLong();
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "LONG";
      }

      @Override
      public String b() {
         return "TAG_Long";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private final long c;

   ur(long $$0) {
      this.c = $$0;
   }

   public static ur a(long $$0) {
      return $$0 >= -128L && $$0 <= 1024L ? ur.a.a[(int)$$0 - -128] : new ur($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeLong(this.c);
   }

   @Override
   public int a() {
      return 16;
   }

   @Override
   public byte b() {
      return 4;
   }

   @Override
   public vi<ur> c() {
      return a;
   }

   public ur e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ur && this.c == ((ur)$$0).c;
   }

   @Override
   public int hashCode() {
      return (int)(this.c ^ this.c >>> 32);
   }

   @Override
   public void a(vk $$0) {
      $$0.a(this);
   }

   @Override
   public long f() {
      return this.c;
   }

   @Override
   public int g() {
      return (int)(this.c & -1L);
   }

   @Override
   public short h() {
      return (short)((int)(this.c & 65535L));
   }

   @Override
   public byte i() {
      return (byte)((int)(this.c & 255L));
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
   public vd.b a(vd $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ur[] a = new ur[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ur((long)(-128 + $$0));
         }
      }
   }
}
