public class gdh extends gdl {
   private static final xc a = xc.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private gdh.a v;
   final hmm w;

   public gdh(gaf $$0, frj $$1, hmm $$2) {
      super($$0, $$1, xc.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new gdh.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fyf $$0 = this.s.b(fyf.d()).a(8);
      $$0.c().b();
      $$0.a(new fvu(a, this.p));
      fyf $$1 = $$0.a(fyf.e().a(8));
      $$1.a(fun.a(xc.c("options.font"), $$0x -> this.m.a(new gdg(this, this.c))).a());
      $$1.a(fun.a(xb.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      gdh.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fvj<gdh.a.a> {
      public a(final frf $$0) {
         super($$0, gdh.this.n, gdh.this.o - 33 - 53, 33, 18);
         String $$1 = gdh.this.w.a();
         gdh.this.w.b().forEach(($$1x, $$2) -> {
            gdh.a.a $$3 = new gdh.a.a($$1x, $$2);
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

      public class a extends fvj.a<gdh.a.a> {
         final String b;
         private final xc c;
         private long d;

         public a(final String $$1, final hml $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gdh.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fyp.a($$0)) {
               this.b();
               gdh.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ag.c() - this.d < 250L) {
               gdh.this.H();
            }

            this.d = ag.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xc a() {
            return xc.a("narrator.select", this.c);
         }
      }
   }
}
