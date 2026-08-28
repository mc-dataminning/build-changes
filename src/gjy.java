public class gjy extends gkg<cng> {
   private static final akr a = akr.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gff g = gff.e(a);

   public gjy(gkh.a $$0) {
      super($$0);
   }

   protected int a(cng $$0, jd $$1) {
      return 15;
   }

   public void a(cng $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(this.d.b());
      fbg.a $$6 = $$3.c();
      fbk $$7 = $$4.getBuffer(g);
      a($$7, $$6, $$5, 0.0F, 0, 0, 1);
      a($$7, $$6, $$5, 1.0F, 0, 1, 1);
      a($$7, $$6, $$5, 1.0F, 1, 1, 0);
      a($$7, $$6, $$5, 0.0F, 1, 0, 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(fbk $$0, fbg.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gqa.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   public akr a(cng $$0) {
      return a;
   }
}
