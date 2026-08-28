public class fzh extends fzl {
   private static final wv a = wv.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fzh.a v;
   final hic w;

   public fzh(fwf $$0, fnh $$1, hic $$2) {
      super($$0, $$1, wv.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fzh.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fuf $$0 = this.s.b(fuf.d()).a(8);
      $$0.c().b();
      $$0.a(new fru(a, this.p));
      fuf $$1 = $$0.a(fuf.e().a(8));
      $$1.a(fqn.a(wv.c("options.font"), $$0x -> this.m.a(new fzg(this, this.c))).a());
      $$1.a(fqn.a(wu.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      fzh.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends frj<fzh.a.a> {
      public a(final fnd $$0) {
         super($$0, fzh.this.n, fzh.this.o - 33 - 53, 33, 18);
         String $$1 = fzh.this.w.a();
         fzh.this.w.b().forEach(($$1x, $$2) -> {
            fzh.a.a $$3 = new fzh.a.a($$1x, $$2);
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

      public class a extends frj.a<fzh.a.a> {
         final String b;
         private final wv c;
         private long d;

         public a(final String $$1, final hib $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fzh.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fup.a($$0)) {
               this.b();
               fzh.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (af.c() - this.d < 250L) {
               fzh.this.H();
            }

            this.d = af.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wv a() {
            return wv.a("narrator.select", this.c);
         }
      }
   }
}
