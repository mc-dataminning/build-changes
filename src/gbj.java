public class gbj extends gaw {
   public gbj(aot $$0, aov $$1, float $$2, float $$3, art $$4, gv $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gbj a(aot $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gbj a(hf<aot> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gbj a(aot $$0, float $$1, float $$2) {
      return new gbj($$0.a(), aov.a, $$2, $$1, gbo.t(), false, 0, gbo.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gbj a(aot $$0) {
      return new gbj($$0.a(), aov.b, 1.0F, 1.0F, gbo.t(), false, 0, gbo.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gbj a(aot $$0, ehf $$1) {
      return new gbj($$0, aov.c, 4.0F, 1.0F, gbo.t(), false, 0, gbo.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gbj b(aot $$0, float $$1, float $$2) {
      return new gbj($$0.a(), aov.i, $$2, $$1, gbo.t(), false, 0, gbo.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gbj b(aot $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gbj a(aot $$0, art $$1, double $$2, double $$3, double $$4) {
      return new gbj($$0, aov.i, 1.0F, 1.0F, $$1, false, 0, gbo.a.b, $$2, $$3, $$4);
   }

   public gbj(aot $$0, aov $$1, float $$2, float $$3, art $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gbo.a.b, $$5, $$6, $$7);
   }

   private gbj(aot $$0, aov $$1, float $$2, float $$3, art $$4, boolean $$5, int $$6, gbo.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gbj(aep $$0, aov $$1, float $$2, float $$3, art $$4, boolean $$5, int $$6, gbo.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
