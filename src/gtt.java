public class gtt extends gtg {
   public gtt(avo $$0, avq $$1, float $$2, float $$3, ayw $$4, jd $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gtt a(avo $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gtt a(jm<avo> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gtt a(avo $$0, float $$1, float $$2) {
      return new gtt($$0.a(), avq.a, $$2, $$1, gty.t(), false, 0, gty.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gtt a(avo $$0) {
      return new gtt($$0.a(), avq.b, 1.0F, 1.0F, gty.t(), false, 0, gty.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gtt a(avo $$0, exa $$1) {
      return new gtt($$0, avq.c, 4.0F, 1.0F, gty.t(), false, 0, gty.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gtt b(avo $$0, float $$1, float $$2) {
      return new gtt($$0.a(), avq.i, $$2, $$1, gty.t(), false, 0, gty.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gtt b(avo $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gtt a(avo $$0, ayw $$1, double $$2, double $$3, double $$4) {
      return new gtt($$0, avq.i, 1.0F, 1.0F, $$1, false, 0, gty.a.b, $$2, $$3, $$4);
   }

   public gtt(avo $$0, avq $$1, float $$2, float $$3, ayw $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gty.a.b, $$5, $$6, $$7);
   }

   private gtt(avo $$0, avq $$1, float $$2, float $$3, ayw $$4, boolean $$5, int $$6, gty.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gtt(akr $$0, avq $$1, float $$2, float $$3, ayw $$4, boolean $$5, int $$6, gty.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
