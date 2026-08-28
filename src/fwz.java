import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fwz extends fwu<cts> {
   private static final ald G = ald.b("textures/gui/container/beacon.png");
   static final ald H = ald.b("container/beacon/button_disabled");
   static final ald I = ald.b("container/beacon/button_selected");
   static final ald J = ald.b("container/beacon/button_highlighted");
   static final ald K = ald.b("container/beacon/button");
   static final ald L = ald.b("container/beacon/confirm");
   static final ald M = ald.b("container/beacon/cancel");
   private static final wv N = wv.c("block.minecraft.beacon.primary");
   private static final wv O = wv.c("block.minecraft.beacon.secondary");
   private final List<fwz.a> P = Lists.newArrayList();
   @Nullable
   js<buu> Q;
   @Nullable
   js<buu> R;

   public fwz(final cts $$0, cqh $$1, wv $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cub() {
         @Override
         public void a(ctn $$0x, int $$1, cxy $$2) {
         }

         @Override
         public void a(ctn $$0x, int $$1, int $$2) {
            fwz.this.Q = $$0.m();
            fwz.this.R = $$0.n();
         }
      });
   }

   private <T extends fql & fwz.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.P.clear();
      this.a(new fwz.c(this.C + 164, this.D + 107));
      this.a(new fwz.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dvg.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            js<buu> $$4 = dvg.a.get($$0).get($$3);
            fwz.d $$5 = new fwz.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dvg.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         js<buu> $$10 = dvg.a.get(3).get($$9);
         fwz.d $$11 = new fwz.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      js<buu> $$12 = dvg.a.get(0).get(0);
      fwz.d $$13 = new fwz.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fpz $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fpz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(goi::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cxy(cyc.pt), $$4 + 20, $$5 + 109);
      $$0.a(new cxy(cyc.pj), $$4 + 41, $$5 + 109);
      $$0.a(new cxy(cyc.pi), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cxy(cyc.ps), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cxy(cyc.po), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fwz.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fwz.M, wu.e);
      }

      @Override
      public void b() {
         fwz.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fwz.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fwz.L, wu.d);
      }

      @Override
      public void b() {
         fwz.this.m.L().b(new aic(Optional.ofNullable(fwz.this.Q), Optional.ofNullable(fwz.this.R)));
         fwz.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fwz.this.z.o() && fwz.this.Q != null;
      }
   }

   class d extends fwz.e {
      private final boolean c;
      protected final int a;
      private js<buu> d;
      private hgs f;

      public d(final int $$0, final int $$1, final js<buu> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(js<buu> $$0) {
         this.d = $$0;
         this.f = fnd.Q().aG().a($$0);
         this.a(fry.a(this.b($$0), null));
      }

      protected xj b(js<buu> $$0) {
         return wv.c($$0.a().f());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fwz.this.Q = this.d;
            } else {
               fwz.this.R = this.d;
            }

            fwz.this.G();
         }
      }

      @Override
      protected void a(fpz $$0) {
         $$0.a(goi::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fwz.this.Q : fwz.this.R));
      }

      @Override
      protected xj d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fqd implements fwz.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wu.a);
      }

      protected e(int $$0, int $$1, wv $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fpz $$0, int $$1, int $$2, float $$3) {
         ald $$4;
         if (!this.j) {
            $$4 = fwz.H;
         } else if (this.a) {
            $$4 = fwz.I;
         } else if (this.D()) {
            $$4 = fwz.J;
         } else {
            $$4 = fwz.K;
         }

         $$0.a(goi::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fpz var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fuk $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fwz.e {
      private final ald a;

      protected f(int $$0, int $$1, ald $$2, wv $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fpz $$0) {
         $$0.a(goi::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends fwz.d {
      public g(final int $$0, final int $$1, final js<buu> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xj b(js<buu> $$0) {
         return wv.c($$0.a().f()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fwz.this.Q != null) {
            this.k = true;
            this.a(fwz.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
