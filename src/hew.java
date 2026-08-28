public class hew extends hej {
   public hew(axe $$0, axg $$1, float $$2, float $$3, bam $$4, jh $$5) {
      this($$0, $$1, $$2, $$3, $$4, (double)$$5.u() + 0.5, (double)$$5.v() + 0.5, (double)$$5.w() + 0.5);
   }

   public static hew a(axe $$0, float $$1) {
      return a($$0, $$1, 0.25F);
   }

   public static hew a(jq<axe> $$0, float $$1) {
      return a($$0.a(), $$1);
   }

   public static hew a(axe $$0, float $$1, float $$2) {
      return new hew($$0.a(), axg.a, $$2, $$1, hfb.t(), false, 0, hfb.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hew a(axe $$0) {
      return new hew($$0.a(), axg.b, 1.0F, 1.0F, hfb.t(), false, 0, hfb.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hew a(axe $$0, fbs $$1) {
      return new hew($$0, axg.c, 4.0F, 1.0F, hfb.t(), false, 0, hfb.a.b, $$1.d, $$1.e, $$1.f);
   }

   public static hew b(axe $$0, float $$1, float $$2) {
      return new hew($$0.a(), axg.i, $$2, $$1, hfb.t(), false, 0, hfb.a.a, 0.0, 0.0, 0.0, true);
   }

   public static hew b(axe $$0) {
      return b($$0, 1.0F, 1.0F);
   }

   public static hew a(axe $$0, bam $$1, double $$2, double $$3, double $$4) {
      return new hew($$0, axg.i, 1.0F, 1.0F, $$1, false, 0, hfb.a.b, $$2, $$3, $$4);
   }

   public hew(axe $$0, axg $$1, float $$2, float $$3, bam $$4, double $$5, double $$6, double $$7) {
      this($$0, $$1, $$2, $$3, $$4, false, 0, hfb.a.b, $$5, $$6, $$7);
   }

   private hew(axe $$0, axg $$1, float $$2, float $$3, bam $$4, boolean $$5, int $$6, hfb.a $$7, double $$8, double $$9, double $$10) {
      this($$0.a(), $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, false);
   }

   public hew(alz $$0, axg $$1, float $$2, float $$3, bam $$4, boolean $$5, int $$6, hfb.a $$7, double $$8, double $$9, double $$10, boolean $$11) {
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
