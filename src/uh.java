import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record uh(long b) implements up {
   private static final int c = 16;
   public static final va<uh> a = new va.a<uh>() {
      public uh a(DataInput $$0, ui $$1) throws IOException {
         return uh.a(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static long d(DataInput $$0, ui $$1) throws IOException {
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
   public uh(long b) {
      this.b = b;
   }

   public static uh a(long $$0) {
      return $$0 >= -128L && $$0 <= 1024L ? uh.a.a[(int)$$0 - -128] : new uh($$0);
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
   public va<uh> c() {
      return a;
   }

   public uh e() {
      return this;
   }

   @Override
   public void a(vc $$0) {
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
   public uv.b a(uv $$0) {
      return $$0.a(this.b);
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public long n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final uh[] a = new uh[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new uh((long)(-128 + $$0));
         }
      }
   }
}
