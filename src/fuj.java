import com.google.common.collect.Lists;
import java.util.List;

public class fuj extends ftx {
   static final alz a = alz.b("gamemode_switcher/slot");
   static final alz b = alz.b("gamemode_switcher/selection");
   private static final alz c = alz.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fuj.a.values().length * 31 - 5;
   private static final xv z = xv.a("debug.gamemodes.select_next", xv.c("debug.gamemodes.press_f4").a(n.l));
   private final fuj.a A;
   private fuj.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fuj.b> F = Lists.newArrayList();

   public fuj() {
      super(flw.a);
      this.A = fuj.a.a(this.l());
      this.B = this.A;
   }

   private dhe l() {
      gft $$0 = fmf.Q().r;
      dhe $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dhe.b ? dhe.a : dhe.b;
      }
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fuj.a.e.length; $$0++) {
         fuj.a $$1 = fuj.a.e[$$0];
         this.F.add(new fuj.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      if (!this.F()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(glu::C, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.p, this.B.a(), this.n / 2, this.o / 2 - 31 - 20, -1);
         $$0.a(this.p, z, this.n / 2, this.o / 2 + 5, 16777215);
         if (!this.E) {
            this.C = $$1;
            this.D = $$2;
            this.E = true;
         }

         boolean $$6 = this.C == $$1 && this.D == $$2;

         for (fuj.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.B()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fnr $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.m, this.B);
   }

   private static void a(fmf $$0, fuj.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fuj.a $$2 = fuj.a.a($$0.r.j());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.i.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!ffm.a(this.m.aO().h(), 292)) {
         this.E();
         this.m.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.E = false;
         this.B = this.B.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean j() {
      return false;
   }

   static enum a {
      a(xv.c("gameMode.creative"), "gamemode creative", new cxo(dkn.i)),
      b(xv.c("gameMode.survival"), "gamemode survival", new cxo(cxs.px)),
      c(xv.c("gameMode.adventure"), "gamemode adventure", new cxo(cxs.uZ)),
      d(xv.c("gameMode.spectator"), "gamemode spectator", new cxo(cxs.tg));

      protected static final fuj.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xv g;
      final String h;
      final cxo i;

      private a(final xv $$0, final String $$1, final cxo $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fnr $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xv a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fuj.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fuj.a a(dhe $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends foc {
      final fuj.a a;
      private boolean b;

      public b(final fuj.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fnr $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fsc $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fnr $$0) {
         $$0.a(glu::C, fuj.a, this.D(), this.E(), 26, 26);
      }

      private void b(fnr $$0) {
         $$0.a(glu::C, fuj.b, this.D(), this.E(), 26, 26);
      }
   }
}
