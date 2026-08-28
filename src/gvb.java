public class gvb implements gun<dzp> {
   private final gvb.a a;

   public gvb(guo.a $$0) {
      this($$0.f());
   }

   public gvb(gla $$0) {
      this.a = new gvb.a($$0.a(gld.cV));
   }

   public void a(dzp $$0, float $$1, flo $$2, gsa $$3, int $$4, int $$5, ffq $$6) {
      jb $$7 = $$0.m().a(dul.c, jb.b);
      cyw $$8 = $$0.s();
      hnh $$9;
      if ($$8 == null) {
         $$9 = gsu.s;
      } else {
         $$9 = gsu.d($$8);
      }

      float $$11 = $$0.a($$1);
      this.a($$2, $$3, $$4, $$5, $$7, $$11, $$9);
   }

   public void a(flo $$0, gsa $$1, int $$2, int $$3, jb $$4, float $$5, hnh $$6) {
      $$0.a();
      $$0.a(0.5F, 0.5F, 0.5F);
      float $$7 = 0.9995F;
      $$0.b(0.9995F, 0.9995F, 0.9995F);
      $$0.a($$4.b());
      $$0.b(1.0F, -1.0F, -1.0F);
      $$0.a(0.0F, -1.0F, 0.0F);
      this.a.a($$5);
      flr $$8 = $$6.a($$1, this.a::a);
      this.a.a($$0, $$8, $$2, $$3);
      $$0.b();
   }

   static class a extends giw {
      private final gle a;

      public a(gle $$0) {
         super($$0, gsl::g);
         this.a = $$0.b("lid");
      }

      public void a(float $$0) {
         this.a.a(0.0F, 24.0F - $$0 * 0.5F * 16.0F, 0.0F);
         this.a.f = 270.0F * $$0 * (float) (Math.PI / 180.0);
      }
   }
}
