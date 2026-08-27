public class fvd extends ftp<cay, fgv<cay>> {
   private static final aep a = new aep("textures/entity/villager/villager.png");

   public fvd(fsj.a $$0) {
      super($$0, new fgv<>($$0.a(fhi.bJ)), 0.5F);
      this.a(new fvw<>(this, $$0.f(), $$0.d()));
      this.a(new fxc<>(this, $$0.e(), "villager"));
      this.a(new fvv<>(this, $$0.d()));
   }

   public aep a(cay $$0) {
      return a;
   }

   protected void a(cay $$0, elh $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.i_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
