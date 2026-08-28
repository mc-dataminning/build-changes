import com.google.common.collect.Lists;
import java.util.List;

public class fuw extends fuk {
   static final akv a = akv.b("gamemode_switcher/slot");
   static final akv b = akv.b("gamemode_switcher/selection");
   private static final akv c = akv.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fuw.a.values().length * 31 - 5;
   private static final wp z = wp.a("debug.gamemodes.select_next", wp.c("debug.gamemodes.press_f4").a(n.l));
   private final fuw.a A;
   private fuw.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fuw.b> F = Lists.newArrayList();

   public fuw() {
      super(fkz.a);
      this.A = fuw.a.a(this.m());
      this.B = this.A;
   }

   private dge m() {
      ggi $$0 = fli.Q().r;
      dge $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dge.b ? dge.a : dge.b;
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

   private static void a(fli $$0, fuw.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fuw.a $$2 = fuw.a.a($$0.r.j());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.j.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!feo.a(this.m.aO().h(), 292)) {
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
      a(wp.c("gameMode.creative"), "gamemode creative", new cwo(djn.i)),
      b(wp.c("gameMode.survival"), "gamemode survival", new cwo(cws.pG)),
      c(wp.c("gameMode.adventure"), "gamemode adventure", new cwo(cws.vi)),
      d(wp.c("gameMode.spectator"), "gamemode spectator", new cwo(cws.tp));

      protected static final fuw.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wp g;
      final String h;
      final cwo i;

      private a(final wp $$0, final String $$1, final cwo $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fod $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wp a() {
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

      static fuw.a a(dge $$0) {
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
