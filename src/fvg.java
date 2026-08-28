import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fvg extends fvb<csi> {
   private static final akv G = akv.b("textures/gui/container/beacon.png");
   static final akv H = akv.b("container/beacon/button_disabled");
   static final akv I = akv.b("container/beacon/button_selected");
   static final akv J = akv.b("container/beacon/button_highlighted");
   static final akv K = akv.b("container/beacon/button");
   static final akv L = akv.b("container/beacon/confirm");
   static final akv M = akv.b("container/beacon/cancel");
   private static final wp N = wp.c("block.minecraft.beacon.primary");
   private static final wp O = wp.c("block.minecraft.beacon.secondary");
   private final List<fvg.a> P = Lists.newArrayList();
   @Nullable
   jr<btp> Q;
   @Nullable
   jr<btp> R;

   public fvg(final csi $$0, cox $$1, wp $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new csr() {
         @Override
         public void a(csd $$0x, int $$1, cwq $$2) {
         }

         @Override
         public void a(csd $$0x, int $$1, int $$2) {
            fvg.this.Q = $$0.m();
            fvg.this.R = $$0.n();
         }
      });
   }

   private <T extends fos & fvg.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.P.clear();
      this.a(new fvg.c(this.C + 164, this.D + 107));
      this.a(new fvg.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dtv.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jr<btp> $$4 = dtv.a.get($$0).get($$3);
            fvg.d $$5 = new fvg.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dtv.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jr<btp> $$10 = dtv.a.get(3).get($$9);
         fvg.d $$11 = new fvg.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jr<btp> $$12 = dtv.a.get(0).get(0);
      fvg.d $$13 = new fvg.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fof $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fof $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmj::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cwq(cwu.pp), $$4 + 20, $$5 + 109);
      $$0.a(new cwq(cwu.pf), $$4 + 41, $$5 + 109);
      $$0.a(new cwq(cwu.pe), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cwq(cwu.po), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cwq(cwu.pk), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fvg.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fvg.M, wo.e);
      }

      @Override
      public void b() {
         fvg.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fvg.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fvg.L, wo.d);
      }

      @Override
      public void b() {
         fvg.this.m.L().b(new ahw(Optional.ofNullable(fvg.this.Q), Optional.ofNullable(fvg.this.R)));
         fvg.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fvg.this.z.o() && fvg.this.Q != null;
      }
   }

   class d extends fvg.e {
      private final boolean c;
      protected final int a;
      private jr<btp> d;
      private het f;

      public d(final int $$0, final int $$1, final jr<btp> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jr<btp> $$0) {
         this.d = $$0;
         this.f = flk.Q().aG().a($$0);
         this.a(fqf.a(this.b($$0), null));
      }

      protected xd b(jr<btp> $$0) {
         return wp.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fvg.this.Q = this.d;
            } else {
               fvg.this.R = this.d;
            }

            fvg.this.G();
         }
      }

      @Override
      protected void a(fof $$0) {
         $$0.a(gmj::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fvg.this.Q : fvg.this.R));
      }

      @Override
      protected xd d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends foj implements fvg.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wo.a);
      }

      protected e(int $$0, int $$1, wp $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fof $$0, int $$1, int $$2, float $$3) {
         akv $$4;
         if (!this.j) {
            $$4 = fvg.H;
         } else if (this.a) {
            $$4 = fvg.I;
         } else if (this.D()) {
            $$4 = fvg.J;
         } else {
            $$4 = fvg.K;
         }

         $$0.a(gmj::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fof var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fsr $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fvg.e {
      private final akv a;

      protected f(int $$0, int $$1, akv $$2, wp $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fof $$0) {
         $$0.a(gmj::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends fvg.d {
      public g(final int $$0, final int $$1, final jr<btp> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xd b(jr<btp> $$0) {
         return wp.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fvg.this.Q != null) {
            this.k = true;
            this.a(fvg.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
