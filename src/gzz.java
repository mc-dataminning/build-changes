public class gzz extends gzm {
   public gzz(awc $$0, awe $$1, float $$2, float $$3, azk $$4, je $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gzz a(awc $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gzz a(jn<awc> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gzz a(awc $$0, float $$1, float $$2) {
      return new gzz($$0.a(), awe.a, $$2, $$1, hae.t(), false, 0, hae.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gzz a(awc $$0) {
      return new gzz($$0.a(), awe.b, 1.0F, 1.0F, hae.t(), false, 0, hae.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gzz a(awc $$0, eye $$1) {
      return new gzz($$0, awe.c, 4.0F, 1.0F, hae.t(), false, 0, hae.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static gzz b(awc $$0, float $$1, float $$2) {
      return new gzz($$0.a(), awe.i, $$2, $$1, hae.t(), false, 0, hae.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gzz b(awc $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gzz a(awc $$0, azk $$1, double $$2, double $$3, double $$4) {
      return new gzz($$0, awe.i, 1.0F, 1.0F, $$1, false, 0, hae.a.b, $$2, $$3, $$4);
   }

   public gzz(awc $$0, awe $$1, float $$2, float $$3, azk $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hae.a.b, $$5, $$6, $$7);
   }

   private gzz(awc $$0, awe $$1, float $$2, float $$3, azk $$4, boolean $$5, int $$6, hae.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gzz(alb $$0, awe $$1, float $$2, float $$3, azk $$4, boolean $$5, int $$6, hae.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
