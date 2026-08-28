import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fwc extends fvx<ctb> {
   private static final aku G = aku.b("textures/gui/container/beacon.png");
   static final aku H = aku.b("container/beacon/button_disabled");
   static final aku I = aku.b("container/beacon/button_selected");
   static final aku J = aku.b("container/beacon/button_highlighted");
   static final aku K = aku.b("container/beacon/button");
   static final aku L = aku.b("container/beacon/confirm");
   static final aku M = aku.b("container/beacon/cancel");
   private static final wp N = wp.c("block.minecraft.beacon.primary");
   private static final wp O = wp.c("block.minecraft.beacon.secondary");
   private final List<fwc.a> P = Lists.newArrayList();
   @Nullable
   jr<buc> Q;
   @Nullable
   jr<buc> R;

   public fwc(final ctb $$0, cpq $$1, wp $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new ctk() {
         @Override
         public void a(csw $$0x, int $$1, cxh $$2) {
         }

         @Override
         public void a(csw $$0x, int $$1, int $$2) {
            fwc.this.Q = $$0.m();
            fwc.this.R = $$0.n();
         }
      });
   }

   private <T extends fpo & fwc.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.P.clear();
      this.a(new fwc.c(this.C + 164, this.D + 107));
      this.a(new fwc.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dun.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jr<buc> $$4 = dun.a.get($$0).get($$3);
            fwc.d $$5 = new fwc.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dun.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jr<buc> $$10 = dun.a.get(3).get($$9);
         fwc.d $$11 = new fwc.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jr<buc> $$12 = dun.a.get(0).get(0);
      fwc.d $$13 = new fwc.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fpc $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fpc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gnh::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cxh(cxl.pr), $$4 + 20, $$5 + 109);
      $$0.a(new cxh(cxl.ph), $$4 + 41, $$5 + 109);
      $$0.a(new cxh(cxl.pg), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cxh(cxl.pq), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cxh(cxl.pm), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fwc.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fwc.M, wo.e);
      }

      @Override
      public void b() {
         fwc.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fwc.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fwc.L, wo.d);
      }

      @Override
      public void b() {
         fwc.this.m.L().b(new ahv(Optional.ofNullable(fwc.this.Q), Optional.ofNullable(fwc.this.R)));
         fwc.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fwc.this.z.o() && fwc.this.Q != null;
      }
   }

   class d extends fwc.e {
      private final boolean c;
      protected final int a;
      private jr<buc> d;
      private hfr f;

      public d(final int $$0, final int $$1, final jr<buc> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jr<buc> $$0) {
         this.d = $$0;
         this.f = fmg.Q().aG().a($$0);
         this.a(frb.a(this.b($$0), null));
      }

      protected xd b(jr<buc> $$0) {
         return wp.c($$0.a().f());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fwc.this.Q = this.d;
            } else {
               fwc.this.R = this.d;
            }

            fwc.this.G();
         }
      }

      @Override
      protected void a(fpc $$0) {
         $$0.a(gnh::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fwc.this.Q : fwc.this.R));
      }

      @Override
      protected xd d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fpg implements fwc.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wo.a);
      }

      protected e(int $$0, int $$1, wp $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fpc $$0, int $$1, int $$2, float $$3) {
         aku $$4;
         if (!this.j) {
            $$4 = fwc.H;
         } else if (this.a) {
            $$4 = fwc.I;
         } else if (this.D()) {
            $$4 = fwc.J;
         } else {
            $$4 = fwc.K;
         }

         $$0.a(gnh::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fpc var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ftn $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fwc.e {
      private final aku a;

      protected f(int $$0, int $$1, aku $$2, wp $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fpc $$0) {
         $$0.a(gnh::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends fwc.d {
      public g(final int $$0, final int $$1, final jr<buc> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xd b(jr<buc> $$0) {
         return wp.c($$0.a().f()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fwc.this.Q != null) {
            this.k = true;
            this.a(fwc.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
