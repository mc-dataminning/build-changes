public class gke implements gjr<dtd> {
   private final gke.a a;

   public gke(gjs.a $$0) {
      this.a = new gke.a($$0.a(gak.cj));
   }

   public void a(dtd $$0, float $$1, fde $$2, ghg $$3, int $$4, int $$5) {
      jj $$6 = jj.b;
      if ($$0.l()) {
         duo $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof doj) {
            $$6 = $$7.c(doj.b);
         }
      }

      cuj $$8 = $$0.t();
      gzh $$9;
      if ($$8 == null) {
         $$9 = gib.i;
      } else {
         $$9 = gib.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fdi $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends fyf {
      private final gal a;
      private final gal b;

      public a(gal $$0) {
         super(ghq::f);
         this.a = $$0;
         this.b = $$0.b("lid");
      }

      public void a(dtd $$0, float $$1) {
         this.b.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.b.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }

      @Override
      public gal a() {
         return this.a;
      }
   }
}
