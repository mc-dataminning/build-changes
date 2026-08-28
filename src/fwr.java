public class fwr extends fwv {
   private static final xk a = xk.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private fwr.a v;
   final hcp w;

   public fwr(ftr $$0, fmd $$1, hcp $$2) {
      super($$0, $$1, xk.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new fwr.a(this.m));
   }

   @Override
   protected void l() {
   }

   @Override
   protected void E() {
      frr $$0 = this.s.b(frr.d()).a(8);
      $$0.c().b();
      $$0.a(new fpg(a, this.p));
      frr $$1 = $$0.a(frr.e().a(8));
      $$1.a(fny.a(xk.c("options.font"), $$0x -> this.m.a(new fwq(this, this.c))).a());
      $$1.a(fny.a(xj.d, $$0x -> this.J()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void J() {
      fwr.a.a $$0 = this.v.g();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fov<fwr.a.a> {
      public a(final flz $$0) {
         super($$0, fwr.this.n, fwr.this.o - 33 - 53, 33, 18);
         String $$1 = fwr.this.w.a();
         fwr.this.w.b().forEach(($$1x, $$2) -> {
            fwr.a.a $$3 = new fwr.a.a($$1x, $$2);
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

      public class a extends fov.a<fwr.a.a> {
         final String b;
         private final xk c;
         private long d;

         public a(final String $$1, final hco $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fnl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(fwr.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fsb.a($$0)) {
               this.b();
               fwr.this.J();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (ae.c() - this.d < 250L) {
               fwr.this.J();
            }

            this.d = ae.c();
            return super.a($$0, $$1, $$2);
         }

         private void b() {
            a.this.a(this);
         }

         @Override
         public xk a() {
            return xk.a("narrator.select", this.c);
         }
      }
   }
}
