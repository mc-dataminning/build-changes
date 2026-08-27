public class gdd extends gcq {
   public gdd(aqc $$0, aqe $$1, float $$2, float $$3, ate $$4, ht $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gdd a(aqc $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gdd a(ib<aqc> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gdd a(aqc $$0, float $$1, float $$2) {
      return new gdd($$0.a(), aqe.a, $$2, $$1, gdi.t(), false, 0, gdi.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gdd a(aqc $$0) {
      return new gdd($$0.a(), aqe.b, 1.0F, 1.0F, gdi.t(), false, 0, gdi.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gdd a(aqc $$0, eif $$1) {
      return new gdd($$0, aqe.c, 4.0F, 1.0F, gdi.t(), false, 0, gdi.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gdd b(aqc $$0, float $$1, float $$2) {
      return new gdd($$0.a(), aqe.i, $$2, $$1, gdi.t(), false, 0, gdi.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gdd b(aqc $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gdd a(aqc $$0, ate $$1, double $$2, double $$3, double $$4) {
      return new gdd($$0, aqe.i, 1.0F, 1.0F, $$1, false, 0, gdi.a.b, $$2, $$3, $$4);
   }

   public gdd(aqc $$0, aqe $$1, float $$2, float $$3, ate $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gdi.a.b, $$5, $$6, $$7);
   }

   private gdd(aqc $$0, aqe $$1, float $$2, float $$3, ate $$4, boolean $$5, int $$6, gdi.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gdd(afw $$0, aqe $$1, float $$2, float $$3, ate $$4, boolean $$5, int $$6, gdi.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
