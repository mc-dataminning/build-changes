public class fwx extends fvj<cck, fii<cck>> {
   private static final afw a = new afw("textures/entity/villager/villager.png");

   public fwx(fud.a $$0) {
      super($$0, new fii<>($$0.a(fiv.bJ)), 0.5F);
      this.a(new fxq<>(this, $$0.f(), $$0.d()));
      this.a(new fyw<>(this, $$0.e(), "villager"));
      this.a(new fxp<>(this, $$0.d()));
   }

   public afw a(cck $$0) {
      return a;
   }

   protected void a(cck $$0, emh $$1, float $$2) {
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
