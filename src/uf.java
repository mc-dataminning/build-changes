import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record uf(int b) implements uq {
   private static final int c = 12;
   public static final vc<uf> a = new vc.a<uf>() {
      public uf a(DataInput $$0, uj $$1) throws IOException {
         return uf.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int d(DataInput $$0, uj $$1) throws IOException {
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
   };

   @Deprecated(
      forRemoval = true
   )
   public uf(int b) {
      this.b = b;
   }

   public static uf a(int $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? uf.a.a[$$0 - -128] : new uf($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.b);
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
   public vc<uf> c() {
      return a;
   }

   public uf e() {
      return this;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)this.b;
   }

   @Override
   public int h() {
      return this.b;
   }

   @Override
   public short i() {
      return (short)(this.b & 65535);
   }

   @Override
   public byte j() {
      return (byte)(this.b & 0xFF);
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

   public int n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final uf[] a = new uf[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new uf(-128 + $$0);
         }
      }
   }
}
