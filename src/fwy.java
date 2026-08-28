public class fwy extends fxc {
   private static final xv a = xv.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fwy.a v;
   final hcu w;

   public fwy(fty $$0, fmk $$1, hcu $$2) {
      super($$0, $$1, xv.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fwy.a(this.m));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void E() {
      fry $$0 = this.s.b(fry.d()).a(8);
      $$0.c().b();
      $$0.a(new fpn(a, this.p));
      fry $$1 = $$0.a(fry.e().a(8));
      $$1.a(fof.a(xv.c("options.font"), $$0x -> this.m.a(new fwx(this, this.c))).a());
      $$1.a(fof.a(xu.d, $$0x -> this.J()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void J() {
      fwy.a.a $$0 = this.v.g();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fpc<fwy.a.a> {
      public a(final fmg $$0) {
         super($$0, fwy.this.n, fwy.this.o - 33 - 53, 33, 18);
         String $$1 = fwy.this.w.a();
         fwy.this.w.b().forEach(($$1x, $$2) -> {
            fwy.a.a $$3 = new fwy.a.a($$1x, $$2);
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

      public class a extends fpc.a<fwy.a.a> {
         final String b;
         private final xv c;
         private long d;

         public a(final String $$1, final hct $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fns $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fwy.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fsi.a($$0)) {
               this.b();
               fwy.this.J();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ae.c() - this.d < 250L) {
               fwy.this.J();
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
