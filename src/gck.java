public class gck extends gee<cbj, fns<cbj>> {
   private static final ajh a = new ajh("textures/entity/fish/cod.png");

   public gck(gcy.a $$0) {
      super($$0, new fns<>($$0.a(frc.w)), 0.3F);
   }

   public ajh a(cbj $$0) {
      return a;
   }

   protected void a(cbj $$0, etz $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * aww.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bc()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
