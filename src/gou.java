import javax.annotation.Nullable;

public class gou implements got {
   public static final int a = 0;
   private final gou.b c = new gou.b();
   private final gou.b d = new gou.b();
   public final gou.a b;

   public gou(gou.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cuc $$0, @Nullable fyj $$1, @Nullable btb $$2, int $$3) {
      bsg $$4 = (bsg)($$2 != null ? $$2 : $$0.E());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cuc $$0, fyj $$1, int $$2, bsg $$3) {
      ji $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.Z();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return ayg.b((float)$$2, 1.0F);
   }

   private float a(bsg $$0, long $$1, ja $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof cmk $$5 && $$5.g() && $$5.dQ().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return ayg.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return ayg.b((float)$$7, 1.0F);
   }

   @Nullable
   private fyj a(bsg $$0, @Nullable fyj $$1) {
      return $$1 == null && $$0.dQ() instanceof fyj ? (fyj)$$0.dQ() : $$1;
   }

   private boolean a(bsg $$0, @Nullable ji $$1) {
      return $$1 != null && $$1.a() == $$0.dQ().af() && !($$1.b().b($$0.do()) < 1.0E-5F);
   }

   private double a(bsg $$0, ja $$1) {
      ewf $$2 = ewf.b($$1);
      return Math.atan2($$2.c() - $$0.dB(), $$2.a() - $$0.dv()) / (float) (Math.PI * 2);
   }

   private double a(bsg $$0) {
      return ayg.c((double)($$0.dH() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ji getPos(fyj var1, cuc var2, bsg var3);
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
         $$2 = ayg.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = ayg.c(this.a + this.b, 1.0);
      }
   }
}
