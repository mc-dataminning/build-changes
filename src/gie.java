public class gie extends gjy<cfg, ftl<cfg>> {
   private static final alb a = new alb("textures/entity/fish/cod.png");

   public gie(gis.a $$0) {
      super($$0, new ftl<>($$0.a(fwu.A)), 0.3F);
   }

   public alb a(cfg $$0) {
      return a;
   }

   protected void a(cfg $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayu.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
