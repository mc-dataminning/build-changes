public class gkc extends glz<cek, fvg<cek>> {
   private static final akt a = new akt("textures/entity/fish/cod.png");

   public gkc(gkq.a $$0) {
      super($$0, new fvg<>($$0.a(fyr.B)), 0.3F);
   }

   public akt a(cek $$0) {
      return a;
   }

   protected void a(cek $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * aym.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bi()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
