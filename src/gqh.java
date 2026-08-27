public class gqh extends gpu {
   public gqh(avb $$0, avd $$1, float $$2, float $$3, ayg $$4, in $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gqh a(avb $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gqh a(iw<avb> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gqh a(avb $$0, float $$1, float $$2) {
      return new gqh($$0.a(), avd.a, $$2, $$1, gqm.t(), false, 0, gqm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gqh a(avb $$0) {
      return new gqh($$0.a(), avd.b, 1.0F, 1.0F, gqm.t(), false, 0, gqm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gqh a(avb $$0, etp $$1) {
      return new gqh($$0, avd.c, 4.0F, 1.0F, gqm.t(), false, 0, gqm.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gqh b(avb $$0, float $$1, float $$2) {
      return new gqh($$0.a(), avd.i, $$2, $$1, gqm.t(), false, 0, gqm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gqh b(avb $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gqh a(avb $$0, ayg $$1, double $$2, double $$3, double $$4) {
      return new gqh($$0, avd.i, 1.0F, 1.0F, $$1, false, 0, gqm.a.b, $$2, $$3, $$4);
   }

   public gqh(avb $$0, avd $$1, float $$2, float $$3, ayg $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gqm.a.b, $$5, $$6, $$7);
   }

   private gqh(avb $$0, avd $$1, float $$2, float $$3, ayg $$4, boolean $$5, int $$6, gqm.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gqh(akh $$0, avd $$1, float $$2, float $$3, ayg $$4, boolean $$5, int $$6, gqm.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
