import com.google.common.collect.Lists;
import java.util.List;

public class fuu extends fui {
   static final aku a = aku.b("gamemode_switcher/slot");
   static final aku b = aku.b("gamemode_switcher/selection");
   private static final aku c = aku.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fuu.a.values().length * 31 - 5;
   private static final wo z = wo.a("debug.gamemodes.select_next", wo.c("debug.gamemodes.press_f4").a(n.l));
   private final fuu.a A;
   private fuu.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fuu.b> F = Lists.newArrayList();

   public fuu() {
      super(fky.a);
      this.A = fuu.a.a(this.m());
      this.B = this.A;
   }

   private dgd m() {
      ggg $$0 = flh.Q().r;
      dgd $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dgd.b ? dgd.a : dgd.b;
      }
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fuu.a.e.length; $$0++) {
         fuu.a $$1 = fuu.a.e[$$0];
         this.F.add(new fuu.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      if (!this.F()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(gmf::H, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
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

         for (fuu.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.D()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.m, this.B);
   }

   private static void a(flh $$0, fuu.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fuu.a $$2 = fuu.a.a($$0.r.j());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.j.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!fen.a(this.m.aO().h(), 292)) {
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
      a(wo.c("gameMode.creative"), "gamemode creative", new cwn(djm.i)),
      b(wo.c("gameMode.survival"), "gamemode survival", new cwn(cwr.pG)),
      c(wo.c("gameMode.adventure"), "gamemode adventure", new cwn(cwr.vi)),
      d(wo.c("gameMode.spectator"), "gamemode spectator", new cwn(cwr.tp));

      protected static final fuu.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wo g;
      final String h;
      final cwn i;

      private a(final wo $$0, final String $$1, final cwn $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fob $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wo a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fuu.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fuu.a a(dgd $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public static class b extends fon {
      final fuu.a a;
      private boolean b;

      public b(fuu.a $$0, int $$1, int $$2) {
         super($$1, $$2, 26, 26, $$0.a());
         this.a = $$0;
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.F() + 5, this.G() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fsn $$0) {
         this.c($$0);
      }

      @Override
      public boolean D() {
         return super.D() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fob $$0) {
         $$0.a(gmf::H, fuu.a, this.F(), this.G(), 26, 26);
      }

      private void b(fob $$0) {
         $$0.a(gmf::H, fuu.b, this.F(), this.G(), 26, 26);
      }
   }
}
