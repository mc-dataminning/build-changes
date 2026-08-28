public class gov implements goi<dvl> {
   private final gov.a a;

   public gov(goj.a $$0) {
      this($$0.f());
   }

   public gov(gey $$0) {
      this.a = new gov.a($$0.a(gfb.cF));
   }

   public void a(dvl $$0, float $$1, ffu $$2, glx $$3, int $$4, int $$5) {
      jn $$6 = $$0.m().a(dqq.b, jn.b);
      cvm $$7 = $$0.s();
      hgs $$8;
      if ($$7 == null) {
         $$8 = gms.i;
      } else {
         $$8 = gms.d($$7);
      }

      float $$10 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$6, $$10, $$8);
   }

   public void a(ffu $$0, glx $$1, int $$2, int $$3, jn $$4, float $$5, hgs $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      ffy $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends gcv {
      private final gfc a;

      public a(gfc $$0) {
         super($$0, gmh::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
