public class fvx extends fuj<cbn, fhj<cbn>> {
   private static final aez a = new aez("textures/entity/villager/villager.png");

   public fvx(ftd.a $$0) {
      super($$0, new fhj<>($$0.a(fhw.bJ)), 0.5F);
      this.a(new fwq<>(this, $$0.f(), $$0.d()));
      this.a(new fxw<>(this, $$0.e(), "villager"));
      this.a(new fwp<>(this, $$0.d()));
   }

   public aez a(cbn $$0) {
      return a;
   }

   protected void a(cbn $$0, elj $$1, float $$2) {
      float $$3 = 0.9375F;
      if ($$0.m_()) {
         $$3 *= 0.5F;
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }

      $$1.b($$3, $$3, $$3);
   }
}
