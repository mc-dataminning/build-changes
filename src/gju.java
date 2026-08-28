public class gju extends gkc<cne> {
   private static final akq a = akq.b("textures/entity/enderdragon/dragon_fireball.png");
   private static final gfb f = gfb.e(a);

   public gju(gkd.a $$0) {
      super($$0);
   }

   protected int a(cne $$0, jd $$1) {
      return 15;
   }

   public void a(cne $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(this.c.b());
      fbc.a $$6 = $$3.c();
      fbg $$7 = $$4.getBuffer(f);
      a($$7, $$6, $$5, 0.0F, 0, 0, 1);
      a($$7, $$6, $$5, 1.0F, 0, 1, 1);
      a($$7, $$6, $$5, 1.0F, 1, 1, 0);
      a($$7, $$6, $$5, 0.0F, 1, 0, 0);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void a(fbg $$0, fbc.a $$1, int $$2, float $$3, int $$4, int $$5, int $$6) {
      $$0.a($$1, $$3 - 0.5F, (float)$$4 - 0.25F, 0.0F).a(-1).a((float)$$5, (float)$$6).b(gpw.d).c($$2).b($$1, 0.0F, 1.0F, 0.0F);
   }

   public akq a(cne $$0) {
      return a;
   }
}
