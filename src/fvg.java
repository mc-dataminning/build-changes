import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fvg extends fwf {
   private static final wv b = wv.c("createWorld.customize.flat.title");
   static final ald c = ald.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fub y = new fub(this, 33, 64);
   protected final gbg a;
   private final Consumer<enj> z;
   enj A;
   @Nullable
   private fvg.a B;
   @Nullable
   private fqn C;

   public fvg(gbg $$0, Consumer<enj> $$1, enj $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public enj l() {
      return this.A;
   }

   public void a(enj $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aN_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fvg.a());
      fuf $$0 = this.y.b(fuf.d().a(4));
      $$0.c().e();
      fuf $$1 = $$0.a(fuf.e().a(8));
      fuf $$2 = $$0.a(fuf.e().a(8));
      this.C = $$1.a(fqn.a(wv.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<eng> $$1x = this.A.e();
            int $$2x = this.B.aD_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aD_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fqn.a(wv.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fwb(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fqn.a(wu.d, $$0x -> {
         this.z.accept(this.A);
         this.aK_();
         this.A.g();
      }).a());
      $$2.a(fqn.a(wu.e, $$0x -> {
         this.aK_();
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
   public void aK_() {
      this.m.a(this.a);
   }

   class a extends frj<fvg.a.a> {
      private static final wv m = wv.c("createWorld.customize.flat.tile").a(n.t);
      private static final wv n = wv.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(fvg.this.m, fvg.this.n, fvg.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fvg.this.A.e().size(); $$0++) {
            this.b(new fvg.a.a());
         }
      }

      public void a(@Nullable fvg.a.a $$0) {
         super.a($$0);
         fvg.this.m();
      }

      public void b() {
         int $$0 = this.aD_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fvg.this.A.e().size(); $$1++) {
            this.b(new fvg.a.a());
         }

         List<fvg.a.a> $$2 = this.aD_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(fpz $$0, int $$1, int $$2) {
         $$0.b(fvg.this.p, m, $$1, $$2, -1);
         $$0.b(fvg.this.p, n, $$1 + this.a() - fvg.this.p.a(n) - 8, $$2, -1);
      }

      class a extends frj.a<fvg.a.a> {
         @Override
         public void a(fpz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eng $$10 = fvg.this.A.e().get(fvg.this.A.e().size() - $$1 - 1);
            dym $$11 = $$10.b();
            cxy $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fvg.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            wv $$14;
            if ($$1 == 0) {
               $$14 = wv.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fvg.this.A.e().size() - 1) {
               $$14 = wv.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = wv.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fvg.this.p, $$14, $$3 + $$4 - fvg.this.p.a($$14) - 8, $$13, -1);
         }

         private cxy a(dym $$0) {
            cxu $$1 = $$0.b().i();
            if ($$1 == cyc.a) {
               if ($$0.a(dkw.J)) {
                  $$1 = cyc.rk;
               } else if ($$0.a(dkw.K)) {
                  $$1 = cyc.rl;
               }
            }

            return new cxy($$1);
         }

         @Override
         public wv a() {
            eng $$0 = fvg.this.A.e().get(fvg.this.A.e().size() - a.this.aD_().indexOf(this) - 1);
            cxy $$1 = this.a($$0.b());
            return (wv)(!$$1.f() ? wv.a("narrator.select", $$1.y()) : wu.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fpz $$0, int $$1, int $$2, cxy $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fpz $$0, int $$1, int $$2) {
            $$0.a(goi::H, fvg.c, $$1, $$2, 18, 18);
         }
      }
   }
}
