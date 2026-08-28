public class gvd implements gup<dzr> {
   private final gvd.a a;

   public gvd(guq.a $$0) {
      this($$0.f());
   }

   public gvd(glc $$0) {
      this.a = new gvd.a($$0.a(glf.cV));
   }

   public void a(dzr $$0, float $$1, flq $$2, gsc $$3, int $$4, int $$5, ffs $$6) {
      jc $$7 = $$0.m().a(dun.c, jc.b);
      cyy $$8 = $$0.s();
      hnj $$9;
      if ($$8 == null) {
         $$9 = gsw.s;
      } else {
         $$9 = gsw.d($$8);
      }

      float $$11 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$7, $$11, $$9);
   }

   public void a(flq $$0, gsc $$1, int $$2, int $$3, jc $$4, float $$5, hnj $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      flt $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends giy {
      private final glg a;

      public a(glg $$0) {
         super($$0, gsn::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
