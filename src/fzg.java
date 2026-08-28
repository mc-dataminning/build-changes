import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fzg extends gaf {
   private static final xc b = xc.c("createWorld.customize.flat.title");
   static final alk c = alk.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fyb y = new fyb(this, 33, 64);
   protected final gfg a;
   private final Consumer<eqg> z;
   eqg A;
   @Nullable
   private fzg.a B;
   @Nullable
   private fun C;

   public fzg(gfg $$0, Consumer<eqg> $$1, eqg $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public eqg l() {
      return this.A;
   }

   public void a(eqg $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aS_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fzg.a());
      fyf $$0 = this.y.b(fyf.d().a(4));
      $$0.c().e();
      fyf $$1 = $$0.a(fyf.e().a(8));
      fyf $$2 = $$0.a(fyf.e().a(8));
      this.C = $$1.a(fun.a(xc.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<eqd> $$1x = this.A.e();
            int $$2x = this.B.aI_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aI_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fun.a(xc.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new gab(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fun.a(xb.d, $$0x -> {
         this.z.accept(this.A);
         this.aP_();
         this.A.g();
      }).a());
      $$2.a(fun.a(xb.e, $$0x -> {
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

   class a extends fvj<fzg.a.a> {
      private static final xc m = xc.c("createWorld.customize.flat.tile").a(o.t);
      private static final xc n = xc.c("createWorld.customize.flat.height").a(o.t);

      public a() {
         super(fzg.this.m, fzg.this.n, fzg.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fzg.this.A.e().size(); $$0++) {
            this.b(new fzg.a.a());
         }
      }

      public void a(@Nullable fzg.a.a $$0) {
         super.a($$0);
         fzg.this.m();
      }

      public void b() {
         int $$0 = this.aI_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fzg.this.A.e().size(); $$1++) {
            this.b(new fzg.a.a());
         }

         List<fzg.a.a> $$2 = this.aI_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(ftz $$0, int $$1, int $$2) {
         $$0.b(fzg.this.p, m, $$1, $$2, -1);
         $$0.b(fzg.this.p, n, $$1 + this.a() - fzg.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fvj.a<fzg.a.a> {
         @Override
         public void a(ftz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eqd $$10 = fzg.this.A.e().get(fzg.this.A.e().size() - $$1 - 1);
            ebg $$11 = $$10.b();
            daa $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fzg.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            xc $$14;
            if ($$1 == 0) {
               $$14 = xc.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fzg.this.A.e().size() - 1) {
               $$14 = xc.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = xc.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fzg.this.p, $$14, $$3 + $$4 - fzg.this.p.a($$14) - 8, $$13, -1);
         }

         private daa a(ebg $$0) {
            czw $$1 = $$0.b().h();
            if ($$1 == dae.a) {
               if ($$0.a(dng.J)) {
                  $$1 = dae.rp;
               } else if ($$0.a(dng.K)) {
                  $$1 = dae.rq;
               }
            }

            return new daa($$1);
         }

         @Override
         public xc a() {
            eqd $$0 = fzg.this.A.e().get(fzg.this.A.e().size() - a.this.aI_().indexOf(this) - 1);
            daa $$1 = this.a($$0.b());
            return (xc)(!$$1.f() ? xc.a("narrator.select", $$1.y()) : xb.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(ftz $$0, int $$1, int $$2, daa $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(ftz $$0, int $$1, int $$2) {
            $$0.a(gsn::H, fzg.c, $$1, $$2, 18, 18);
         }
      }
   }
}
