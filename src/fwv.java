import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fwv extends fxu {
   private static final wy b = wy.c("createWorld.customize.flat.title");
   static final alg c = alg.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fvq y = new fvq(this, 33, 64);
   protected final gcv a;
   private final Consumer<eow> z;
   eow A;
   @Nullable
   private fwv.a B;
   @Nullable
   private fsc C;

   public fwv(gcv $$0, Consumer<eow> $$1, eow $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public eow l() {
      return this.A;
   }

   public void a(eow $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aN_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fwv.a());
      fvu $$0 = this.y.b(fvu.d().a(4));
      $$0.c().e();
      fvu $$1 = $$0.a(fvu.e().a(8));
      fvu $$2 = $$0.a(fvu.e().a(8));
      this.C = $$1.a(fsc.a(wy.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<eot> $$1x = this.A.e();
            int $$2x = this.B.aD_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aD_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fsc.a(wy.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fxq(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fsc.a(wx.d, $$0x -> {
         this.z.accept(this.A);
         this.aK_();
         this.A.g();
      }).a());
      $$2.a(fsc.a(wx.e, $$0x -> {
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

   class a extends fsy<fwv.a.a> {
      private static final wy m = wy.c("createWorld.customize.flat.tile").a(n.t);
      private static final wy n = wy.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(fwv.this.m, fwv.this.n, fwv.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fwv.this.A.e().size(); $$0++) {
            this.b(new fwv.a.a());
         }
      }

      public void a(@Nullable fwv.a.a $$0) {
         super.a($$0);
         fwv.this.m();
      }

      public void b() {
         int $$0 = this.aD_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fwv.this.A.e().size(); $$1++) {
            this.b(new fwv.a.a());
         }

         List<fwv.a.a> $$2 = this.aD_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(fro $$0, int $$1, int $$2) {
         $$0.b(fwv.this.p, m, $$1, $$2, -1);
         $$0.b(fwv.this.p, n, $$1 + this.a() - fwv.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fsy.a<fwv.a.a> {
         @Override
         public void a(fro $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eot $$10 = fwv.this.A.e().get(fwv.this.A.e().size() - $$1 - 1);
            dzz $$11 = $$10.b();
            cyy $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fwv.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            wy $$14;
            if ($$1 == 0) {
               $$14 = wy.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fwv.this.A.e().size() - 1) {
               $$14 = wy.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = wy.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fwv.this.p, $$14, $$3 + $$4 - fwv.this.p.a($$14) - 8, $$13, -1);
         }

         private cyy a(dzz $$0) {
            cyu $$1 = $$0.b().h();
            if ($$1 == czc.a) {
               if ($$0.a(dmc.J)) {
                  $$1 = czc.rm;
               } else if ($$0.a(dmc.K)) {
                  $$1 = czc.rn;
               }
            }

            return new cyy($$1);
         }

         @Override
         public wy a() {
            eot $$0 = fwv.this.A.e().get(fwv.this.A.e().size() - a.this.aD_().indexOf(this) - 1);
            cyy $$1 = this.a($$0.b());
            return (wy)(!$$1.f() ? wy.a("narrator.select", $$1.y()) : wx.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fro $$0, int $$1, int $$2, cyy $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fro $$0, int $$1, int $$2) {
            $$0.a(gqc::H, fwv.c, $$1, $$2, 18, 18);
         }
      }
   }
}
