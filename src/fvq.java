public class fvq extends fun<bzv, fhg<bzv>> {
   private static final aew a = new aew("textures/entity/strider/strider.png");
   private static final aew i = new aew("textures/entity/strider/strider_cold.png");

   public fvq(fth.a $$0) {
      super($$0, new fhg<>($$0.a(fib.bx)), 0.5F);
      this.a(new fxq<>(this, new fhg<>($$0.a(fib.by)), new aew("textures/entity/strider/strider_saddle.png")));
   }

   public aew a(bzv $$0) {
      return $$0.s() ? i : a;
   }

   protected void a(bzv $$0, elp $$1, float $$2) {
      if ($$0.m_()) {
         $$1.b(0.5F, 0.5F, 0.5F);
         this.d = 0.25F;
      } else {
         this.d = 0.5F;
      }
   }

   protected boolean b(bzv $$0) {
      return super.a($$0) || $$0.s();
   }
}
