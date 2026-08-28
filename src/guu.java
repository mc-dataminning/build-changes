public class guu extends gwq<civ, hcp, ger> {
   private static final ale a = ale.b("textures/entity/fish/cod.png");

   public guu(gvk.a $$0) {
      super($$0, new ger($$0.a(gif.ab)), 0.3F);
   }

   @Override
   public ale b(hcp $$0) {
      return a;
   }

   public hcp a() {
      return new hcp();
   }

   @Override
   protected void a(hcp $$0, fiq $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azk.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
