import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class ra extends rf {
   private static final int b = 16;
   public static final rn<ra> a = new rn.a<ra>() {
      public ra a(DataInput $$0, int $$1, rb $$2) throws IOException {
         $$2.a(16L);
         return ra.a($$0.readLong());
      }

      @Override
      public ri.b a(DataInput $$0, ri $$1) throws IOException {
         return $$1.a($$0.readLong());
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

   ra(long $$0) {
      this.c = $$0;
   }

   public static ra a(long $$0) {
      return $$0 >= -128L && $$0 <= 1024L ? ra.a.a[(int)$$0 - -128] : new ra($$0);
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
   public rn<ra> c() {
      return a;
   }

   public ra e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ra && this.c == ((ra)$$0).c;
   }

   @Override
   public int hashCode() {
      return (int)(this.c ^ this.c >>> 32);
   }

   @Override
   public void a(rp $$0) {
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
   public ri.b a(ri $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ra[] a = new ra[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ra((long)(-128 + $$0));
         }
      }
   }
}
