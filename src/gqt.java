public class gqt extends gsp<chy, gym, gau> {
   private static final alz a = alz.b("textures/entity/fish/cod.png");

   public gqt(grj.a $$0) {
      super($$0, new gau($$0.a(geg.W)), 0.3F);
   }

   @Override
   public alz b(gym $$0) {
      return a;
   }

   public gym a() {
      return new gym();
   }

   @Override
   protected void a(gym $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bae.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
