public class gcg extends gbz<cep, fnc<cep>> {
   private static final aiy a = new aiy("textures/entity/phantom.png");

   public gcg(gat.a $$0) {
      super($$0, new fnc<>($$0.a(fpb.aD)), 0.75F);
      this.a(new gfc<>(this));
   }

   public aiy a(cep $$0) {
      return a;
   }

   protected void a(cep $$0, esa $$1, float $$2) {
      int $$3 = $$0.u();
      float $$4 = 1.0F + 0.15F * (float)$$3;
      $$1.b($$4, $$4, $$4);
      $$1.a(0.0F, 1.3125F, 0.1875F);
   }

   protected void a(cep $$0, esa $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$1.a(a.b.rotationDegrees($$0.dE()));
   }
}
