import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fus extends fun<cth> {
   private static final alz G = alz.b("textures/gui/container/beacon.png");
   static final alz H = alz.b("container/beacon/button_disabled");
   static final alz I = alz.b("container/beacon/button_selected");
   static final alz J = alz.b("container/beacon/button_highlighted");
   static final alz K = alz.b("container/beacon/button");
   static final alz L = alz.b("container/beacon/confirm");
   static final alz M = alz.b("container/beacon/cancel");
   private static final xv N = xv.c("block.minecraft.beacon.primary");
   private static final xv O = xv.c("block.minecraft.beacon.secondary");
   private final List<fus.a> P = Lists.newArrayList();
   @Nullable
   jq<bun> Q;
   @Nullable
   jq<bun> R;

   public fus(final cth $$0, cpw $$1, xv $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new ctq() {
         @Override
         public void a(ctc $$0x, int $$1, cxp $$2) {
         }

         @Override
         public void a(ctc $$0x, int $$1, int $$2) {
            fus.this.Q = $$0.m();
            fus.this.R = $$0.n();
         }
      });
   }

   private <T extends fod & fus.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.P.clear();
      this.a(new fus.c(this.C + 164, this.D + 107));
      this.a(new fus.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dus.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jq<bun> $$4 = dus.a.get($$0).get($$3);
            fus.d $$5 = new fus.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dus.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jq<bun> $$10 = dus.a.get(3).get($$9);
         fus.d $$11 = new fus.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jq<bun> $$12 = dus.a.get(0).get(0);
      fus.d $$13 = new fus.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fns $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fns $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(glv::C, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cxp(cxt.pg), $$4 + 20, $$5 + 109);
      $$0.a(new cxp(cxt.oW), $$4 + 41, $$5 + 109);
      $$0.a(new cxp(cxt.oV), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cxp(cxt.pf), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cxp(cxt.pb), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fus.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fus.M, xu.e);
      }

      @Override
      public void b() {
         fus.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fus.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fus.L, xu.d);
      }

      @Override
      public void b() {
         fus.this.m.L().b(new aja(Optional.ofNullable(fus.this.Q), Optional.ofNullable(fus.this.R)));
         fus.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fus.this.z.o() && fus.this.Q != null;
      }
   }

   class d extends fus.e {
      private final boolean c;
      protected final int a;
      private jq<bun> d;
      private hbl f;

      public d(final int $$0, final int $$1, final jq<bun> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jq<bun> $$0) {
         this.d = $$0;
         this.f = fmg.Q().aG().a($$0);
         this.a(fpr.a(this.b($$0), null));
      }

      protected yj b(jq<bun> $$0) {
         return xv.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fus.this.Q = this.d;
            } else {
               fus.this.R = this.d;
            }

            fus.this.G();
         }
      }

      @Override
      protected void a(fns $$0) {
         $$0.a(glv::C, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fus.this.Q : fus.this.R));
      }

      @Override
      protected yj aR_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fnw implements fus.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xu.a);
      }

      protected e(int $$0, int $$1, xv $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fns $$0, int $$1, int $$2, float $$3) {
         alz $$4;
         if (!this.j) {
            $$4 = fus.H;
         } else if (this.a) {
            $$4 = fus.I;
         } else if (this.B()) {
            $$4 = fus.J;
         } else {
            $$4 = fus.K;
         }

         $$0.a(glv::C, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fns var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fsd $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fus.e {
      private final alz a;

      protected f(int $$0, int $$1, alz $$2, xv $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fns $$0) {
         $$0.a(glv::C, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends fus.d {
      public g(final int $$0, final int $$1, final jq<bun> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected yj b(jq<bun> $$0) {
         return xv.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fus.this.Q != null) {
            this.k = true;
            this.a(fus.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
