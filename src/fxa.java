public class fxa extends fyu<bxo, fio<bxo>> {
   private static final agt a = new agt("textures/entity/fish/cod.png");

   public fxa(fxo.a $$0) {
      super($$0, new fio<>($$0.a(flx.x)), 0.3F);
   }

   public agt a(bxo $$0) {
      return a;
   }

   protected void a(bxo $$0, epd $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aty.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
