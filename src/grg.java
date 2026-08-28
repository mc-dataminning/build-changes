public class grg extends gqh<cmk, hai, gbf> {
   private static final alz a = alz.b("textures/entity/zombie/drowned.png");

   public grg(gro.a $$0) {
      super($$0, new gbf($$0.a(gel.at)), new gbf($$0.a(gel.au)), new gbf($$0.a(gel.ay)), new gbf($$0.a(gel.az)), new gbf($$0.a(gel.av)), new gbf($$0.a(gel.aw)));
      this.a(new gvk(this, $$0.f()));
   }

   public hai a() {
      return new hai();
   }

   @Override
   public alz a(hai $$0) {
      return a;
   }

   protected void a(hai $$0, fgq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = bae.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
