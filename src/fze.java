import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fze extends gad {
   private static final xa b = xa.c("createWorld.customize.flat.title");
   static final ali c = ali.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fxz y = new fxz(this, 33, 64);
   protected final gfe a;
   private final Consumer<eqe> z;
   eqe A;
   @Nullable
   private fze.a B;
   @Nullable
   private ful C;

   public fze(gfe $$0, Consumer<eqe> $$1, eqe $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public eqe l() {
      return this.A;
   }

   public void a(eqe $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aS_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fze.a());
      fyd $$0 = this.y.b(fyd.d().a(4));
      $$0.c().e();
      fyd $$1 = $$0.a(fyd.e().a(8));
      fyd $$2 = $$0.a(fyd.e().a(8));
      this.C = $$1.a(ful.a(xa.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<eqb> $$1x = this.A.e();
            int $$2x = this.B.aI_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aI_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(ful.a(xa.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fzz(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(ful.a(wz.d, $$0x -> {
         this.z.accept(this.A);
         this.aP_();
         this.A.g();
      }).a());
      $$2.a(ful.a(wz.e, $$0x -> {
         this.aP_();
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
   public void aP_() {
      this.m.a(this.a);
   }

   class a extends fvh<fze.a.a> {
      private static final xa m = xa.c("createWorld.customize.flat.tile").a(o.t);
      private static final xa n = xa.c("createWorld.customize.flat.height").a(o.t);

      public a() {
         super(fze.this.m, fze.this.n, fze.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fze.this.A.e().size(); $$0++) {
            this.b(new fze.a.a());
         }
      }

      public void a(@Nullable fze.a.a $$0) {
         super.a($$0);
         fze.this.m();
      }

      public void b() {
         int $$0 = this.aI_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fze.this.A.e().size(); $$1++) {
            this.b(new fze.a.a());
         }

         List<fze.a.a> $$2 = this.aI_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(ftx $$0, int $$1, int $$2) {
         $$0.b(fze.this.p, m, $$1, $$2, -1);
         $$0.b(fze.this.p, n, $$1 + this.a() - fze.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fvh.a<fze.a.a> {
         @Override
         public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eqb $$10 = fze.this.A.e().get(fze.this.A.e().size() - $$1 - 1);
            ebe $$11 = $$10.b();
            czy $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fze.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            xa $$14;
            if ($$1 == 0) {
               $$14 = xa.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fze.this.A.e().size() - 1) {
               $$14 = xa.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = xa.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fze.this.p, $$14, $$3 + $$4 - fze.this.p.a($$14) - 8, $$13, -1);
         }

         private czy a(ebe $$0) {
            czu $$1 = $$0.b().h();
            if ($$1 == dac.a) {
               if ($$0.a(dne.J)) {
                  $$1 = dac.rp;
               } else if ($$0.a(dne.K)) {
                  $$1 = dac.rq;
               }
            }

            return new czy($$1);
         }

         @Override
         public xa a() {
            eqb $$0 = fze.this.A.e().get(fze.this.A.e().size() - a.this.aI_().indexOf(this) - 1);
            czy $$1 = this.a($$0.b());
            return (xa)(!$$1.f() ? xa.a("narrator.select", $$1.y()) : wz.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(ftx $$0, int $$1, int $$2, czy $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ftx $$0, int $$1, int $$2) {
            $$0.a(gsl::H, fze.c, $$1, $$2, 18, 18);
         }
      }
   }
}
