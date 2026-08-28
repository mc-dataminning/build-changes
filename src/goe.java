public class goe implements gnr<dwc> {
   private final goe.a a;

   public goe(gns.a $$0) {
      this.a = new goe.a($$0.a(gei.cF));
   }

   public void a(dwc $$0, float $$1, fgl $$2, glg $$3, int $$4, int $$5) {
      jm $$6 = jm.b;
      if ($$0.l()) {
         dxo $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof drh) {
            $$6 = $$7.c(drh.b);
         }
      }

      cwd $$8 = $$0.s();
      hdp $$9;
      if ($$8 == null) {
         $$9 = gmb.i;
      } else {
         $$9 = gmb.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fgp $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends gcc {
      private final gej a;

      public a(gej $$0) {
         super($$0, glq::g);
         this.a = $$0.b("lid");
      }

      public void a(dwc $$0, float $$1) {
         this.a.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }
   }
}
