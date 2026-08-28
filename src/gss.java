public class gss implements gse<dyk> {
   private final gss.a a;

   public gss(gsf.a $$0) {
      this($$0.f());
   }

   public gss(giq $$0) {
      this.a = new gss.a($$0.a(git.cR));
   }

   public void a(dyk $$0, float $$1, fjc $$2, gps $$3, int $$4, int $$5, fei $$6) {
      ja $$7 = $$0.m().a(dth.c, ja.b);
      cxw $$8 = $$0.s();
      hkw $$9;
      if ($$8 == null) {
         $$9 = gqn.s;
      } else {
         $$9 = gqn.d($$8);
      }

      float $$11 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$7, $$11, $$9);
   }

   public void a(fjc $$0, gps $$1, int $$2, int $$3, ja $$4, float $$5, hkw $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      fjg $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends ggm {
      private final giu a;

      public a(giu $$0) {
         super($$0, gqc::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
