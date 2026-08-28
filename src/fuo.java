public class fuo extends fus {
   private static final xl a = xl.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fuo.a v;
   final hac w;

   public fuo(frp $$0, fkb $$1, hac $$2) {
      super($$0, $$1, xl.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void E() {
      this.v = this.s.c(new fuo.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void D() {
      fpp $$0 = this.s.b(fpp.d()).a(8);
      $$0.c().b();
      $$0.a(new fnd(a, this.p));
      fpp $$1 = $$0.a(fpp.e().a(8));
      $$1.a(flw.a(xl.c("options.font"), $$0x -> this.m.a(new fun(this, this.c))).a());
      $$1.a(flw.a(xk.d, $$0x -> this.G()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void G() {
      fuo.a.a $$0 = this.v.h();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fms<fuo.a.a> {
      public a(final fjx $$0) {
         super($$0, fuo.this.n, fuo.this.o - 33 - 53, 33, 18);
         String $$1 = fuo.this.w.a();
         fuo.this.w.b().forEach(($$1x, $$2) -> {
            fuo.a.a $$3 = new fuo.a.a($$1x, $$2);
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

      public class a extends fms.a<fuo.a.a> {
         final String b;
         private final xl c;
         private long d;

         public a(final String $$1, final hab $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(flj $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fuo.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fpz.a($$0)) {
               this.b();
               fuo.this.G();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ae.c() - this.d < 250L) {
               fuo.this.G();
            }

            this.d = ae.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xl a() {
            return xl.a("narrator.select", this.c);
         }
      }
   }
}
