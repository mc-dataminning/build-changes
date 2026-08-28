public class gkj implements gjw<dtg> {
   private final gkj.a a;

   public gkj(gjx.a $$0) {
      this.a = new gkj.a($$0.a(gap.cj));
   }

   public void a(dtg $$0, float $$1, fdi $$2, ghl $$3, int $$4, int $$5) {
      jk $$6 = jk.b;
      if ($$0.l()) {
         dus $$7 = $$0.i().a_($$0.aC_());
         if ($$7.b() instanceof dom) {
            $$6 = $$7.c(dom.b);
         }
      }

      cum $$8 = $$0.t();
      gzm $$9;
      if ($$8 == null) {
         $$9 = gig.i;
      } else {
         $$9 = gig.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fdm $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends fyj {
      private final gaq a;

      public a(gaq $$0) {
         super($$0, ghv::f);
         this.a = $$0.b("lid");
      }

      public void a(dtg $$0, float $$1) {
         this.a.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }
   }
}
