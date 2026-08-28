import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ut(short b) implements uq {
   private static final int c = 10;
   public static final vc<ut> a = new vc.a<ut>() {
      public ut a(DataInput $$0, uj $$1) throws IOException {
         return ut.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static short d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(10L);
         return $$0.readShort();
      }

      @Override
      public int c() {
         return 2;
      }

      @Override
      public String a() {
         return "SHORT";
      }

      @Override
      public String b() {
         return "TAG_Short";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public ut(short b) {
      this.b = b;
   }

   public static ut a(short $$0) {
      return $$0 >= -128 && $$0 <= 1024 ? ut.a.a[$$0 - -128] : new ut($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeShort(this.b);
   }

   @Override
   public int a() {
      return 10;
   }

   @Override
   public byte b() {
      return 2;
   }

   @Override
   public vc<ut> c() {
      return a;
   }

   public ut e() {
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
      return this.b;
   }

   @Override
   public byte j() {
      return (byte)(this.b & 255);
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

   public short n() {
      return this.b;
   }

   static class a {
      private static final int b = 1024;
      private static final int c = -128;
      static final ut[] a = new ut[1153];

      private a() {
      }

      static {
         for (int $$0 = 0; $$0 < a.length; $$0++) {
            a[$$0] = new ut((short)(-128 + $$0));
         }
      }
   }
}
