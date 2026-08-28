public class gdf extends gdn {
   private static final ayw a = ayw.a();
   private final gdi b;
   private float F = 1.0F;

   gdf(fzf $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, gdi $$7) {
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
   public gcr b() {
      return gcr.c;
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
      fgo $$0 = fgo.Q();
      geb $$1 = $$0.s;
      return $$1 != null && $$1.by().c(this.g, this.h, this.i) <= 9.0 && $$0.m.aB().a() && $$1.gw();
   }

   public static class a implements gcq<lq> {
      private final gdi a;

      public a(gdi $$0) {
         this.a = $$0;
      }

      public gcn a(lq $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class b implements gcq<lf> {
      private final gdi a;

      public b(gdi $$0) {
         this.a = $$0;
      }

      public gcn a(lf $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gcn $$8 = new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.a($$0.b(), $$0.c(), $$0.d());
         $$8.e($$0.e());
         return $$8;
      }
   }

   public static class c implements gcq<lq> {
      private final gdi a;

      public c(gdi $$0) {
         this.a = $$0;
      }

      public gcn a(lq $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }

   public static class d implements gcq<lq> {
      private final gdi a;

      public d(gdi $$0) {
         this.a = $$0;
      }

      public gcn a(lq $$0, fzf $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdf $$8 = new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         float $$9 = $$1.z.i() * 0.5F + 0.35F;
         $$8.a(1.0F * $$9, 0.0F * $$9, 1.0F * $$9);
         return $$8;
      }
   }
}
