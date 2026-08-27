public class gor extends goe {
   public gor(aul $$0, aun $$1, float $$2, float $$3, axr $$4, ib $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gor a(aul $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gor a(il<aul> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gor a(aul $$0, float $$1, float $$2) {
      return new gor($$0.a(), aun.a, $$2, $$1, gow.t(), false, 0, gow.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gor a(aul $$0) {
      return new gor($$0.a(), aun.b, 1.0F, 1.0F, gow.t(), false, 0, gow.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gor a(aul $$0, esa $$1) {
      return new gor($$0, aun.c, 4.0F, 1.0F, gow.t(), false, 0, gow.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gor b(aul $$0, float $$1, float $$2) {
      return new gor($$0.a(), aun.i, $$2, $$1, gow.t(), false, 0, gow.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gor b(aul $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gor a(aul $$0, axr $$1, double $$2, double $$3, double $$4) {
      return new gor($$0, aun.i, 1.0F, 1.0F, $$1, false, 0, gow.a.b, $$2, $$3, $$4);
   }

   public gor(aul $$0, aun $$1, float $$2, float $$3, axr $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gow.a.b, $$5, $$6, $$7);
   }

   private gor(aul $$0, aun $$1, float $$2, float $$3, axr $$4, boolean $$5, int $$6, gow.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gor(ajt $$0, aun $$1, float $$2, float $$3, axr $$4, boolean $$5, int $$6, gow.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
