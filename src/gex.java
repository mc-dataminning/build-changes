public class gex extends gek {
   public gex(aqq $$0, aqs $$1, float $$2, float $$3, ats $$4, ht $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static gex a(aqq $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static gex a(ib<aqq> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static gex a(aqq $$0, float $$1, float $$2) {
      return new gex($$0.a(), aqs.a, $$2, $$1, gfc.t(), false, 0, gfc.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gex a(aqq $$0) {
      return new gex($$0.a(), aqs.b, 1.0F, 1.0F, gfc.t(), false, 0, gfc.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gex a(aqq $$0, eju $$1) {
      return new gex($$0, aqs.c, 4.0F, 1.0F, gfc.t(), false, 0, gfc.a.b, $$1.c, $$1.d, $$1.e);
   }

   public static gex b(aqq $$0, float $$1, float $$2) {
      return new gex($$0.a(), aqs.i, $$2, $$1, gfc.t(), false, 0, gfc.a.a, 0.0, 0.0, 0.0, true);
   }

   public static gex b(aqq $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static gex a(aqq $$0, ats $$1, double $$2, double $$3, double $$4) {
      return new gex($$0, aqs.i, 1.0F, 1.0F, $$1, false, 0, gfc.a.b, $$2, $$3, $$4);
   }

   public gex(aqq $$0, aqs $$1, float $$2, float $$3, ats $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, gfc.a.b, $$5, $$6, $$7);
   }

   private gex(aqq $$0, aqs $$1, float $$2, float $$3, ats $$4, boolean $$5, int $$6, gfc.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public gex(agi $$0, aqs $$1, float $$2, float $$3, ats $$4, boolean $$5, int $$6, gfc.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
