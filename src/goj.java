public class goj implements gnw<dwj> {
   private final goj.a a;

   public goj(gnx.a $$0) {
      this.a = new goj.a($$0.a(gen.cC));
   }

   public void a(dwj $$0, float $$1, fgs $$2, gll $$3, int $$4, int $$5) {
      jm $$6 = jm.b;
      if ($$0.l()) {
         dxv $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof dro) {
            $$6 = $$7.c(dro.b);
         }
      }

      cwm $$8 = $$0.t();
      hdu $$9;
      if ($$8 == null) {
         $$9 = gmg.i;
      } else {
         $$9 = gmg.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fgw $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends gch {
      private final geo a;

      public a(geo $$0) {
         super($$0, glv::g);
         this.a = $$0.b("lid");
      }

      public void a(dwj $$0, float $$1) {
         this.a.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }
   }
}
