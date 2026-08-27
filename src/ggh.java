import javax.annotation.Nullable;

public class ggh implements ggg {
   public static final int a = 0;
   private final ggh.b c = new ggh.b();
   private final ggh.b d = new ggh.b();
   public final ggh.a b;

   public ggh(ggh.a $$0) {
      this.b = $$0;
   }

   @Override
   public float unclampedCall(cpd $$0, @Nullable fqe $$1, @Nullable boi $$2, int $$3) {
      bnq $$4 = (bnq)($$2 != null ? $$2 : $$0.I());
      if ($$4 == null) {
         return 0.0F;
      } else {
         $$1 = this.a($$4, $$1);
         return $$1 == null ? 0.0F : this.a($$0, $$1, $$3, $$4);
      }
   }

   private float a(cpd $$0, fqe $$1, int $$2, bnq $$3) {
      ii $$4 = this.b.getPos($$1, $$0, $$3);
      long $$5 = $$1.X();
      return !this.a($$3, $$4) ? this.a($$2, $$5) : this.a($$3, $$5, $$4.b());
   }

   private float a(int $$0, long $$1) {
      if (this.d.a($$1)) {
         this.d.a($$1, Math.random());
      }

      double $$2 = this.d.a + (double)((float)this.a($$0) / 2.1474836E9F);
      return awi.b((float)$$2, 1.0F);
   }

   private float a(bnq $$0, long $$1, hz $$2) {
      double $$3 = this.a($$0, $$2);
      double $$4 = this.a($$0);
      if ($$0 instanceof chl $$5 && $$5.g() && $$5.dM().s().i()) {
         if (this.c.a($$1)) {
            this.c.a($$1, 0.5 - ($$4 - 0.25));
         }

         double $$6 = $$3 + this.c.a;
         return awi.b((float)$$6, 1.0F);
      }

      double $$7 = 0.5 - ($$4 - 0.25 - $$3);
      return awi.b((float)$$7, 1.0F);
   }

   @Nullable
   private fqe a(bnq $$0, @Nullable fqe $$1) {
      return $$1 == null && $$0.dM() instanceof fqe ? (fqe)$$0.dM() : $$1;
   }

   private boolean a(bnq $$0, @Nullable ii $$1) {
      return $$1 != null && $$1.a() == $$0.dM().ad() && !($$1.b().b($$0.dk()) < 1.0E-5F);
   }

   private double a(bnq $$0, hz $$1) {
      enz $$2 = enz.b($$1);
      return Math.atan2($$2.c() - $$0.dx(), $$2.a() - $$0.dr()) / (float) (Math.PI * 2);
   }

   private double a(bnq $$0) {
      return awi.c((double)($$0.dD() / 360.0F), 1.0);
   }

   private int a(int $$0) {
      return $$0 * 1327217883;
   }

   public interface a {
      @Nullable
      ii getPos(fqe var1, cpd var2, bnq var3);
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
         $$2 = awi.c($$2 + 0.5, 1.0) - 0.5;
         this.b += $$2 * 0.1;
         this.b *= 0.8;
         this.a = awi.c(this.a + this.b, 1.0);
      }
   }
}
