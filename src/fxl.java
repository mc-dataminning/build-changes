public class fxl extends fxp {
   private static final wp a = wp.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fxl.a v;
   final hgc w;

   public fxl(ful $$0, fln $$1, hgc $$2) {
      super($$0, $$1, wp.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fxl.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fsl $$0 = this.s.b(fsl.d()).a(8);
      $$0.c().b();
      $$0.a(new fqa(a, this.p));
      fsl $$1 = $$0.a(fsl.e().a(8));
      $$1.a(fot.a(wp.c("options.font"), $$0x -> this.m.a(new fxk(this, this.c))).a());
      $$1.a(fot.a(wo.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      fxl.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fpp<fxl.a.a> {
      public a(final flj $$0) {
         super($$0, fxl.this.n, fxl.this.o - 33 - 53, 33, 18);
         String $$1 = fxl.this.w.a();
         fxl.this.w.b().forEach(($$1x, $$2) -> {
            fxl.a.a $$3 = new fxl.a.a($$1x, $$2);
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

      public class a extends fpp.a<fxl.a.a> {
         final String b;
         private final wp c;
         private long d;

         public a(final String $$1, final hgb $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fxl.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fsv.a($$0)) {
               this.b();
               fxl.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (af.c() - this.d < 250L) {
               fxl.this.H();
            }

            this.d = af.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wp a() {
            return wp.a("narrator.select", this.c);
         }
      }
   }
}
