public class gtw extends gue<cqs, hak> {
   private static final ald a = ald.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final goi g = goi.g(a);

   public gtw(guf.a $$0) {
      super($$0);
   }

   protected int a(cqs $$0, jj $$1) {
      return 15;
   }

   @Override
   public void a(hak $$0, fho $$1, gny $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.d.b());
      fho.a $$4 = $$1.c();
      fhs $$5 = $$2.getBuffer(g);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fhs $$0, fho.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hgi.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public hak d() {
      return new hak();
   }
}
