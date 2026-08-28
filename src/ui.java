import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ui(long b) implements uq {
   private static final int c = 16;
   public static final vc<ui> a = new vc.a<ui>() {
      public ui a(DataInput $$0, uj $$1) throws IOException {
         return ui.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long d(DataInput $$0, uj $$1) throws IOException {
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
   };

   @Deprecated(
      forRemoval = true
   )
   public ui(long b) {
      this.b = b;
   }

   public static ui a(long $$0) {
      return $$0 >= -128L && $$0 <= 1024L ? ui.a.a[(int)$$0 - -128] : new ui($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeLong(this.b);
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
   public vc<ui> c() {
      return a;
   }

   public ui e() {
      return this;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return this.b;
   }

   @Override
   public int h() {
      return (int)(this.b & -1L);
   }

   @Override
   public short i() {
      return (short)((int)(this.b & 65535L));
   }

   @Override
   public byte j() {
      return (byte)((int)(this.b & 255L));
   }

   @Override
   public double k() {
      return (double)this.b;
   }

   @Override
   public float l() {
      return (float)this.b;
   }

   @Override
   public Number m() {
      return this.b;
   }

   @Override
   public ux.b a(ux $$0) {
      return $$0.a(this.b);
   }

   @Override
   public String toString() {
      uz $$0 = new uz();
      $$0.a(this);
      return $$0.a();
   }

   public long n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ui[] a = new ui[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ui((long)(-128 + $$0));
         }
      }
   }
}
