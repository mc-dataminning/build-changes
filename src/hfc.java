public class hfc extends hep {
   public hfc(axe $$0, axg $$1, float $$2, float $$3, bam $$4, jh $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hfc a(axe $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hfc a(jq<axe> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hfc a(axe $$0, float $$1, float $$2) {
      return new hfc($$0.a(), axg.a, $$2, $$1, hfh.t(), false, 0, hfh.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hfc a(axe $$0) {
      return new hfc($$0.a(), axg.b, 1.0F, 1.0F, hfh.t(), false, 0, hfh.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hfc a(axe $$0, fbx $$1) {
      return new hfc($$0, axg.c, 4.0F, 1.0F, hfh.t(), false, 0, hfh.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hfc b(axe $$0, float $$1, float $$2) {
      return new hfc($$0.a(), axg.i, $$2, $$1, hfh.t(), false, 0, hfh.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hfc b(axe $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hfc a(axe $$0, bam $$1, double $$2, double $$3, double $$4) {
      return new hfc($$0, axg.i, 1.0F, 1.0F, $$1, false, 0, hfh.a.b, $$2, $$3, $$4);
   }

   public hfc(axe $$0, axg $$1, float $$2, float $$3, bam $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hfh.a.b, $$5, $$6, $$7);
   }

   private hfc(axe $$0, axg $$1, float $$2, float $$3, bam $$4, boolean $$5, int $$6, hfh.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hfc(alz $$0, axg $$1, float $$2, float $$3, bam $$4, boolean $$5, int $$6, hfh.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
