public class grs extends gsa<cpf, gyh> {
   private static final aku a = aku.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gmf b = gmf.g(a);

   public grs(gsb.a $$0) {
      super($$0);
   }

   protected int a(cpf $$0, ji $$1) {
      return 15;
   }

   @Override
   public void a(gyh $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.e.b());
      ffs.a $$4 = $$1.c();
      ffw $$5 = $$2.getBuffer(b);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(ffw $$0, ffs.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hec.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public gyh d() {
      return new gyh();
   }
}
