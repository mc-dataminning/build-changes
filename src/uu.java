import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class uu extends vc {
   private static final int b = 16;
   public static final vl<uu> a = new vl.a<uu>() {
      public uu a(DataInput $$0, uv $$1) throws IOException {
         return uu.a(d($$0, $$1));
      }

      @Override
      public vg.b a(DataInput $$0, vg $$1, uv $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long d(DataInput $$0, uv $$1) throws IOException {
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

   uu(long $$0) {
      this.c = $$0;
   }

   public static uu a(long $$0) {
      return $$0 >= -128L && $$0 <= 1024L ? uu.a.a[(int)$$0 - -128] : new uu($$0);
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
   public vl<uu> c() {
      return a;
   }

   public uu e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uu && this.c == ((uu)$$0).c;
   }

   @Override
   public int hashCode() {
      return (int)(this.c ^ this.c >>> 32);
   }

   @Override
   public void a(vn $$0) {
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
   public vg.b a(vg $$0) {
      return $$0.a(this.c);
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final uu[] a = new uu[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new uu((long)(-128 + $$0));
         }
      }
   }
}
