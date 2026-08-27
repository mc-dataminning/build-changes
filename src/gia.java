public class gia extends ght<cht, fss<cht>> {
   private static final akf a = new akf("textures/entity/phantom.png");

   public gia(ggn.a $$0) {
      super($$0, new fss<>($$0.a(fuq.aH)), 0.75F);
      this.a(new gkw<>(this));
   }

   public akf a(cht $$0) {
      return a;
   }

   protected void a(cht $$0, exn $$1, float $$2) {
      int $$3 = $$0.r();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cht $$0, exn $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dF()));
   }
}
