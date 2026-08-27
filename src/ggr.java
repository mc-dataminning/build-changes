public class ggr extends gge {
   public ggr(arb $$0, ard $$1, float $$2, float $$3, auf $$4, hv $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static ggr a(arb $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static ggr a(ie<arb> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static ggr a(arb $$0, float $$1, float $$2) {
      return new ggr($$0.a(), ard.a, $$2, $$1, ggw.t(), false, 0, ggw.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ggr a(arb $$0) {
      return new ggr($$0.a(), ard.b, 1.0F, 1.0F, ggw.t(), false, 0, ggw.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ggr a(arb $$0, elb $$1) {
      return new ggr($$0, ard.c, 4.0F, 1.0F, ggw.t(), false, 0, ggw.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static ggr b(arb $$0, float $$1, float $$2) {
      return new ggr($$0.a(), ard.i, $$2, $$1, ggw.t(), false, 0, ggw.a.a, 0.0, 0.0, 0.0, true);
   }

   public static ggr b(arb $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static ggr a(arb $$0, auf $$1, double $$2, double $$3, double $$4) {
      return new ggr($$0, ard.i, 1.0F, 1.0F, $$1, false, 0, ggw.a.b, $$2, $$3, $$4);
   }

   public ggr(arb $$0, ard $$1, float $$2, float $$3, auf $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, ggw.a.b, $$5, $$6, $$7);
   }

   private ggr(arb $$0, ard $$1, float $$2, float $$3, auf $$4, boolean $$5, int $$6, ggw.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public ggr(agt $$0, ard $$1, float $$2, float $$3, auf $$4, boolean $$5, int $$6, ggw.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
