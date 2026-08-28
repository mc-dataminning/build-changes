public class gwk extends gws<crv, hcz> {
   private static final alg a = alg.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gqx g = gqx.g(a);

   public gwk(gwt.a $$0) {
      super($$0);
   }

   protected int a(crv $$0, iv $$1) {
      return 15;
   }

   @Override
   public void a(hcz $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.d.b());
      fjy.a $$4 = $$1.c();
      fkc $$5 = $$2.getBuffer(g);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fkc $$0, fjy.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hja.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public hcz d() {
      return new hcz();
   }
}
