import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ful extends fug<csy> {
   private static final alp G = alp.b("textures/gui/container/beacon.png");
   static final alp H = alp.b("container/beacon/button_disabled");
   static final alp I = alp.b("container/beacon/button_selected");
   static final alp J = alp.b("container/beacon/button_highlighted");
   static final alp K = alp.b("container/beacon/button");
   static final alp L = alp.b("container/beacon/confirm");
   static final alp M = alp.b("container/beacon/cancel");
   private static final xk N = xk.c("block.minecraft.beacon.primary");
   private static final xk O = xk.c("block.minecraft.beacon.secondary");
   private final List<ful.a> P = Lists.newArrayList();
   @Nullable
   jq<bue> Q;
   @Nullable
   jq<bue> R;

   public ful(final csy $$0, cpn $$1, xk $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cth() {
         @Override
         public void a(cst $$0x, int $$1, cxg $$2) {
         }

         @Override
         public void a(cst $$0x, int $$1, int $$2) {
            ful.this.Q = $$0.m();
            ful.this.R = $$0.n();
         }
      });
   }

   private <T extends fnw & ful.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.P.clear();
      this.a(new ful.c(this.C + 164, this.D + 107));
      this.a(new ful.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dul.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jq<bue> $$4 = dul.a.get($$0).get($$3);
            ful.d $$5 = new ful.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dul.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jq<bue> $$10 = dul.a.get(3).get($$9);
         ful.d $$11 = new ful.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jq<bue> $$12 = dul.a.get(0).get(0);
      ful.d $$13 = new ful.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fnl $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fnl $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(glq::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cxg(cxk.pp), $$4 + 20, $$5 + 109);
      $$0.a(new cxg(cxk.pf), $$4 + 41, $$5 + 109);
      $$0.a(new cxg(cxk.pe), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cxg(cxk.po), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cxg(cxk.pk), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends ful.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, ful.M, xj.e);
      }

      @Override
      public void b() {
         ful.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends ful.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, ful.L, xj.d);
      }

      @Override
      public void b() {
         ful.this.m.L().b(new aiq(Optional.ofNullable(ful.this.Q), Optional.ofNullable(ful.this.R)));
         ful.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = ful.this.z.o() && ful.this.Q != null;
      }
   }

   class d extends ful.e {
      private final boolean c;
      protected final int a;
      private jq<bue> d;
      private hbg f;

      public d(final int $$0, final int $$1, final jq<bue> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jq<bue> $$0) {
         this.d = $$0;
         this.f = flz.Q().aG().a($$0);
         this.a(fpk.a(this.b($$0), null));
      }

      protected xy b(jq<bue> $$0) {
         return xk.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               ful.this.Q = this.d;
            } else {
               ful.this.R = this.d;
            }

            ful.this.G();
         }
      }

      @Override
      protected void a(fnl $$0) {
         $$0.a(glq::H, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? ful.this.Q : ful.this.R));
      }

      @Override
      protected xy aR_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fnp implements ful.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xj.a);
      }

      protected e(int $$0, int $$1, xk $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fnl $$0, int $$1, int $$2, float $$3) {
         alp $$4;
         if (!this.j) {
            $$4 = ful.H;
         } else if (this.a) {
            $$4 = ful.I;
         } else if (this.B()) {
            $$4 = ful.J;
         } else {
            $$4 = ful.K;
         }

         $$0.a(glq::H, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fnl var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(frw $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends ful.e {
      private final alp a;

      protected f(int $$0, int $$1, alp $$2, xk $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fnl $$0) {
         $$0.a(glq::H, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends ful.d {
      public g(final int $$0, final int $$1, final jq<bue> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xy b(jq<bue> $$0) {
         return xk.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (ful.this.Q != null) {
            this.k = true;
            this.a(ful.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
