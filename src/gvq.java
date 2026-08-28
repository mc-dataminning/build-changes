public class gvq extends gvy<crj, hcf> {
   private static final alg a = alg.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gqc g = gqc.g(a);

   public gvq(gvz.a $$0) {
      super($$0);
   }

   protected int a(crj $$0, iu $$1) {
      return 15;
   }

   @Override
   public void a(hcf $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      $$1.b(2.0F, 2.0F, 2.0F);
      $$1.a(this.d.b());
      fjc.a $$4 = $$1.c();
      fjg $$5 = $$2.getBuffer(g);
      a($$5, $$4, $$3, 0.0F, 0, 0, 1);
      a($$5, $$4, $$3, 1.0F, 0, 1, 1);
      a($$5, $$4, $$3, 1.0F, 1, 1, 0);
      a($$5, $$4, $$3, 0.0F, 1, 0, 0);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   private static void a(fjg $$0, fjc.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(hif.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   @Override
   public hcf d() {
      return new hcf();
   }
}
