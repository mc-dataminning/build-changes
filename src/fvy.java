public class fvy extends fun<bvs, fhl<bvs>> {
   private static final aew a = new aew("textures/entity/turtle/big_sea_turtle.png");

   public fvy(fth.a $$0) {
      super($$0, new fhl<>($$0.a(fib.bH)), 0.7F);
   }

   public void a(bvs $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      if ($$0.m_()) {
         this.d *= 0.5F;
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aew a(bvs $$0) {
      return a;
   }
}
