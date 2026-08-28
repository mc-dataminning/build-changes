public class gjk extends gku<cjh, fuo<cjh>> {
   private static final akk a = new akk("textures/entity/enderman/enderman.png");
   private final ayo i = ayo.a();

   public gjk(gjo.a $$0) {
      super($$0, new fuo<>($$0.a(fxp.X)), 0.5F);
      this.a(new gnk<>(this));
      this.a(new gnb(this, $$0.c()));
   }

   public void a(cjh $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      dsl $$6 = $$0.gn();
      fuo<cjh> $$7 = this.a();
      $$7.a = $$6 != null;
      $$7.b = $$0.go();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ewh a(cjh $$0, float $$1) {
      if ($$0.go()) {
         double $$2 = 0.02 * (double)$$0.ed();
         return new ewh(this.i.k() * $$2, 0.0, this.i.k() * $$2);
      } else {
         return super.a($$0, $$1);
      }
   }

   public akk a(cjh $$0) {
      return a;
   }
}
