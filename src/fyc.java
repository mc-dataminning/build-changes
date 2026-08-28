import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fyc extends fxx<cup> {
   private static final ale G = ale.b("textures/gui/container/beacon.png");
   static final ale H = ale.b("container/beacon/button_disabled");
   static final ale I = ale.b("container/beacon/button_selected");
   static final ale J = ale.b("container/beacon/button_highlighted");
   static final ale K = ale.b("container/beacon/button");
   static final ale L = ale.b("container/beacon/confirm");
   static final ale M = ale.b("container/beacon/cancel");
   private static final ww N = ww.c("block.minecraft.beacon.primary");
   private static final ww O = ww.c("block.minecraft.beacon.secondary");
   private final List<fyc.a> P = Lists.newArrayList();
   @Nullable
   je<bvc> Q;
   @Nullable
   je<bvc> R;

   public fyc(final cup $$0, cqr $$1, ww $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cuy() {
         @Override
         public void a(cuk $$0x, int $$1, cys $$2) {
         }

         @Override
         public void a(cuk $$0x, int $$1, int $$2) {
            fyc.this.Q = $$0.m();
            fyc.this.R = $$0.n();
         }
      });
   }

   private <T extends fro & fyc.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.P.clear();
      this.a(new fyc.c(this.C + 164, this.D + 107));
      this.a(new fyc.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dwi.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            je<bvc> $$4 = dwi.a.get($$0).get($$3);
            fyc.d $$5 = new fyc.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dwi.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         je<bvc> $$10 = dwi.a.get(3).get($$9);
         fyc.d $$11 = new fyc.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      je<bvc> $$12 = dwi.a.get(0).get(0);
      fyc.d $$13 = new fyc.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(frc $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(frc $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gpn::H, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cys(cyw.pt), $$4 + 20, $$5 + 109);
      $$0.a(new cys(cyw.pj), $$4 + 41, $$5 + 109);
      $$0.a(new cys(cyw.pi), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cys(cyw.ps), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cys(cyw.po), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fyc.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fyc.M, wv.e);
      }

      @Override
      public void b() {
         fyc.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fyc.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fyc.L, wv.d);
      }

      @Override
      public void b() {
         fyc.this.m.L().b(new aid(Optional.ofNullable(fyc.this.Q), Optional.ofNullable(fyc.this.R)));
         fyc.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fyc.this.z.o() && fyc.this.Q != null;
      }
   }

   class d extends fyc.e {
      private final boolean c;
      protected final int a;
      private je<bvc> d;
      private hhz f;

      public d(final int $$0, final int $$1, final je<bvc> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(je<bvc> $$0) {
         this.d = $$0;
         this.f = fof.Q().aG().a($$0);
         this.a(ftb.a(this.b($$0), null));
      }

      protected xk b(je<bvc> $$0) {
         return ww.c($$0.a().f());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fyc.this.Q = this.d;
            } else {
               fyc.this.R = this.d;
            }

            fyc.this.G();
         }
      }

      @Override
      protected void a(frc $$0) {
         $$0.a(gpn::H, this.f, this.F() + 2, this.G() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fyc.this.Q : fyc.this.R));
      }

      @Override
      protected xk d() {
         return this.b(this.d);
      }
   }

   abstract static class e extends frg implements fyc.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wv.a);
      }

      protected e(int $$0, int $$1, ww $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(frc $$0, int $$1, int $$2, float $$3) {
         ale $$4;
         if (!this.j) {
            $$4 = fyc.H;
         } else if (this.a) {
            $$4 = fyc.I;
         } else if (this.D()) {
            $$4 = fyc.J;
         } else {
            $$4 = fyc.K;
         }

         $$0.a(gpn::H, $$4, this.F(), this.G(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(frc var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fvn $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fyc.e {
      private final ale a;

      protected f(int $$0, int $$1, ale $$2, ww $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(frc $$0) {
         $$0.a(gpn::H, this.a, this.F() + 2, this.G() + 2, 18, 18);
      }
   }

   class g extends fyc.d {
      public g(final int $$0, final int $$1, final je<bvc> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xk b(je<bvc> $$0) {
         return ww.c($$0.a().f()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fyc.this.Q != null) {
            this.k = true;
            this.a(fyc.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
