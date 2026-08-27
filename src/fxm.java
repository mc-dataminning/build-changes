import javax.annotation.Nullable;

public class fxm implements fxl {
   public static final int a = 0;
   private final fxm.b c = new fxm.b();
   private final fxm.b d = new fxm.b();
   public final fxm.a b;

   public fxm(fxm.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(ciw $$0, @Nullable fie $$1, @Nullable biw $$2, int $$3) {
      big $$4 = (big)($$2 != null ? $$2 : $$0.H());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(ciw $$0, fie $$1, int $$2, big $$3) {
      he $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.V();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return aro.b((float)$$2, 1.0F);
   }

   private float a(big $$0, long $$1, gv $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cbl $$5 && $$5.g()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return aro.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return aro.b((float)$$7, 1.0F);
   }

   @Nullable
   private fie a(big $$0, @Nullable fie $$1) {
      return $$1 == null && $$0.dK() instanceof fie ? (fie)$$0.dK() : $$1;
   }

   private boolean a(big $$0, @Nullable he $$1) {
      return $$1 != null && $$1.a() == $$0.dK().ac() && !($$1.b().b($$0.di()) < 1.0E-5F);
   }

   private double a(big $$0, gv $$1) {
      ehf $$2 = ehf.b($$1);
      return Math.atan2($$2.c() - $$0.dv(), $$2.a() - $$0.dp()) / (float) (Math.PI * 2);
   }

   private double a(big $$0) {
      return aro.c((double)($$0.dB() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      he getPos(fie var1, ciw var2, big var3);
   }

   static class b {
      double a;
      private double b;
      private long c;

      boolean a(long $$0) {
         return this.c != $$0;
      }

      void a(long $$0, double $$1) {
         this.c = $$0;
         double $$2 = $$1 - this.a;
         $$2 = aro.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = aro.c(this.a + this.b, 1.0);
      }
   }
}
