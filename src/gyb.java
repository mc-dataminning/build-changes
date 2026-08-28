public class gyb extends gyj<csl, her> {
   private static final alk a = alk.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gsn g = gsn.g(a);

   public gyb(gyk.a $$0) {
      super($$0);
   }

   protected int a(csl $$0, iw $$1) {
      return 15;
   }

   @Override
   public void a(her $$0, flq $$1, gsc $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.d.b());
      flq.a $$4 = $$1.c();
      flt $$5 = $$2.getBuffer(g);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(flt $$0, flq.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hks.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public her d() {
      return new her();
   }
}
