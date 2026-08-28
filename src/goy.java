public class goy implements gol<dvm> {
   private final goy.a a;

   public goy(gom.a $$0) {
      this($$0.f());
   }

   public goy(gfa $$0) {
      this.a = new goy.a($$0.a(gfd.cF));
   }

   public void a(dvm $$0, float $$1, ffv $$2, glz $$3, int $$4, int $$5) {
      jn $$6 = $$0.m().a(dqr.b, jn.b);
      cvn $$7 = $$0.s();
      hha $$8;
      if ($$7 == null) {
         $$8 = gmu.i;
      } else {
         $$8 = gmu.d($$7);
      }

      float $$10 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$6, $$10, $$8);
   }

   public void a(ffv $$0, glz $$1, int $$2, int $$3, jn $$4, float $$5, hha $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      ffz $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends gcx {
      private final gfe a;

      public a(gfe $$0) {
         super($$0, gmj::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
