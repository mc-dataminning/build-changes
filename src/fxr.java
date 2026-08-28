public class fxr extends fwu<cun> {
   private static final ald G = ald.b("container/grindstone/error");
   private static final ald H = ald.b("textures/gui/container/grindstone.png");

   public fxr(cun $$0, cqh $$1, wv $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fpz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(goi::H, H, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if ((this.z.b(0).h() || this.z.b(1).h()) && !this.z.b(2).h()) {
         $$0.a(goi::H, G, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}
