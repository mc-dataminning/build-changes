public class gvy extends gwg<cro, hcn> {
   private static final alg a = alg.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gqk g = gqk.g(a);

   public gvy(gwh.a $$0) {
      super($$0);
   }

   protected int a(cro $$0, iu $$1) {
      return 15;
   }

   @Override
   public void a(hcn $$0, fjj $$1, gqa $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.d.b());
      fjj.a $$4 = $$1.c();
      fjn $$5 = $$2.getBuffer(g);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fjn $$0, fjj.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hin.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public hcn d() {
      return new hcn();
   }
}
