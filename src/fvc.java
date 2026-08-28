import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fvc extends fux<csf> {
   private static final aku G = aku.b("textures/gui/container/beacon.png");
   static final aku H = aku.b("container/beacon/button_disabled");
   static final aku I = aku.b("container/beacon/button_selected");
   static final aku J = aku.b("container/beacon/button_highlighted");
   static final aku K = aku.b("container/beacon/button");
   static final aku L = aku.b("container/beacon/confirm");
   static final aku M = aku.b("container/beacon/cancel");
   private static final wo N = wo.c("block.minecraft.beacon.primary");
   private static final wo O = wo.c("block.minecraft.beacon.secondary");
   private final List<fvc.a> P = Lists.newArrayList();
   @Nullable
   jr<btm> Q;
   @Nullable
   jr<btm> R;

   public fvc(final csf $$0, cou $$1, wo $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cso() {
         @Override
         public void a(csa $$0x, int $$1, cwn $$2) {
         }

         @Override
         public void a(csa $$0x, int $$1, int $$2) {
            fvc.this.Q = $$0.m();
            fvc.this.R = $$0.n();
         }
      });
   }

   private <T extends fon & fvc.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.P.clear();
      this.a(new fvc.c(this.C + 164, this.D + 107));
      this.a(new fvc.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dts.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jr<btm> $$4 = dts.a.get($$0).get($$3);
            fvc.d $$5 = new fvc.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dts.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jr<btm> $$10 = dts.a.get(3).get($$9);
         fvc.d $$11 = new fvc.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jr<btm> $$12 = dts.a.get(0).get(0);
      fvc.d $$13 = new fvc.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void E() {
      super.E();
      this.G();
   }

   @Override
   void G() {
      int $$0 = this.z.l();
      this.P.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fob $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fob $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmf::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cwn(cwr.pp), $$4 + 20, $$5 + 109);
      $$0.a(new cwn(cwr.pf), $$4 + 41, $$5 + 109);
      $$0.a(new cwn(cwr.pe), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cwn(cwr.po), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cwn(cwr.pk), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fvc.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fvc.M, wn.e);
      }

      @Override
      public void b() {
         fvc.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fvc.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fvc.L, wn.d);
      }

      @Override
      public void b() {
         fvc.this.m.L().b(new ahv(Optional.ofNullable(fvc.this.Q), Optional.ofNullable(fvc.this.R)));
         fvc.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fvc.this.z.o() && fvc.this.Q != null;
      }
   }

   class d extends fvc.e {
      private final boolean c;
      protected final int a;
      private jr<btm> d;
      private hem f;

      public d(final int $$0, final int $$1, final jr<btm> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jr<btm> $$0) {
         this.d = $$0;
         this.f = flh.Q().aG().a($$0);
         this.a(fqb.a(this.b($$0), null));
      }

      protected xc b(jr<btm> $$0) {
         return wo.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fvc.this.Q = this.d;
            } else {
               fvc.this.R = this.d;
            }

            fvc.this.G();
         }
      }

      @Override
      protected void a(fob $$0) {
         $$0.a(gmf::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fvc.this.Q : fvc.this.R));
      }

      @Override
      protected xc d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fof implements fvc.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wn.a);
      }

      protected e(int $$0, int $$1, wo $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         aku $$4;
         if (!this.j) {
            $$4 = fvc.H;
         } else if (this.a) {
            $$4 = fvc.I;
         } else if (this.D()) {
            $$4 = fvc.J;
         } else {
            $$4 = fvc.K;
         }

         $$0.a(gmf::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fob var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fsn $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fvc.e {
      private final aku a;

      protected f(int $$0, int $$1, aku $$2, wo $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fob $$0) {
         $$0.a(gmf::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends fvc.d {
      public g(final int $$0, final int $$1, final jr<btm> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xc b(jr<btm> $$0) {
         return wo.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fvc.this.Q != null) {
            this.k = true;
            this.a(fvc.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
