public class gjp implements gjc<dsp> {
   private final gjp.a a;

   public gjp(gjd.a $$0) {
      this.a = new gjp.a($$0.a(gaa.ci));
   }

   public void a(dsp $$0, float $$1, fcu $$2, ggv $$3, int $$4, int $$5) {
      jj $$6 = jj.b;
      if ($$0.l()) {
         dua $$7 = $$0.i().a_($$0.aD_());
         if ($$7.b() instanceof dnv) {
            $$6 = $$7.c(dnv.b);
         }
      }

      cue $$8 = $$0.t();
      gyq $$9;
      if ($$8 == null) {
         $$9 = ghm.i;
      } else {
         $$9 = ghm.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fcy $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends fxv {
      private final gab a;
      private final gab b;

      public a(gab $$0) {
         super(ghe::f);
         this.a = $$0;
         this.b = $$0.b("lid");
      }

      public void a(dsp $$0, float $$1) {
         this.b.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.b.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }

      @Override
      public gab a() {
         return this.a;
      }
   }
}
