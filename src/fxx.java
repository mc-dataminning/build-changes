public class fxx extends fzr<byd, fjl<byd>> {
   private static final ahg a = new ahg("textures/entity/fish/cod.png");

   public fxx(fyl.a $$0) {
      super($$0, new fjl<>($$0.a(fmu.x)), 0.3F);
   }

   public ahg a(byd $$0) {
      return a;
   }

   protected void a(byd $$0, epz $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * aun.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aZ()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
