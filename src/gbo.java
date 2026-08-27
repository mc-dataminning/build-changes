public class gbo extends gbb {
   public gbo(aov $$0, aox $$1, float $$2, float $$3, aru $$4, gu $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gbo a(aov $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gbo a(he<aov> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gbo a(aov $$0, float $$1, float $$2) {
      return new gbo($$0.a(), aox.a, $$2, $$1, gbt.t(), false, 0, gbt.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gbo a(aov $$0) {
      return new gbo($$0.a(), aox.b, 1.0F, 1.0F, gbt.t(), false, 0, gbt.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gbo a(aov $$0, ehe $$1) {
      return new gbo($$0, aox.c, 4.0F, 1.0F, gbt.t(), false, 0, gbt.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gbo b(aov $$0, float $$1, float $$2) {
      return new gbo($$0.a(), aox.i, $$2, $$1, gbt.t(), false, 0, gbt.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gbo b(aov $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gbo a(aov $$0, aru $$1, double $$2, double $$3, double $$4) {
      return new gbo($$0, aox.i, 1.0F, 1.0F, $$1, false, 0, gbt.a.b, $$2, $$3, $$4);
   }

   public gbo(aov $$0, aox $$1, float $$2, float $$3, aru $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gbt.a.b, $$5, $$6, $$7);
   }

   private gbo(aov $$0, aox $$1, float $$2, float $$3, aru $$4, boolean $$5, int $$6, gbt.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gbo(aer $$0, aox $$1, float $$2, float $$3, aru $$4, boolean $$5, int $$6, gbt.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
      super($$0, $$1, $$4);
      this.d = $$2;
      this.e = $$3;
      this.f = $$8;
      this.g = $$9;
      this.h = $$10;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$11;
   }
}
