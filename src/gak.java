import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gak extends gaf<cwg> {
   private static final alr G = alr.b("textures/gui/container/beacon.png");
   static final alr H = alr.b("container/beacon/button_disabled");
   static final alr I = alr.b("container/beacon/button_selected");
   static final alr J = alr.b("container/beacon/button_highlighted");
   static final alr K = alr.b("container/beacon/button");
   static final alr L = alr.b("container/beacon/confirm");
   static final alr M = alr.b("container/beacon/cancel");
   private static final xg N = xg.c("block.minecraft.beacon.primary");
   private static final xg O = xg.c("block.minecraft.beacon.secondary");
   private final List<gak.a> P = Lists.newArrayList();
   @Nullable
   jg<bwg> Q;
   @Nullable
   jg<bwg> R;

   public gak(final cwg $$0, csh $$1, xg $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cwp() {
         @Override
         public void a(cwb $$0x, int $$1, dak $$2) {
         }

         @Override
         public void a(cwb $$0x, int $$1, int $$2) {
            gak.this.Q = $$0.m();
            gak.this.R = $$0.n();
         }
      });
   }

   private <T extends ftw & gak.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.P.clear();
      this.a(new gak.c(this.C + 164, this.D + 107));
      this.a(new gak.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dyj.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jg<bwg> $$4 = dyj.a.get($$0).get($$3);
            gak.d $$5 = new gak.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dyj.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jg<bwg> $$10 = dyj.a.get(3).get($$9);
         gak.d $$11 = new gak.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jg<bwg> $$12 = dyj.a.get(0).get(0);
      gak.d $$13 = new gak.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(ftk $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(ftk $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gry::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new dak(dao.py), $$4 + 20, $$5 + 109);
      $$0.a(new dak(dao.po), $$4 + 41, $$5 + 109);
      $$0.a(new dak(dao.pn), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new dak(dao.px), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new dak(dao.pt), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends gak.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, gak.M, xf.e);
      }

      @Override
      public void b() {
         gak.this.m.t.o();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends gak.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, gak.L, xf.d);
      }

      @Override
      public void b() {
         gak.this.m.L().b(new aiq(Optional.ofNullable(gak.this.Q), Optional.ofNullable(gak.this.R)));
         gak.this.m.t.o();
      }

      @Override
      public void a(int $$0) {
         this.j = gak.this.z.o() && gak.this.Q != null;
      }
   }

   class d extends gak.e {
      private final boolean c;
      protected final int a;
      private jg<bwg> d;
      private hkq f;

      public d(final int $$0, final int $$1, final jg<bwg> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jg<bwg> $$0) {
         this.d = $$0;
         this.f = fqq.Q().aG().a($$0);
         this.a(fvj.a(this.b($$0), null));
      }

      protected xu b(jg<bwg> $$0) {
         return xg.c($$0.a().f());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               gak.this.Q = this.d;
            } else {
               gak.this.R = this.d;
            }

            gak.this.G();
         }
      }

      @Override
      protected void a(ftk $$0) {
         $$0.a(gry::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? gak.this.Q : gak.this.R));
      }

      @Override
      protected xu d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fto implements gak.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xf.a);
      }

      protected e(int $$0, int $$1, xg $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(ftk $$0, int $$1, int $$2, float $$3) {
         alr $$4;
         if (!this.j) {
            $$4 = gak.H;
         } else if (this.a) {
            $$4 = gak.I;
         } else if (this.D()) {
            $$4 = gak.J;
         } else {
            $$4 = gak.K;
         }

         $$0.a(gry::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(ftk var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fxv $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends gak.e {
      private final alr a;

      protected f(int $$0, int $$1, alr $$2, xg $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(ftk $$0) {
         $$0.a(gry::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends gak.d {
      public g(final int $$0, final int $$1, final jg<bwg> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xu b(jg<bwg> $$0) {
         return xg.c($$0.a().f()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (gak.this.Q != null) {
            this.k = true;
            this.a(gak.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
