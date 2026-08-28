public class glf implements gks<dtx> {
   private final glf.a a;

   public glf(gkt.a $$0) {
      this.a = new glf.a($$0.a(gbl.cj));
   }

   public void a(dtx $$0, float $$1, feb $$2, gih $$3, int $$4, int $$5) {
      jm $$6 = jm.b;
      if ($$0.l()) {
         dvj $$7 = $$0.i().a_($$0.aB_());
         if ($$7.b() instanceof dpd) {
            $$6 = $$7.c(dpd.b);
         }
      }

      cuy $$8 = $$0.t();
      ham $$9;
      if ($$8 == null) {
         $$9 = gjc.i;
      } else {
         $$9 = gjc.j.get($$8.a());
      }

      $$2.a();
      $$2.a(0.5F, 0.5F, 0.5F);
      float $$11 = 0.9995F;
      $$2.b(0.9995F, 0.9995F, 0.9995F);
      $$2.a($$6.b());
      $$2.b(1.0F, -1.0F, -1.0F);
      $$2.a(0.0F, -1.0F, 0.0F);
      this.a.a($$0, $$1);
      fef $$12 = $$9.a($$3, this.a::a);
      this.a.a($$2, $$12, $$4, $$5);
      $$2.b();
   }

   static class a extends fzf {
      private final gbm a;

      public a(gbm $$0) {
         super($$0, gir::f);
         this.a = $$0.b("lid");
      }

      public void a(dtx $$0, float $$1) {
         this.a.a(0.0F, 24.0F - $$0.a($$1) * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0.a($$1) * (float) (Math.PI / 180.0);
      }
   }
}
