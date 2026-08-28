public class gak extends gao {
   private static final ww a = ww.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private gak.a v;
   final hji w;

   public gak(fxi $$0, foj $$1, hji $$2) {
      super($$0, $$1, ww.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new gak.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fvi $$0 = this.s.b(fvi.d()).a(8);
      $$0.c().b();
      $$0.a(new fsx(a, this.p));
      fvi $$1 = $$0.a(fvi.e().a(8));
      $$1.a(frq.a(ww.c("options.font"), $$0x -> this.m.a(new gaj(this, this.c))).a());
      $$1.a(frq.a(wv.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      gak.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fsm<gak.a.a> {
      public a(final fof $$0) {
         super($$0, gak.this.n, gak.this.o - 33 - 53, 33, 18);
         String $$1 = gak.this.w.a();
         gak.this.w.b().forEach(($$1x, $$2) -> {
            gak.a.a $$3 = new gak.a.a($$1x, $$2);
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

      public class a extends fsm.a<gak.a.a> {
         final String b;
         private final ww c;
         private long d;

         public a(final String $$1, final hjh $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(frc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gak.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fvs.a($$0)) {
               this.b();
               gak.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (af.c() - this.d < 250L) {
               gak.this.H();
            }

            this.d = af.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public ww a() {
            return ww.a("narrator.select", this.c);
         }
      }
   }
}
