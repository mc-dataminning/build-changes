public class gdd extends gdl {
   private static final ayw a = ayw.a();
   private final gdg b;
   private float F = 1.0F;

   gdd(fzd $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gdg $$7) {
      super($$0, $$1, $$2, $$3, 0.5 - a.j(), $$5, 0.5 - a.j());
      this.B = 0.96F;
      this.u = -0.1F;
      this.C = true;
      this.b = $$7;
      this.k *= 0.2F;
      if ($$4 == 0.0 && $$6 == 0.0) {
         this.j *= 0.1F;
         this.l *= 0.1F;
      }

      this.D *= 0.75F;
      this.t = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.n = false;
      this.b($$7);
      if (this.g()) {
         this.e(0.0F);
      }
   }

   @Override
   public gcp b() {
      return gcp.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.b);
      if (this.g()) {
         this.y = 0.0F;
      } else {
         this.y = ayo.i(0.05F, this.y, this.F);
      }
   }

   @Override
   protected void e(float $$0) {
      super.e($$0);
      this.F = $$0;
   }

   private boolean g() {
      fgm $$0 = fgm.Q();
      gdz $$1 = $$0.s;
      return $$1 != null && $$1.by().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aA().a() && $$1.gx();
   }

   public static class a implements gco<lq> {
      private final gdg a;

      public a(gdg $$0) {
         this.a = $$0;
      }

      public gcl a(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gco<lf> {
      private final gdg a;

      public b(gdg $$0) {
         this.a = $$0;
      }

      public gcl a(lf $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcl $$8 = new gdd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gco<lq> {
      private final gdg a;

      public c(gdg $$0) {
         this.a = $$0;
      }

      public gcl a(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gco<lq> {
      private final gdg a;

      public d(gdg $$0) {
         this.a = $$0;
      }

      public gcl a(lq $$0, fzd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdd $$8 = new gdd($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
