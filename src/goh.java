public class goh implements gnu<dwi> {
   private final goh.a a;

   public goh(gnv.a $$0) {
      this.a = new goh.a($$0.a(gel.cC));
   }

   public void a(dwi $$0, float $$1, fgq $$2, glj $$3, int $$4, int $$5) {
      jm $$6 = jm.b;
      if ($$0.l()) {
         dxu $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof drn) {
            $$6 = $$7.c(drn.b);
         }
      }

      cwl $$8 = $$0.t();
      hds $$9;
      if ($$8 == null) {
         $$9 = gme.i;
      } else {
         $$9 = gme.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fgu $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends gcf {
      private final gem a;

      public a(gem $$0) {
         super($$0, glt::f);
         this.a = $$0.b("lid");
      }

      public void a(dwi $$0, float $$1) {
         this.a.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }
   }
}
