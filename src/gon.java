public class gon extends gop<ckz, gvh, fya> {
   private static final alc a = alc.b("textures/entity/slime/magmacube.png");

   public gon(gnj.a $$0) {
      super($$0, new fya($$0.a(gak.bh)), 0.25F);
   }

   protected int a(ckz $$0, je $$1) {
      return 15;
   }

   public alc a(gvh $$0) {
      return a;
   }

   public gvh c() {
      return new gvh();
   }

   public void a(ckz $$0, gvh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azd.h($$2, $$0.bY, $$0.bX);
      $$1.b = $$0.gq();
   }

   public void a(gvh $$0, fde $$1, ghg $$2, int $$3) {
      this.f = 0.25F * (float)$$0.b;
      super.a($$0, $$1, $$2, $$3);
   }

   protected void a(gvh $$0, fde $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
