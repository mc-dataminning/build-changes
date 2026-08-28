import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fzm extends fzh<cvk> {
   private static final alg G = alg.b("textures/gui/container/beacon.png");
   static final alg H = alg.b("container/beacon/button_disabled");
   static final alg I = alg.b("container/beacon/button_selected");
   static final alg J = alg.b("container/beacon/button_highlighted");
   static final alg K = alg.b("container/beacon/button");
   static final alg L = alg.b("container/beacon/confirm");
   static final alg M = alg.b("container/beacon/cancel");
   private static final wy N = wy.c("block.minecraft.beacon.primary");
   private static final wy O = wy.c("block.minecraft.beacon.secondary");
   private final List<fzm.a> P = Lists.newArrayList();
   @Nullable
   jf<bvk> Q;
   @Nullable
   jf<bvk> R;

   public fzm(final cvk $$0, crl $$1, wy $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cvt() {
         @Override
         public void a(cvf $$0x, int $$1, czn $$2) {
         }

         @Override
         public void a(cvf $$0x, int $$1, int $$2) {
            fzm.this.Q = $$0.m();
            fzm.this.R = $$0.n();
         }
      });
   }

   private <T extends fsy & fzm.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.P.clear();
      this.a(new fzm.c(this.C + 164, this.D + 107));
      this.a(new fzm.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dxm.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jf<bvk> $$4 = dxm.a.get($$0).get($$3);
            fzm.d $$5 = new fzm.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dxm.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jf<bvk> $$10 = dxm.a.get(3).get($$9);
         fzm.d $$11 = new fzm.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jf<bvk> $$12 = dxm.a.get(0).get(0);
      fzm.d $$13 = new fzm.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fsm $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fsm $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(grc::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new czn(czr.py), $$4 + 20, $$5 + 109);
      $$0.a(new czn(czr.po), $$4 + 41, $$5 + 109);
      $$0.a(new czn(czr.pn), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new czn(czr.px), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new czn(czr.pt), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fzm.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fzm.M, wx.e);
      }

      @Override
      public void b() {
         fzm.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fzm.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fzm.L, wx.d);
      }

      @Override
      public void b() {
         fzm.this.m.L().b(new aif(Optional.ofNullable(fzm.this.Q), Optional.ofNullable(fzm.this.R)));
         fzm.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fzm.this.z.o() && fzm.this.Q != null;
      }
   }

   class d extends fzm.e {
      private final boolean c;
      protected final int a;
      private jf<bvk> d;
      private hjq f;

      public d(final int $$0, final int $$1, final jf<bvk> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jf<bvk> $$0) {
         this.d = $$0;
         this.f = fpt.Q().aG().a($$0);
         this.a(ful.a(this.b($$0), null));
      }

      protected xm b(jf<bvk> $$0) {
         return wy.c($$0.a().f());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fzm.this.Q = this.d;
            } else {
               fzm.this.R = this.d;
            }

            fzm.this.G();
         }
      }

      @Override
      protected void a(fsm $$0) {
         $$0.a(grc::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fzm.this.Q : fzm.this.R));
      }

      @Override
      protected xm d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fsq implements fzm.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wx.a);
      }

      protected e(int $$0, int $$1, wy $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fsm $$0, int $$1, int $$2, float $$3) {
         alg $$4;
         if (!this.j) {
            $$4 = fzm.H;
         } else if (this.a) {
            $$4 = fzm.I;
         } else if (this.D()) {
            $$4 = fzm.J;
         } else {
            $$4 = fzm.K;
         }

         $$0.a(grc::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fsm var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fwx $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fzm.e {
      private final alg a;

      protected f(int $$0, int $$1, alg $$2, wy $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fsm $$0) {
         $$0.a(grc::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends fzm.d {
      public g(final int $$0, final int $$1, final jf<bvk> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xm b(jf<bvk> $$0) {
         return wy.c($$0.a().f()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fzm.this.Q != null) {
            this.k = true;
            this.a(fzm.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
