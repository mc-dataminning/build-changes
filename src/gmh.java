public class gmh extends glu {
   public gmh(atx $$0, atz $$1, float $$2, float $$3, axd $$4, ib $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gmh a(atx $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gmh a(il<atx> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gmh a(atx $$0, float $$1, float $$2) {
      return new gmh($$0.a(), atz.a, $$2, $$1, gmm.t(), false, 0, gmm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gmh a(atx $$0) {
      return new gmh($$0.a(), atz.b, 1.0F, 1.0F, gmm.t(), false, 0, gmm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gmh a(atx $$0, epr $$1) {
      return new gmh($$0, atz.c, 4.0F, 1.0F, gmm.t(), false, 0, gmm.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gmh b(atx $$0, float $$1, float $$2) {
      return new gmh($$0.a(), atz.i, $$2, $$1, gmm.t(), false, 0, gmm.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gmh b(atx $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gmh a(atx $$0, axd $$1, double $$2, double $$3, double $$4) {
      return new gmh($$0, atz.i, 1.0F, 1.0F, $$1, false, 0, gmm.a.b, $$2, $$3, $$4);
   }

   public gmh(atx $$0, atz $$1, float $$2, float $$3, axd $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gmm.a.b, $$5, $$6, $$7);
   }

   private gmh(atx $$0, atz $$1, float $$2, float $$3, axd $$4, boolean $$5, int $$6, gmm.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gmh(ajh $$0, atz $$1, float $$2, float $$3, axd $$4, boolean $$5, int $$6, gmm.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
