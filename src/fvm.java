public class fvm extends fuj<cab, fhb<cab>> {
   private static final aez a = new aez("textures/entity/strider/strider.png");
   private static final aez i = new aez("textures/entity/strider/strider_cold.png");

   public fvm(ftd.a $$0) {
      super($$0, new fhb<>($$0.a(fhw.bx)), 0.5F);
      this.a(new fxm<>(this, new fhb<>($$0.a(fhw.by)), new aez("textures/entity/strider/strider_saddle.png")));
   }

   public aez a(cab $$0) {
      return $$0.s() ? i : a;
   }

   protected void a(cab $$0, elj $$1, float $$2) {
      if ($$0.m_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(cab $$0) {
      return super.a($$0) || $$0.s();
   }
}
