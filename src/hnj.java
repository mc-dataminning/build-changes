public class hnj extends hmw {
   public hnj(awm $$0, awo $$1, float $$2, float $$3, azv $$4, iv $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hnj a(awm $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hnj a(jf<awm> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hnj a(awm $$0, float $$1, float $$2) {
      return new hnj($$0.a(), awo.a, $$2, $$1, hno.t(), false, 0, hno.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hnj a(awm $$0) {
      return new hnj($$0.a(), awo.b, 1.0F, 1.0F, hno.t(), false, 0, hno.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hnj a(awm $$0, ffc $$1) {
      return new hnj($$0, awo.c, 4.0F, 1.0F, hno.t(), false, 0, hno.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hnj b(awm $$0, float $$1, float $$2) {
      return new hnj($$0.a(), awo.i, $$2, $$1, hno.t(), false, 0, hno.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hnj b(awm $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hnj a(awm $$0, azv $$1, double $$2, double $$3, double $$4) {
      return new hnj($$0, awo.i, 1.0F, 1.0F, $$1, false, 0, hno.a.b, $$2, $$3, $$4);
   }

   public hnj(awm $$0, awo $$1, float $$2, float $$3, azv $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hno.a.b, $$5, $$6, $$7);
   }

   private hnj(awm $$0, awo $$1, float $$2, float $$3, azv $$4, boolean $$5, int $$6, hno.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hnj(alg $$0, awo $$1, float $$2, float $$3, azv $$4, boolean $$5, int $$6, hno.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
