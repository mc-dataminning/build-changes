public class fvy extends fvb<ctd> {
   private static final akv G = akv.b("container/grindstone/error");
   private static final akv H = akv.b("textures/gui/container/grindstone.png");

   public fvy(ctd $$0, cox $$1, wp $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   @Override
   protected void a(fof $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmj::H, H, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      if ((this.z.b(0).h() || this.z.b(1).h()) && !this.z.b(2).h()) {
         $$0.a(gmj::H, G, $$4 + 92, $$5 + 31, 28, 21);
      }
   }
}
