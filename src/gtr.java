public class gtr implements gtd<dze> {
   private final gtr.a a;

   public gtr(gte.a $$0) {
      this($$0.f());
   }

   public gtr(gjp $$0) {
      this.a = new gtr.a($$0.a(gjs.cV));
   }

   public void a(dze $$0, float $$1, fkd $$2, gqr $$3, int $$4, int $$5, ffc $$6) {
      jb $$7 = $$0.m().a(dua.c, jb.b);
      cyl $$8 = $$0.s();
      hlx $$9;
      if ($$8 == null) {
         $$9 = grl.s;
      } else {
         $$9 = grl.d($$8);
      }

      float $$11 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$7, $$11, $$9);
   }

   public void a(fkd $$0, gqr $$1, int $$2, int $$3, jb $$4, float $$5, hlx $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      fkh $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends ghl {
      private final gjt a;

      public a(gjt $$0) {
         super($$0, grc::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
