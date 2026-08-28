public class fxi extends fxm {
   private static final wo a = wo.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fxi.a v;
   final hfw w;

   public fxi(fui $$0, fll $$1, hfw $$2) {
      super($$0, $$1, wo.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fxi.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fsi $$0 = this.s.b(fsi.d()).a(8);
      $$0.c().b();
      $$0.a(new fpx(a, this.p));
      fsi $$1 = $$0.a(fsi.e().a(8));
      $$1.a(fop.a(wo.c("options.font"), $$0x -> this.m.a(new fxh(this, this.c))).a());
      $$1.a(fop.a(wn.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      fxi.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fpm<fxi.a.a> {
      public a(final flh $$0) {
         super($$0, fxi.this.n, fxi.this.o - 33 - 53, 33, 18);
         String $$1 = fxi.this.w.a();
         fxi.this.w.b().forEach(($$1x, $$2) -> {
            fxi.a.a $$3 = new fxi.a.a($$1x, $$2);
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

      public class a extends fpm.a<fxi.a.a> {
         final String b;
         private final wo c;
         private long d;

         public a(final String $$1, final hfv $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fob $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fxi.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fss.a($$0)) {
               this.b();
               fxi.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (af.c() - this.d < 250L) {
               fxi.this.H();
            }

            this.d = af.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wo a() {
            return wo.a("narrator.select", this.c);
         }
      }
   }
}
