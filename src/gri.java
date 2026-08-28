public class gri extends gqj<cml, hak, gbh> {
   private static final alz a = alz.b("textures/entity/zombie/drowned.png");

   public gri(grq.a $$0) {
      super($$0, new gbh($$0.a(gen.at)), new gbh($$0.a(gen.au)), new gbh($$0.a(gen.ay)), new gbh($$0.a(gen.az)), new gbh($$0.a(gen.av)), new gbh($$0.a(gen.aw)));
      this.a(new gvm(this, $$0.f()));
   }

   public hak a() {
      return new hak();
   }

   @Override
   public alz a(hak $$0) {
      return a;
   }

   protected void a(hak $$0, fgs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = $$0.B;
      if ($$4 > 0.0F) {
         float $$5 = -10.0F - $$0.V;
         float $$6 = bae.h($$4, 0.0F, $$5);
         $$1.a(a.b.rotationDegrees($$6), 0.0F, $$0.r / 2.0F / $$3, 0.0F);
      }
   }
}
