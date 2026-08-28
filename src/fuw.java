import com.google.common.collect.Lists;
import java.util.List;

public class fuw extends fuk {
   static final aku a = aku.b("gamemode_switcher/slot");
   static final aku b = aku.b("gamemode_switcher/selection");
   private static final aku c = aku.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fuw.a.values().length * 31 - 5;
   private static final wo z = wo.a("debug.gamemodes.select_next", wo.c("debug.gamemodes.press_f4").a(n.l));
   private final fuw.a A;
   private fuw.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fuw.b> F = Lists.newArrayList();

   public fuw() {
      super(fla.a);
      this.A = fuw.a.a(this.m());
      this.B = this.A;
   }

   private dgf m() {
      ggi $$0 = flj.Q().r;
      dgf $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dgf.b ? dgf.a : dgf.b;
      }
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fuw.a.e.length; $$0++) {
         fuw.a $$1 = fuw.a.e[$$0];
         this.F.add(new fuw.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      if (!this.F()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(gmh::H, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
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

         for (fuw.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.D()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.m, this.B);
   }

   private static void a(flj $$0, fuw.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fuw.a $$2 = fuw.a.a($$0.r.j());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.j.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!fep.a(this.m.aO().h(), 292)) {
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
   public boolean k() {
      return false;
   }

   static enum a {
      a(wo.c("gameMode.creative"), "gamemode creative", new cwp(djo.i)),
      b(wo.c("gameMode.survival"), "gamemode survival", new cwp(cwt.pG)),
      c(wo.c("gameMode.adventure"), "gamemode adventure", new cwp(cwt.vi)),
      d(wo.c("gameMode.spectator"), "gamemode spectator", new cwp(cwt.tp));

      protected static final fuw.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wo g;
      final String h;
      final cwp i;

      private a(final wo $$0, final String $$1, final cwp $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fod $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wo a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fuw.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fuw.a a(dgf $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public static class b extends fop {
      final fuw.a a;
      private boolean b;

      public b(fuw.a $$0, int $$1, int $$2) {
         super($$1, $$2, 26, 26, $$0.a());
         this.a = $$0;
      }

      @Override
      public void b(fod $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.F() + 5, this.G() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fsp $$0) {
         this.c($$0);
      }

      @Override
      public boolean D() {
         return super.D() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fod $$0) {
         $$0.a(gmh::H, fuw.a, this.F(), this.G(), 26, 26);
      }

      private void b(fod $$0) {
         $$0.a(gmh::H, fuw.b, this.F(), this.G(), 26, 26);
      }
   }
}
