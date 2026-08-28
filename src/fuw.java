public class fuw extends fva {
   private static final xj a = xj.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fuw.a v;
   final han w;

   public fuw(frw $$0, fki $$1, han $$2) {
      super($$0, $$1, xj.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void G() {
      this.v = this.s.c(new fuw.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void F() {
      fpw $$0 = this.s.b(fpw.d()).a(8);
      $$0.c().b();
      $$0.a(new fnk(a, this.p));
      fpw $$1 = $$0.a(fpw.e().a(8));
      $$1.a(fmd.a(xj.c("options.font"), $$0x -> this.m.a(new fuv(this, this.c))).a());
      $$1.a(fmd.a(xi.d, $$0x -> this.K()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void K() {
      fuw.a.a $$0 = this.v.h();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fmz<fuw.a.a> {
      public a(final fke $$0) {
         super($$0, fuw.this.n, fuw.this.o - 33 - 53, 33, 18);
         String $$1 = fuw.this.w.a();
         fuw.this.w.b().forEach(($$1x, $$2) -> {
            fuw.a.a $$3 = new fuw.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.h() != null) {
            this.e(this.h());
         }
      }

      @Override
      public int b() {
         return super.b() + 50;
      }

      public class a extends fmz.a<fuw.a.a> {
         final String b;
         private final xj c;
         private long d;

         public a(final String $$1, final ham $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fuw.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fqg.a($$0)) {
               this.b();
               fuw.this.K();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ae.c() - this.d < 250L) {
               fuw.this.K();
            }

            this.d = ae.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xj a() {
            return xj.a("narrator.select", this.c);
         }
      }
   }
}
