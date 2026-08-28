public class gaw extends gba {
   private static final wy a = wy.c("options.languageAccuracyWarning").b(-4539718);
   private static final int u = 53;
   private gaw.a v;
   final hjy w;

   public gaw(fxu $$0, fow $$1, hjy $$2) {
      super($$0, $$1, wy.c("options.language.title"));
      this.w = $$2;
      this.s.a(53);
   }

   @Override
   protected void F() {
      this.v = this.s.c(new gaw.a(this.m));
   }

   @Override
   protected void m() {
   }

   @Override
   protected void E() {
      fvu $$0 = this.s.b(fvu.d()).a(8);
      $$0.c().b();
      $$0.a(new ftj(a, this.p));
      fvu $$1 = $$0.a(fvu.e().a(8));
      $$1.a(fsc.a(wy.c("options.font"), $$0x -> this.m.a(new gav(this, this.c))).a());
      $$1.a(fsc.a(wx.d, $$0x -> this.H()).a());
   }

   @Override
   protected void c() {
      super.c();
      this.v.a(this.n, this.s);
   }

   void H() {
      gaw.a.a $$0 = this.v.p();
      if ($$0 != null && !$$0.b.equals(this.w.a())) {
         this.w.a($$0.b);
         this.c.ab = $$0.b;
         this.m.l();
      }

      this.m.a(this.b);
   }

   class a extends fsy<gaw.a.a> {
      public a(final fos $$0) {
         super($$0, gaw.this.n, gaw.this.o - 33 - 53, 33, 18);
         String $$1 = gaw.this.w.a();
         gaw.this.w.b().forEach(($$1x, $$2) -> {
            gaw.a.a $$3 = new gaw.a.a($$1x, $$2);
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

      public class a extends fsy.a<gaw.a.a> {
         final String b;
         private final wy c;
         private long d;

         public a(final String $$1, final hjx $$2) {
            this.b = $$1;
            this.c = $$2.a();
         }

         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            $$0.a(gaw.this.p, this.c, a.this.g / 2, $$2 + $$5 / 2 - 9 / 2, -1);
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            if (fwe.a($$0)) {
               this.b();
               gaw.this.H();
               return true;
            } else {
               return super.a($$0, $$1, $$2);
            }
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            if (af.c() - this.d < 250L) {
               gaw.this.H();
            }

            this.d = af.c();
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
