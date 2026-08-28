import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fxc extends fyb {
   private static final wy b = wy.c("createWorld.customize.flat.title");
   static final alg c = alg.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fvx y = new fvx(this, 33, 64);
   protected final gdc a;
   private final Consumer<epe> z;
   epe A;
   @Nullable
   private fxc.a B;
   @Nullable
   private fsj C;

   public fxc(gdc $$0, Consumer<epe> $$1, epe $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public epe l() {
      return this.A;
   }

   public void a(epe $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aO_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fxc.a());
      fwb $$0 = this.y.b(fwb.d().a(4));
      $$0.c().e();
      fwb $$1 = $$0.a(fwb.e().a(8));
      fwb $$2 = $$0.a(fwb.e().a(8));
      this.C = $$1.a(fsj.a(wy.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<epb> $$1x = this.A.e();
            int $$2x = this.B.aE_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aE_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fsj.a(wy.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fxx(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fsj.a(wx.d, $$0x -> {
         this.z.accept(this.A);
         this.aL_();
         this.A.g();
      }).a());
      $$2.a(fsj.a(wx.e, $$0x -> {
         this.aL_();
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
   public void aL_() {
      this.m.a(this.a);
   }

   class a extends ftf<fxc.a.a> {
      private static final wy m = wy.c("createWorld.customize.flat.tile").a(n.t);
      private static final wy n = wy.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(fxc.this.m, fxc.this.n, fxc.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fxc.this.A.e().size(); $$0++) {
            this.b(new fxc.a.a());
         }
      }

      public void a(@Nullable fxc.a.a $$0) {
         super.a($$0);
         fxc.this.m();
      }

      public void b() {
         int $$0 = this.aE_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fxc.this.A.e().size(); $$1++) {
            this.b(new fxc.a.a());
         }

         List<fxc.a.a> $$2 = this.aE_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(frv $$0, int $$1, int $$2) {
         $$0.b(fxc.this.p, m, $$1, $$2, -1);
         $$0.b(fxc.this.p, n, $$1 + this.a() - fxc.this.p.a(n) - 8, $$2, -1);
      }

      class a extends ftf.a<fxc.a.a> {
         @Override
         public void a(frv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            epb $$10 = fxc.this.A.e().get(fxc.this.A.e().size() - $$1 - 1);
            eah $$11 = $$10.b();
            czd $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fxc.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            wy $$14;
            if ($$1 == 0) {
               $$14 = wy.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fxc.this.A.e().size() - 1) {
               $$14 = wy.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = wy.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fxc.this.p, $$14, $$3 + $$4 - fxc.this.p.a($$14) - 8, $$13, -1);
         }

         private czd a(eah $$0) {
            cyz $$1 = $$0.b().h();
            if ($$1 == czh.a) {
               if ($$0.a(dmh.J)) {
                  $$1 = czh.rp;
               } else if ($$0.a(dmh.K)) {
                  $$1 = czh.rq;
               }
            }

            return new czd($$1);
         }

         @Override
         public wy a() {
            epb $$0 = fxc.this.A.e().get(fxc.this.A.e().size() - a.this.aE_().indexOf(this) - 1);
            czd $$1 = this.a($$0.b());
            return (wy)(!$$1.f() ? wy.a("narrator.select", $$1.y()) : wx.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(frv $$0, int $$1, int $$2, czd $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(frv $$0, int $$1, int $$2) {
            $$0.a(gqk::H, fxc.c, $$1, $$2, 18, 18);
         }
      }
   }
}
