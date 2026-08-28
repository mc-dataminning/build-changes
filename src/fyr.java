import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fyr extends fzq {
   private static final xg b = xg.c("createWorld.customize.flat.title");
   static final alr c = alr.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fxm y = new fxm(this, 33, 64);
   protected final ger a;
   private final Consumer<eqq> z;
   eqq A;
   @Nullable
   private fyr.a B;
   @Nullable
   private fty C;

   public fyr(ger $$0, Consumer<eqq> $$1, eqq $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public eqq l() {
      return this.A;
   }

   public void a(eqq $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aT_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fyr.a());
      fxq $$0 = this.y.b(fxq.d().a(4));
      $$0.c().e();
      fxq $$1 = $$0.a(fxq.e().a(8));
      fxq $$2 = $$0.a(fxq.e().a(8));
      this.C = $$1.a(fty.a(xg.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<eqn> $$1x = this.A.e();
            int $$2x = this.B.aJ_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aJ_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fty.a(xg.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fzm(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fty.a(xf.d, $$0x -> {
         this.z.accept(this.A);
         this.aQ_();
         this.A.g();
      }).a());
      $$2.a(fty.a(xf.e, $$0x -> {
         this.aQ_();
         this.A.g();
      }).a());
      this.A.g();
      this.m();
      this.y.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      if (this.B != null) {
         this.B.a(this.n, this.y);
      }

      this.y.a();
   }

   void m() {
      if (this.C != null) {
         this.C.j = this.E();
      }
   }

   private boolean E() {
      return this.B != null && this.B.p() != null;
   }

   @Override
   public void aQ_() {
      this.m.a(this.a);
   }

   class a extends fuu<fyr.a.a> {
      private static final xg m = xg.c("createWorld.customize.flat.tile").a(o.t);
      private static final xg n = xg.c("createWorld.customize.flat.height").a(o.t);

      public a() {
         super(fyr.this.m, fyr.this.n, fyr.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fyr.this.A.e().size(); $$0++) {
            this.b(new fyr.a.a());
         }
      }

      public void a(@Nullable fyr.a.a $$0) {
         super.a($$0);
         fyr.this.m();
      }

      public void b() {
         int $$0 = this.aJ_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fyr.this.A.e().size(); $$1++) {
            this.b(new fyr.a.a());
         }

         List<fyr.a.a> $$2 = this.aJ_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(ftk $$0, int $$1, int $$2) {
         $$0.b(fyr.this.p, m, $$1, $$2, -1);
         $$0.b(fyr.this.p, n, $$1 + this.a() - fyr.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fuu.a<fyr.a.a> {
         @Override
         public void a(ftk $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eqn $$10 = fyr.this.A.e().get(fyr.this.A.e().size() - $$1 - 1);
            ebq $$11 = $$10.b();
            dak $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fyr.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            xg $$14;
            if ($$1 == 0) {
               $$14 = xg.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fyr.this.A.e().size() - 1) {
               $$14 = xg.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = xg.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fyr.this.p, $$14, $$3 + $$4 - fyr.this.p.a($$14) - 8, $$13, -1);
         }

         private dak a(ebq $$0) {
            dag $$1 = $$0.b().h();
            if ($$1 == dao.a) {
               if ($$0.a(dnq.J)) {
                  $$1 = dao.rp;
               } else if ($$0.a(dnq.K)) {
                  $$1 = dao.rq;
               }
            }

            return new dak($$1);
         }

         @Override
         public xg a() {
            eqn $$0 = fyr.this.A.e().get(fyr.this.A.e().size() - a.this.aJ_().indexOf(this) - 1);
            dak $$1 = this.a($$0.b());
            return (xg)(!$$1.f() ? xg.a("narrator.select", $$1.y()) : xf.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(ftk $$0, int $$1, int $$2, dak $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ftk $$0, int $$1, int $$2) {
            $$0.a(gry::H, fyr.c, $$1, $$2, 18, 18);
         }
      }
   }
}
