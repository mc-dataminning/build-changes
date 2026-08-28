public class hcw extends hcj {
   public hcw(awm $$0, awo $$1, float $$2, float $$3, azu $$4, jh $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hcw a(awm $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hcw a(jq<awm> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hcw a(awm $$0, float $$1, float $$2) {
      return new hcw($$0.a(), awo.a, $$2, $$1, hdb.t(), false, 0, hdb.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hcw a(awm $$0) {
      return new hcw($$0.a(), awo.b, 1.0F, 1.0F, hdb.t(), false, 0, hdb.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hcw a(awm $$0, ezy $$1) {
      return new hcw($$0, awo.c, 4.0F, 1.0F, hdb.t(), false, 0, hdb.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hcw b(awm $$0, float $$1, float $$2) {
      return new hcw($$0.a(), awo.i, $$2, $$1, hdb.t(), false, 0, hdb.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hcw b(awm $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hcw a(awm $$0, azu $$1, double $$2, double $$3, double $$4) {
      return new hcw($$0, awo.i, 1.0F, 1.0F, $$1, false, 0, hdb.a.b, $$2, $$3, $$4);
   }

   public hcw(awm $$0, awo $$1, float $$2, float $$3, azu $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hdb.a.b, $$5, $$6, $$7);
   }

   private hcw(awm $$0, awo $$1, float $$2, float $$3, azu $$4, boolean $$5, int $$6, hdb.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hcw(alj $$0, awo $$1, float $$2, float $$3, azu $$4, boolean $$5, int $$6, hdb.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
