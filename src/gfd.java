public class gfd extends ggx<cco, fql<cco>> {
   private static final ajv a = new ajv("textures/entity/fish/cod.png");

   public gfd(gfr.a $$0) {
      super($$0, new fql<>($$0.a(ftu.A)), 0.3F);
   }

   public ajv a(cco $$0) {
      return a;
   }

   protected void a(cco $$0, ewr $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * axm.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
