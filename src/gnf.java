public class gnf extends gnn<coh, gtq> {
   private static final ale a = ale.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final ghv b = ghv.f(a);

   public gnf(gno.a $$0) {
      super($$0);
   }

   protected int a(coh $$0, jf $$1) {
      return 15;
   }

   @Override
   public void a(gtq $$0, fdi $$1, ghl $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.e.b());
      fdi.a $$4 = $$1.c();
      fdm $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fdm $$0, fdi.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gwx.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public gtq b() {
      return new gtq();
   }
}
