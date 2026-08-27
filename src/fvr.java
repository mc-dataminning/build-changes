public class fvr extends fud<caz, fhe<caz>> {
   private static final aer a = new aer("textures/entity/villager/villager.png");

   public fvr(fsx.a $$0) {
      super($$0, new fhe<>($$0.a(fhr.bJ)), 0.5F);
      this.a(new fwk<>(this, $$0.f(), $$0.d()));
      this.a(new fxq<>(this, $$0.e(), "villager"));
      this.a(new fwj<>(this, $$0.d()));
   }

   public aer a(caz $$0) {
      return a;
   }

   protected void a(caz $$0, elf $$1, float $$2) {
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
