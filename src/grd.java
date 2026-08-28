public class grd extends gqe<cmc, haf, gbc> {
   private static final alp a = alp.b("textures/entity/zombie/drowned.png");

   public grd(grl.a $$0) {
      super($$0, new gbc($$0.a(gei.aw)), new gbc($$0.a(gei.ax)), new gbc($$0.a(gei.aB)), new gbc($$0.a(gei.aC)), new gbc($$0.a(gei.ay)), new gbc($$0.a(gei.az)));
      this.a(new gvh(this, $$0.f()));
   }

   public haf a() {
      return new haf();
   }

   @Override
   public alp a(haf $$0) {
      return a;
   }

   protected void a(haf $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = azu.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
