public class grh extends gqi<cmk, haj, gbg> {
   private static final alz a = alz.b("textures/entity/zombie/drowned.png");

   public grh(grp.a $$0) {
      super($$0, new gbg($$0.a(gem.at)), new gbg($$0.a(gem.au)), new gbg($$0.a(gem.ay)), new gbg($$0.a(gem.az)), new gbg($$0.a(gem.av)), new gbg($$0.a(gem.aw)));
      this.a(new gvl(this, $$0.f()));
   }

   public haj a() {
      return new haj();
   }

   @Override
   public alz a(haj $$0) {
      return a;
   }

   protected void a(haj $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = bae.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
