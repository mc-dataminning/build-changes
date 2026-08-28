import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fuj extends fvi {
   private static final wp b = wp.c("createWorld.customize.flat.title");
   static final aku c = aku.b("container/slot");
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private final fte y = new fte(this, 33, 64);
   protected final gah a;
   private final Consumer<emm> z;
   emm A;
   @Nullable
   private fuj.a B;
   @Nullable
   private fpq C;

   public fuj(gah $$0, Consumer<emm> $$1, emm $$2) {
      super(b);
      this.a = $$0;
      this.z = $$1;
      this.A = $$2;
   }

   public emm l() {
      return this.A;
   }

   public void a(emm $$0) {
      this.A = $$0;
      if (this.B != null) {
         this.B.b();
         this.m();
      }
   }

   @Override
   protected void aR_() {
      this.y.a(this.l, this.p);
      this.B = this.y.c(new fuj.a());
      fti $$0 = this.y.b(fti.d().a(4));
      $$0.c().e();
      fti $$1 = $$0.a(fti.e().a(8));
      fti $$2 = $$0.a(fti.e().a(8));
      this.C = $$1.a(fpq.a(wp.c("createWorld.customize.flat.removeLayer"), $$0x -> {
         if (this.E()) {
            List<emj> $$1x = this.A.e();
            int $$2x = this.B.aH_().indexOf(this.B.p());
            int $$3 = $$1x.size() - $$2x - 1;
            $$1x.remove($$3);
            this.B.a($$1x.isEmpty() ? null : this.B.aH_().get(Math.min($$2x, $$1x.size() - 1)));
            this.A.g();
            this.B.b();
            this.m();
         }
      }).a());
      $$1.a(fpq.a(wp.c("createWorld.customize.presets"), $$0x -> {
         this.m.a(new fve(this));
         this.A.g();
         this.m();
      }).a());
      $$2.a(fpq.a(wo.d, $$0x -> {
         this.z.accept(this.A);
         this.aO_();
         this.A.g();
      }).a());
      $$2.a(fpq.a(wo.e, $$0x -> {
         this.aO_();
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
   public void aO_() {
      this.m.a(this.a);
   }

   class a extends fqm<fuj.a.a> {
      private static final wp m = wp.c("createWorld.customize.flat.tile").a(n.t);
      private static final wp n = wp.c("createWorld.customize.flat.height").a(n.t);

      public a() {
         super(fuj.this.m, fuj.this.n, fuj.this.o - 103, 43, 24, (int)(9.0 * 1.5));

         for (int $$0 = 0; $$0 < fuj.this.A.e().size(); $$0++) {
            this.b(new fuj.a.a());
         }
      }

      public void a(@Nullable fuj.a.a $$0) {
         super.a($$0);
         fuj.this.m();
      }

      public void b() {
         int $$0 = this.aH_().indexOf(this.p());
         this.s();

         for (int $$1 = 0; $$1 < fuj.this.A.e().size(); $$1++) {
            this.b(new fuj.a.a());
         }

         List<fuj.a.a> $$2 = this.aH_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      @Override
      protected void a(fpc $$0, int $$1, int $$2) {
         $$0.b(fuj.this.p, m, $$1, $$2, -1);
         $$0.b(fuj.this.p, n, $$1 + this.a() - fuj.this.p.a(n) - 8, $$2, -1);
      }

      class a extends fqm.a<fuj.a.a> {
         @Override
         public void a(fpc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            emj $$10 = fuj.this.A.e().get(fuj.this.A.e().size() - $$1 - 1);
            dxq $$11 = $$10.b();
            cxh $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            int $$13 = $$2 + $$5 / 2 - 9 / 2;
            $$0.b(fuj.this.p, $$12.y(), $$3 + 18 + 5, $$13, -1);
            wp $$14;
            if ($$1 == 0) {
               $$14 = wp.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fuj.this.A.e().size() - 1) {
               $$14 = wp.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$14 = wp.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.b(fuj.this.p, $$14, $$3 + $$4 - fuj.this.p.a($$14) - 8, $$13, -1);
         }

         private cxh a(dxq $$0) {
            cxd $$1 = $$0.b().i();
            if ($$1 == cxl.a) {
               if ($$0.a(dkg.J)) {
                  $$1 = cxl.ri;
               } else if ($$0.a(dkg.K)) {
                  $$1 = cxl.rj;
               }
            }

            return new cxh($$1);
         }

         @Override
         public wp a() {
            emj $$0 = fuj.this.A.e().get(fuj.this.A.e().size() - a.this.aH_().indexOf(this) - 1);
            cxh $$1 = this.a($$0.b());
            return (wp)(!$$1.f() ? wp.a("narrator.select", $$1.y()) : wo.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fpc $$0, int $$1, int $$2, cxh $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fpc $$0, int $$1, int $$2) {
            $$0.a(gnh::H, fuj.c, $$1, $$2, 18, 18);
         }
      }
   }
}
