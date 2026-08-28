public class gsp extends gsr<cmn, gzm, gbx> {
   private static final alp a = alp.b("textures/entity/slime/magmacube.png");

   public gsp(grl.a $$0) {
      super($$0, new gbx($$0.a(gei.bx)), 0.25F);
   }

   protected int a(cmn $$0, jh $$1) {
      return 15;
   }

   public alp a(gzm $$0) {
      return a;
   }

   public gzm b() {
      return new gzm();
   }

   public void a(cmn $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = azu.h($$2, $$0.bZ, $$0.bY);
      $$1.b = $$0.go();
   }

   protected float b(gzm $$0) {
      return (float)$$0.b * 0.25F;
   }

   protected void a(gzm $$0, fgl $$1) {
      int $$2 = $$0.b;
      float $$3 = $$0.a / ((float)$$2 * 0.5F + 1.0F);
      float $$4 = 1.0F / ($$3 + 1.0F);
      $$1.b($$4 * (float)$$2, 1.0F / $$4 * (float)$$2, $$4 * (float)$$2);
   }
}
