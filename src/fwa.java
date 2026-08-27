public class fwa extends fup<bvu, fhn<bvu>> {
   private static final aey a = new aey("textures/entity/turtle/big_sea_turtle.png");

   public fwa(ftj.a $$0) {
      super($$0, new fhn<>($$0.a(fid.bH)), 0.7F);
   }

   public void a(bvu $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      if ($$0.m_()) {
         this.d *= 0.5F;
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(bvu $$0) {
      return a;
   }
}
