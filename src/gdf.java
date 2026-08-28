public class gdf extends gdh {
   gdf(fyz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      float $$7 = this.r.i() * 0.1F + 0.2F;
      this.v = $$7;
      this.w = $$7;
      this.x = $$7;
      this.b(0.02F, 0.02F);
      this.D = this.D * (this.r.i() * 0.6F + 0.5F);
      this.j *= 0.02F;
      this.k *= 0.02F;
      this.l *= 0.02F;
      this.t = (int)(20.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public gcl b() {
      return gcl.b;
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.a(this.n().d($$0, $$1, $$2));
      this.l();
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.t-- <= 0) {
         this.k();
      } else {
         this.a(this.j, this.k, this.l);
         this.j *= 0.99;
         this.k *= 0.99;
         this.l *= 0.99;
      }
   }

   public static class a implements gck<lq> {
      private final gdc a;

      public a(gdc $$0) {
         this.a = $$0;
      }

      public gch a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdf $$8 = new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         $$8.a(3 + $$1.E_().a(5));
         return $$8;
      }
   }

   public static class b implements gck<lq> {
      private final gdc a;

      public b(gdc $$0) {
         this.a = $$0;
      }

      public gch a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdf $$8 = new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(0.3F, 0.5F, 1.0F);
         $$8.a(this.a);
         $$8.e(1.0F - $$1.z.i() * 0.7F);
         $$8.a($$8.j() / 2);
         return $$8;
      }
   }

   public static class c implements gck<lq> {
      private final gdc a;

      public c(gdc $$0) {
         this.a = $$0;
      }

      public gch a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdf $$8 = new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         return $$8;
      }
   }

   public static class d implements gck<lq> {
      private final gdc a;

      public d(gdc $$0) {
         this.a = $$0;
      }

      public gch a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdf $$8 = new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         $$8.a(1.0F, 1.0F, 1.0F);
         return $$8;
      }
   }

   public static class e implements gck<lq> {
      private final gdc a;

      public e(gdc $$0) {
         this.a = $$0;
      }

      public gch a(lq $$0, fyz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         gdf $$8 = new gdf($$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$8.a(this.a);
         return $$8;
      }
   }
}
