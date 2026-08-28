public class hos extends hof {
   public hos(awo $$0, awq $$1, float $$2, float $$3, azx $$4, iv $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hos a(awo $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hos a(jf<awo> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hos a(awo $$0, float $$1, float $$2) {
      return new hos($$0.a(), awq.a, $$2, $$1, hox.t(), false, 0, hox.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hos a(awo $$0) {
      return new hos($$0.a(), awq.b, 1.0F, 1.0F, hox.t(), false, 0, hox.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hos a(awo $$0, ffq $$1) {
      return new hos($$0, awq.c, 4.0F, 1.0F, hox.t(), false, 0, hox.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hos b(awo $$0, float $$1, float $$2) {
      return new hos($$0.a(), awq.i, $$2, $$1, hox.t(), false, 0, hox.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hos b(awo $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hos a(awo $$0, azx $$1, double $$2, double $$3, double $$4) {
      return new hos($$0, awq.i, 1.0F, 1.0F, $$1, false, 0, hox.a.b, $$2, $$3, $$4);
   }

   public hos(awo $$0, awq $$1, float $$2, float $$3, azx $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hox.a.b, $$5, $$6, $$7);
   }

   private hos(awo $$0, awq $$1, float $$2, float $$3, azx $$4, boolean $$5, int $$6, hox.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hos(ali $$0, awq $$1, float $$2, float $$3, azx $$4, boolean $$5, int $$6, hox.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
