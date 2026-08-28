public class gwp extends gwx<cry, hdf> {
   private static final alg a = alg.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final grc g = grc.g(a);

   public gwp(gwy.a $$0) {
      super($$0);
   }

   protected int a(cry $$0, iv $$1) {
      return 15;
   }

   @Override
   public void a(hdf $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.d.b());
      fkd.a $$4 = $$1.c();
      fkh $$5 = $$2.getBuffer(g);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fkh $$0, fkd.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hjg.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public hdf d() {
      return new hdf();
   }
}
