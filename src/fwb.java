public class fwb extends fun<cbh, fho<cbh>> {
   private static final aew a = new aew("textures/entity/villager/villager.png");

   public fwb(fth.a $$0) {
      super($$0, new fho<>($$0.a(fib.bJ)), 0.5F);
      this.a(new fwu<>(this, $$0.f(), $$0.d()));
      this.a(new fya<>(this, $$0.e(), "villager"));
      this.a(new fwt<>(this, $$0.d()));
   }

   public aew a(cbh $$0) {
      return a;
   }

   protected void a(cbh $$0, elp $$1, float $$2) {
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
