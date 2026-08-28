public class fwx extends fxb {
   private static final xv a = xv.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fwx.a v;
   final hct w;

   public fwx(ftx $$0, fmj $$1, hct $$2) {
      super($$0, $$1, xv.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fwx.a(this.m));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void E() {
      frx $$0 = this.s.b(frx.d()).a(8);
      $$0.c().b();
      $$0.a(new fpm(a, this.p));
      frx $$1 = $$0.a(frx.e().a(8));
      $$1.a(foe.a(xv.c("options.font"), $$0x -> this.m.a(new fww(this, this.c))).a());
      $$1.a(foe.a(xu.d, $$0x -> this.J()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void J() {
      fwx.a.a $$0 = this.v.g();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fpb<fwx.a.a> {
      public a(final fmf $$0) {
         super($$0, fwx.this.n, fwx.this.o - 33 - 53, 33, 18);
         String $$1 = fwx.this.w.a();
         fwx.this.w.b().forEach(($$1x, $$2) -> {
            fwx.a.a $$3 = new fwx.a.a($$1x, $$2);
            this.b($$3);
            if ($$1.equals($$1x)) {
               this.a($$3);
            }
         });
         if (this.g() != null) {
            this.e(this.g());
         }
      }

      @Override
      public int a() {
         return super.a() + 50;
      }

      public class a extends fpb.a<fwx.a.a> {
         final String b;
         private final xv c;
         private long d;

         public a(final String $$1, final hcs $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fnr $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fwx.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fsh.a($$0)) {
               this.b();
               fwx.this.J();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ae.c() - this.d < 250L) {
               fwx.this.J();
            }

            this.d = ae.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xv a() {
            return xv.a("narrator.select", this.c);
         }
      }
   }
}
