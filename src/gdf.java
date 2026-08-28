public class gdf extends gdj {
   private static final xa a = xa.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private gdf.a v;
   final hmk w;

   public gdf(gad $$0, frh $$1, hmk $$2) {
      super($$0, $$1, xa.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new gdf.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fyd $$0 = this.s.b(fyd.d()).a(8);
      $$0.c().b();
      $$0.a(new fvs(a, this.p));
      fyd $$1 = $$0.a(fyd.e().a(8));
      $$1.a(ful.a(xa.c("options.font"), $$0x -> this.m.a(new gde(this, this.c))).a());
      $$1.a(ful.a(wz.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      gdf.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fvh<gdf.a.a> {
      public a(final frd $$0) {
         super($$0, gdf.this.n, gdf.this.o - 33 - 53, 33, 18);
         String $$1 = gdf.this.w.a();
         gdf.this.w.b().forEach(($$1x, $$2) -> {
            gdf.a.a $$3 = new gdf.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.p() != null) {
            this.e(this.p());
         }
      }

      @Override
      public int a() {
         return super.a() + 50;
      }

      public class a extends fvh.a<gdf.a.a> {
         final String b;
         private final xa c;
         private long d;

         public a(final String $$1, final hmj $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gdf.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fyn.a($$0)) {
               this.b();
               gdf.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ag.c() - this.d < 250L) {
               gdf.this.H();
            }

            this.d = ag.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xa a() {
            return xa.a("narrator.select", this.c);
         }
      }
   }
}
