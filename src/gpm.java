public class gpm extends gop<clj, gvh, fzi> {
   private static final alc a = alc.b("textures/entity/slime/slime.png");

   public gpm(gnj.a $$0) {
      super($$0, new fzi($$0.a(gak.cs)), 0.25F);
      this.a(new gsa(this, $$0.f()));
   }

   public void a(gvh $$0, fde $$1, ghg $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gvh $$0, fde $$1) {
      float $$2 = 0.999F;
      $$1.b(0.999F, 0.999F, 0.999F);
      $$1.a(0.0F, 0.001F, 0.0F);
      float $$3 = (float)$$0.b;
      float $$4 = $$0.a / ($$3 * 0.5F + 1.0F);
      float $$5 = 1.0F / ($$4 + 1.0F);
      $$1.b($$5 * $$3, 1.0F / $$5 * $$3, $$5 * $$3);
   }

   public alc a(gvh $$0) {
      return a;
   }

   public gvh c() {
      return new gvh();
   }

   public void a(clj $$0, gvh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azd.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gq();
   }
}
