public class hbv extends hbi {
   public hbv(awk $$0, awm $$1, float $$2, float $$3, azs $$4, jh $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hbv a(awk $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hbv a(jq<awk> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hbv a(awk $$0, float $$1, float $$2) {
      return new hbv($$0.a(), awm.a, $$2, $$1, hca.t(), false, 0, hca.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hbv a(awk $$0) {
      return new hbv($$0.a(), awm.b, 1.0F, 1.0F, hca.t(), false, 0, hca.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hbv a(awk $$0, ezn $$1) {
      return new hbv($$0, awm.c, 4.0F, 1.0F, hca.t(), false, 0, hca.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hbv b(awk $$0, float $$1, float $$2) {
      return new hbv($$0.a(), awm.i, $$2, $$1, hca.t(), false, 0, hca.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hbv b(awk $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hbv a(awk $$0, azs $$1, double $$2, double $$3, double $$4) {
      return new hbv($$0, awm.i, 1.0F, 1.0F, $$1, false, 0, hca.a.b, $$2, $$3, $$4);
   }

   public hbv(awk $$0, awm $$1, float $$2, float $$3, azs $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hca.a.b, $$5, $$6, $$7);
   }

   private hbv(awk $$0, awm $$1, float $$2, float $$3, azs $$4, boolean $$5, int $$6, hca.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hbv(ali $$0, awm $$1, float $$2, float $$3, azs $$4, boolean $$5, int $$6, hca.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
