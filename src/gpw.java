public class gpw implements gpj<dwe> {
   private final gpw.a a;

   public gpw(gpk.a $$0) {
      this($$0.f());
   }

   public gpw(gfy $$0) {
      this.a = new gpw.a($$0.a(ggb.cH));
   }

   public void a(dwe $$0, float $$1, fgr $$2, gmx $$3, int $$4, int $$5) {
      jn $$6 = $$0.m().a(drj.c, jn.b);
      cwe $$7 = $$0.s();
      hhy $$8;
      if ($$7 == null) {
         $$8 = gns.i;
      } else {
         $$8 = gns.d($$7);
      }

      float $$10 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$6, $$10, $$8);
   }

   public void a(fgr $$0, gmx $$1, int $$2, int $$3, jn $$4, float $$5, hhy $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      fgv $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends gdv {
      private final ggc a;

      public a(ggc $$0) {
         super($$0, gnh::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
