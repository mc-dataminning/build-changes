public class ggj extends gid<cdv, frr<cdv>> {
   private static final akh a = new akh("textures/entity/fish/cod.png");

   public ggj(ggx.a $$0) {
      super($$0, new frr<>($$0.a(fva.A)), 0.3F);
   }

   public akh a(cdv $$0) {
      return a;
   }

   protected void a(cdv $$0, exx $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axz.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
