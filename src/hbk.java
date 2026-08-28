public class hbk extends hax {
   public hbk(awj $$0, awl $$1, float $$2, float $$3, azr $$4, jg $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hbk a(awj $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hbk a(jp<awj> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hbk a(awj $$0, float $$1, float $$2) {
      return new hbk($$0.a(), awl.a, $$2, $$1, hbp.t(), false, 0, hbp.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hbk a(awj $$0) {
      return new hbk($$0.a(), awl.b, 1.0F, 1.0F, hbp.t(), false, 0, hbp.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hbk a(awj $$0, ezh $$1) {
      return new hbk($$0, awl.c, 4.0F, 1.0F, hbp.t(), false, 0, hbp.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hbk b(awj $$0, float $$1, float $$2) {
      return new hbk($$0.a(), awl.i, $$2, $$1, hbp.t(), false, 0, hbp.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hbk b(awj $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hbk a(awj $$0, azr $$1, double $$2, double $$3, double $$4) {
      return new hbk($$0, awl.i, 1.0F, 1.0F, $$1, false, 0, hbp.a.b, $$2, $$3, $$4);
   }

   public hbk(awj $$0, awl $$1, float $$2, float $$3, azr $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hbp.a.b, $$5, $$6, $$7);
   }

   private hbk(awj $$0, awl $$1, float $$2, float $$3, azr $$4, boolean $$5, int $$6, hbp.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hbk(alh $$0, awl $$1, float $$2, float $$3, azr $$4, boolean $$5, int $$6, hbp.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
