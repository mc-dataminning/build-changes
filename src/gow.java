public class gow implements goj<dvk> {
   private final gow.a a;

   public gow(gok.a $$0) {
      this($$0.f());
   }

   public gow(gey $$0) {
      this.a = new gow.a($$0.a(gfb.cF));
   }

   public void a(dvk $$0, float $$1, fft $$2, glx $$3, int $$4, int $$5) {
      jn $$6 = $$0.m().a(dqp.b, jn.b);
      cvl $$7 = $$0.s();
      hgy $$8;
      if ($$7 == null) {
         $$8 = gms.i;
      } else {
         $$8 = gms.d($$7);
      }

      float $$10 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$6, $$10, $$8);
   }

   public void a(fft $$0, glx $$1, int $$2, int $$3, jn $$4, float $$5, hgy $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      ffx $$8 = $$6.a($$1, this.a::a);
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
