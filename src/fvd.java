public class fvd extends fug<ctx> {
   private static final alz G = alz.b("container/grindstone/error");
   private static final alz H = alz.b("textures/gui/container/grindstone.png");

   public fvd(ctx $$0, cpr $$1, xv $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fnl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(glo::B, H, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if ((this.z.b(0).h() || this.z.b(1).h()) && !this.z.b(2).h()) {
         $$0.a(glo::B, G, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}
