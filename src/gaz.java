import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gaz extends gau<cvx> {
   private static final alk G = alk.b("textures/gui/container/beacon.png");
   static final alk H = alk.b("container/beacon/button_disabled");
   static final alk I = alk.b("container/beacon/button_selected");
   static final alk J = alk.b("container/beacon/button_highlighted");
   static final alk K = alk.b("container/beacon/button");
   static final alk L = alk.b("container/beacon/confirm");
   static final alk M = alk.b("container/beacon/cancel");
   private static final xc N = xc.c("block.minecraft.beacon.primary");
   private static final xc O = xc.c("block.minecraft.beacon.secondary");
   private final List<gaz.a> P = Lists.newArrayList();
   @Nullable
   jg<bvx> Q;
   @Nullable
   jg<bvx> R;

   public gaz(final cvx $$0, cry $$1, xc $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cwg() {
         @Override
         public void a(cvs $$0x, int $$1, daa $$2) {
         }

         @Override
         public void a(cvs $$0x, int $$1, int $$2) {
            gaz.this.Q = $$0.m();
            gaz.this.R = $$0.n();
         }
      });
   }

   private <T extends ful & gaz.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.P.clear();
      this.a(new gaz.c(this.C + 164, this.D + 107));
      this.a(new gaz.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dxz.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jg<bvx> $$4 = dxz.a.get($$0).get($$3);
            gaz.d $$5 = new gaz.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dxz.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jg<bvx> $$10 = dxz.a.get(3).get($$9);
         gaz.d $$11 = new gaz.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jg<bvx> $$12 = dxz.a.get(0).get(0);
      gaz.d $$13 = new gaz.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(ftz $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(ftz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gsn::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new daa(dae.py), $$4 + 20, $$5 + 109);
      $$0.a(new daa(dae.po), $$4 + 41, $$5 + 109);
      $$0.a(new daa(dae.pn), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new daa(dae.px), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new daa(dae.pt), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends gaz.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, gaz.M, xb.e);
      }

      @Override
      public void b() {
         gaz.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends gaz.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, gaz.L, xb.d);
      }

      @Override
      public void b() {
         gaz.this.m.L().b(new aij(Optional.ofNullable(gaz.this.Q), Optional.ofNullable(gaz.this.R)));
         gaz.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = gaz.this.z.o() && gaz.this.Q != null;
      }
   }

   class d extends gaz.e {
      private final boolean c;
      protected final int a;
      private jg<bvx> d;
      private hlc f;

      public d(final int $$0, final int $$1, final jg<bvx> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jg<bvx> $$0) {
         this.d = $$0;
         this.f = frf.Q().aG().a($$0);
         this.a(fvy.a(this.b($$0), null));
      }

      protected xq b(jg<bvx> $$0) {
         return xc.c($$0.a().f());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               gaz.this.Q = this.d;
            } else {
               gaz.this.R = this.d;
            }

            gaz.this.G();
         }
      }

      @Override
      protected void a(ftz $$0) {
         $$0.a(gsn::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? gaz.this.Q : gaz.this.R));
      }

      @Override
      protected xq d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fud implements gaz.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xb.a);
      }

      protected e(int $$0, int $$1, xc $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(ftz $$0, int $$1, int $$2, float $$3) {
         alk $$4;
         if (!this.j) {
            $$4 = gaz.H;
         } else if (this.a) {
            $$4 = gaz.I;
         } else if (this.D()) {
            $$4 = gaz.J;
         } else {
            $$4 = gaz.K;
         }

         $$0.a(gsn::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(ftz var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fyk $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends gaz.e {
      private final alk a;

      protected f(int $$0, int $$1, alk $$2, xc $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(ftz $$0) {
         $$0.a(gsn::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends gaz.d {
      public g(final int $$0, final int $$1, final jg<bvx> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xq b(jg<bvx> $$0) {
         return xc.c($$0.a().f()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (gaz.this.Q != null) {
            this.k = true;
            this.a(gaz.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
