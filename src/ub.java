import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public record ub(double c) implements uq {
   private static final int v = 16;
   public static final ub a = new ub(0.0);
   public static final vc<ub> b = new vc.a<ub>() {
      public ub a(DataInput $$0, uj $$1) throws IOException {
         return ub.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static double d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(16L);
         return $$0.readDouble();
      }

      @Override
      public int c() {
         return 8;
      }

      @Override
      public String a() {
         return "DOUBLE";
      }

      @Override
      public String b() {
         return "TAG_Double";
      }
   };

   @Deprecated(
      forRemoval = true
   )
   public ub(double c) {
      this.c = c;
   }

   public static ub a(double $$0) {
      return $$0 == 0.0 ? a : new ub($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeDouble(this.c);
   }

   @Override
   public int a() {
      return 16;
   }

   @Override
   public byte b() {
      return 6;
   }

   @Override
   public vc<ub> c() {
      return b;
   }

   public ub e() {
      return this;
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   @Override
   public long g() {
      return (long)Math.floor(this.c);
   }

   @Override
   public int h() {
      return azq.a(this.c);
   }

   @Override
   public short i() {
      return (short)(azq.a(this.c) & 65535);
   }

   @Override
   public byte j() {
      return (byte)(azq.a(this.c) & 0xFF);
   }

   @Override
   public double k() {
      return this.c;
   }

   @Override
   public float l() {
      return (float)this.c;
   }

   @Override
   public Number m() {
      return this.c;
   }

   @Override
   public ux.b a(ux $$0) {
      return $$0.a(this.c);
   }

   @Override
   public String toString() {
      uz $$0 = new uz();
      $$0.a(this);
      return $$0.a();
   }

   public double n() {
      return this.c;
   }
}
