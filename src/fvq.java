public class fvq extends fun<bzv, fhg<bzv>> {
   private static final aex a = new aex("textures/entity/strider/strider.png");
   private static final aex i = new aex("textures/entity/strider/strider_cold.png");

   public fvq(fth.a $$0) {
      super($$0, new fhg<>($$0.a(fib.bx)), 0.5F);
      this.a(new fxq<>(this, new fhg<>($$0.a(fib.by)), new aex("textures/entity/strider/strider_saddle.png")));
   }

   public aex a(bzv $$0) {
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
