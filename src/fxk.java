public class fxk extends fxo {
   private static final wp a = wp.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fxk.a v;
   final hgb w;

   public fxk(fuk $$0, flm $$1, hgb $$2) {
      super($$0, $$1, wp.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fxk.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fsk $$0 = this.s.b(fsk.d()).a(8);
      $$0.c().b();
      $$0.a(new fpz(a, this.p));
      fsk $$1 = $$0.a(fsk.e().a(8));
      $$1.a(fos.a(wp.c("options.font"), $$0x -> this.m.a(new fxj(this, this.c))).a());
      $$1.a(fos.a(wo.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      fxk.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fpo<fxk.a.a> {
      public a(final fli $$0) {
         super($$0, fxk.this.n, fxk.this.o - 33 - 53, 33, 18);
         String $$1 = fxk.this.w.a();
         fxk.this.w.b().forEach(($$1x, $$2) -> {
            fxk.a.a $$3 = new fxk.a.a($$1x, $$2);
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

      public class a extends fpo.a<fxk.a.a> {
         final String b;
         private final wp c;
         private long d;

         public a(final String $$1, final hga $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fod $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fxk.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fsu.a($$0)) {
               this.b();
               fxk.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (af.c() - this.d < 250L) {
               fxk.this.H();
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
