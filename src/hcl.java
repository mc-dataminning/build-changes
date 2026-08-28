public class hcl extends hby {
   public hcl(awn $$0, awp $$1, float $$2, float $$3, azv $$4, jh $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hcl a(awn $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hcl a(jq<awn> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hcl a(awn $$0, float $$1, float $$2) {
      return new hcl($$0.a(), awp.a, $$2, $$1, hcq.t(), false, 0, hcq.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hcl a(awn $$0) {
      return new hcl($$0.a(), awp.b, 1.0F, 1.0F, hcq.t(), false, 0, hcq.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hcl a(awn $$0, ezr $$1) {
      return new hcl($$0, awp.c, 4.0F, 1.0F, hcq.t(), false, 0, hcq.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hcl b(awn $$0, float $$1, float $$2) {
      return new hcl($$0.a(), awp.i, $$2, $$1, hcq.t(), false, 0, hcq.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hcl b(awn $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hcl a(awn $$0, azv $$1, double $$2, double $$3, double $$4) {
      return new hcl($$0, awp.i, 1.0F, 1.0F, $$1, false, 0, hcq.a.b, $$2, $$3, $$4);
   }

   public hcl(awn $$0, awp $$1, float $$2, float $$3, azv $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hcq.a.b, $$5, $$6, $$7);
   }

   private hcl(awn $$0, awp $$1, float $$2, float $$3, azv $$4, boolean $$5, int $$6, hcq.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hcl(all $$0, awp $$1, float $$2, float $$3, azv $$4, boolean $$5, int $$6, hcq.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
