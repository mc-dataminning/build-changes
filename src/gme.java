public class gme implements glr<duj> {
   private final gme.a a;

   public gme(gls.a $$0) {
      this.a = new gme.a($$0.a(gck.cz));
   }

   public void a(duj $$0, float $$1, fer $$2, gjg $$3, int $$4, int $$5) {
      jm $$6 = jm.b;
      if ($$0.l()) {
         dvv $$7 = $$0.i().a_($$0.aA_());
         if ($$7.b() instanceof dpp) {
            $$6 = $$7.c(dpp.b);
         }
      }

      cvj $$8 = $$0.t();
      hbn $$9;
      if ($$8 == null) {
         $$9 = gkb.i;
      } else {
         $$9 = gkb.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fev $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends gae {
      private final gcl a;

      public a(gcl $$0) {
         super($$0, gjq::f);
         this.a = $$0.b("lid");
      }

      public void a(duj $$0, float $$1) {
         this.a.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }
   }
}
