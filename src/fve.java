import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fve extends fuz<csh> {
   private static final aku G = aku.b("textures/gui/container/beacon.png");
   static final aku H = aku.b("container/beacon/button_disabled");
   static final aku I = aku.b("container/beacon/button_selected");
   static final aku J = aku.b("container/beacon/button_highlighted");
   static final aku K = aku.b("container/beacon/button");
   static final aku L = aku.b("container/beacon/confirm");
   static final aku M = aku.b("container/beacon/cancel");
   private static final wo N = wo.c("block.minecraft.beacon.primary");
   private static final wo O = wo.c("block.minecraft.beacon.secondary");
   private final List<fve.a> P = Lists.newArrayList();
   @Nullable
   jr<btn> Q;
   @Nullable
   jr<btn> R;

   public fve(final csh $$0, cow $$1, wo $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new csq() {
         @Override
         public void a(csc $$0x, int $$1, cwp $$2) {
         }

         @Override
         public void a(csc $$0x, int $$1, int $$2) {
            fve.this.Q = $$0.m();
            fve.this.R = $$0.n();
         }
      });
   }

   private <T extends fop & fve.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.P.clear();
      this.a(new fve.c(this.C + 164, this.D + 107));
      this.a(new fve.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dtu.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jr<btn> $$4 = dtu.a.get($$0).get($$3);
            fve.d $$5 = new fve.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dtu.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jr<btn> $$10 = dtu.a.get(3).get($$9);
         fve.d $$11 = new fve.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jr<btn> $$12 = dtu.a.get(0).get(0);
      fve.d $$13 = new fve.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fod $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fod $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gmh::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cwp(cwt.pp), $$4 + 20, $$5 + 109);
      $$0.a(new cwp(cwt.pf), $$4 + 41, $$5 + 109);
      $$0.a(new cwp(cwt.pe), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cwp(cwt.po), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cwp(cwt.pk), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fve.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fve.M, wn.e);
      }

      @Override
      public void b() {
         fve.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fve.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fve.L, wn.d);
      }

      @Override
      public void b() {
         fve.this.m.L().b(new ahv(Optional.ofNullable(fve.this.Q), Optional.ofNullable(fve.this.R)));
         fve.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fve.this.z.o() && fve.this.Q != null;
      }
   }

   class d extends fve.e {
      private final boolean c;
      protected final int a;
      private jr<btn> d;
      private hej f;

      public d(final int $$0, final int $$1, final jr<btn> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jr<btn> $$0) {
         this.d = $$0;
         this.f = flj.Q().aG().a($$0);
         this.a(fqd.a(this.b($$0), null));
      }

      protected xc b(jr<btn> $$0) {
         return wo.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fve.this.Q = this.d;
            } else {
               fve.this.R = this.d;
            }

            fve.this.G();
         }
      }

      @Override
      protected void a(fod $$0) {
         $$0.a(gmh::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fve.this.Q : fve.this.R));
      }

      @Override
      protected xc d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends foh implements fve.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wn.a);
      }

      protected e(int $$0, int $$1, wo $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fod $$0, int $$1, int $$2, float $$3) {
         aku $$4;
         if (!this.j) {
            $$4 = fve.H;
         } else if (this.a) {
            $$4 = fve.I;
         } else if (this.D()) {
            $$4 = fve.J;
         } else {
            $$4 = fve.K;
         }

         $$0.a(gmh::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fod var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fsp $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fve.e {
      private final aku a;

      protected f(int $$0, int $$1, aku $$2, wo $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fod $$0) {
         $$0.a(gmh::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends fve.d {
      public g(final int $$0, final int $$1, final jr<btn> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xc b(jr<btn> $$0) {
         return wo.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fve.this.Q != null) {
            this.k = true;
            this.a(fve.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
