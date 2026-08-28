public class grt extends gqu<clk, hay, gbt> {
   private static final aku a = aku.b("textures/entity/zombie/drowned.png");

   public grt(gsb.a $$0) {
      super($$0, new gbt($$0.a(gez.aw)), new gbt($$0.a(gez.ax)), new gbt($$0.a(gez.aB)), new gbt($$0.a(gez.aC)), new gbt($$0.a(gez.ay)), new gbt($$0.a(gez.az)));
      this.a(new gvx(this, $$0.f()));
   }

   public hay a() {
      return new hay();
   }

   @Override
   public aku a(hay $$0) {
      return a;
   }

   protected void a(hay $$0, ffs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.G;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.ab;
         float $$6 = ayy.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.w / 2.0F / $$3, 0.0F);
      }
   }

   protected gcl.a a(clk $$0, buz $$1) {
      cwn $$2 = $$0.a($$1);
      return $$0.fy() == $$1 && $$0.ge() && $$2.a(cwr.wS) ? gcl.a.e : gcl.a.a;
   }
}
