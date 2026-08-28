public class gcs extends gcw {
   private static final xg a = xg.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private gcs.a v;
   final hma w;

   public gcs(fzq $$0, fqu $$1, hma $$2) {
      super($$0, $$1, xg.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new gcs.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fxq $$0 = this.s.b(fxq.d()).a(8);
      $$0.c().b();
      $$0.a(new fvf(a, this.p));
      fxq $$1 = $$0.a(fxq.e().a(8));
      $$1.a(fty.a(xg.c("options.font"), $$0x -> this.m.a(new gcr(this, this.c))).a());
      $$1.a(fty.a(xf.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      gcs.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fuu<gcs.a.a> {
      public a(final fqq $$0) {
         super($$0, gcs.this.n, gcs.this.o - 33 - 53, 33, 18);
         String $$1 = gcs.this.w.a();
         gcs.this.w.b().forEach(($$1x, $$2) -> {
            gcs.a.a $$3 = new gcs.a.a($$1x, $$2);
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

      public class a extends fuu.a<gcs.a.a> {
         final String b;
         private final xg c;
         private long d;

         public a(final String $$1, final hlz $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gcs.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fya.a($$0)) {
               this.b();
               gcs.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ag.c() - this.d < 250L) {
               gcs.this.H();
            }

            this.d = ag.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xg a() {
            return xg.a("narrator.select", this.c);
         }
      }
   }
}
