public class gkg extends gjy<cka, fuw<cka>> {
   private static final alb a = new alb("textures/entity/phantom.png");

   public gkg(gis.a $$0) {
      super($$0, new fuw<>($$0.a(fwu.aH)), 0.75F);
      this.a(new gnc<>(this));
   }

   public alb a(cka $$0) {
      return a;
   }

   protected void a(cka $$0, ezt $$1, float $$2) {
      int $$3 = $$0.s();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cka $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dH()));
   }
}
