public class fyi extends fym {
   private static final wp a = wp.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fyi.a v;
   final hhb w;

   public fyi(fvi $$0, fmk $$1, hhb $$2) {
      super($$0, $$1, wp.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fyi.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fti $$0 = this.s.b(fti.d()).a(8);
      $$0.c().b();
      $$0.a(new fqx(a, this.p));
      fti $$1 = $$0.a(fti.e().a(8));
      $$1.a(fpq.a(wp.c("options.font"), $$0x -> this.m.a(new fyh(this, this.c))).a());
      $$1.a(fpq.a(wo.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      fyi.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fqm<fyi.a.a> {
      public a(final fmg $$0) {
         super($$0, fyi.this.n, fyi.this.o - 33 - 53, 33, 18);
         String $$1 = fyi.this.w.a();
         fyi.this.w.b().forEach(($$1x, $$2) -> {
            fyi.a.a $$3 = new fyi.a.a($$1x, $$2);
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

      public class a extends fqm.a<fyi.a.a> {
         final String b;
         private final wp c;
         private long d;

         public a(final String $$1, final hha $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fyi.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fts.a($$0)) {
               this.b();
               fyi.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (af.c() - this.d < 250L) {
               fyi.this.H();
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
