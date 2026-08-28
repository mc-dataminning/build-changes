public class hmp extends hmc {
   public hmp(awm $$0, awo $$1, float $$2, float $$3, azv $$4, iu $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hmp a(awm $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hmp a(je<awm> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hmp a(awm $$0, float $$1, float $$2) {
      return new hmp($$0.a(), awo.a, $$2, $$1, hmu.t(), false, 0, hmu.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hmp a(awm $$0) {
      return new hmp($$0.a(), awo.b, 1.0F, 1.0F, hmu.t(), false, 0, hmu.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hmp a(awm $$0, feq $$1) {
      return new hmp($$0, awo.c, 4.0F, 1.0F, hmu.t(), false, 0, hmu.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hmp b(awm $$0, float $$1, float $$2) {
      return new hmp($$0.a(), awo.i, $$2, $$1, hmu.t(), false, 0, hmu.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hmp b(awm $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hmp a(awm $$0, azv $$1, double $$2, double $$3, double $$4) {
      return new hmp($$0, awo.i, 1.0F, 1.0F, $$1, false, 0, hmu.a.b, $$2, $$3, $$4);
   }

   public hmp(awm $$0, awo $$1, float $$2, float $$3, azv $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hmu.a.b, $$5, $$6, $$7);
   }

   private hmp(awm $$0, awo $$1, float $$2, float $$3, azv $$4, boolean $$5, int $$6, hmu.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hmp(alg $$0, awo $$1, float $$2, float $$3, azv $$4, boolean $$5, int $$6, hmu.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
