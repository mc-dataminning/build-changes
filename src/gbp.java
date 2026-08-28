public class gbp extends gbt {
   private static final wy a = wy.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private gbp.a v;
   final hkt w;

   public gbp(fyn $$0, fps $$1, hkt $$2) {
      super($$0, $$1, wy.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new gbp.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fwn $$0 = this.s.b(fwn.d()).a(8);
      $$0.c().b();
      $$0.a(new fuc(a, this.p));
      fwn $$1 = $$0.a(fwn.e().a(8));
      $$1.a(fsv.a(wy.c("options.font"), $$0x -> this.m.a(new gbo(this, this.c))).a());
      $$1.a(fsv.a(wx.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      gbp.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends ftr<gbp.a.a> {
      public a(final fpo $$0) {
         super($$0, gbp.this.n, gbp.this.o - 33 - 53, 33, 18);
         String $$1 = gbp.this.w.a();
         gbp.this.w.b().forEach(($$1x, $$2) -> {
            gbp.a.a $$3 = new gbp.a.a($$1x, $$2);
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

      public class a extends ftr.a<gbp.a.a> {
         final String b;
         private final wy c;
         private long d;

         public a(final String $$1, final hks $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gbp.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fwx.a($$0)) {
               this.b();
               gbp.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ag.c() - this.d < 250L) {
               gbp.this.H();
            }

            this.d = ag.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.c);
         }
      }
   }
}
