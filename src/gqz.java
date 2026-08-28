public class gqz extends gsv<cic, gys, gba> {
   private static final alz a = alz.b("textures/entity/fish/cod.png");

   public gqz(grp.a $$0) {
      super($$0, new gba($$0.a(gem.W)), 0.3F);
   }

   @Override
   public alz b(gys $$0) {
      return a;
   }

   public gys a() {
      return new gys();
   }

   @Override
   protected void a(gys $$0, fgr $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bae.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
