public class fyr extends fxd<cdh, fka<cdh>> {
   private static final agi a = new agi("textures/entity/villager/villager.png");

   public fyr(fvx.a $$0) {
      super($$0, new fka<>($$0.a(fkn.bJ)), 0.5F);
      this.a(new fzk<>(this, $$0.f(), $$0.d()));
      this.a(new gaq<>(this, $$0.e(), "villager"));
      this.a(new fzj<>(this, $$0.d()));
   }

   public agi a(cdh $$0) {
      return a;
   }

   protected void a(cdh $$0, enw $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.n_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
