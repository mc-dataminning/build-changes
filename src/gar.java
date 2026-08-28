import com.google.common.collect.Lists;
import java.util.List;

public class gar extends gaf {
   static final alk a = alk.b("gamemode_switcher/slot");
   static final alk b = alk.b("gamemode_switcher/selection");
   private static final alk c = alk.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = gar.a.values().length * 31 - 5;
   private static final xc z = xc.a("debug.gamemodes.select_next", xc.c("debug.gamemodes.press_f4").a(o.l));
   private final gar.a A;
   private gar.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<gar.b> F = Lists.newArrayList();

   public gar() {
      super(fqw.a);
      this.A = gar.a.a(this.m());
      this.B = this.A;
   }

   private djw m() {
      gmn $$0 = frf.Q().r;
      djw $$1 = $$0.h();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.i() == djw.b ? djw.a : djw.b;
      }
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < gar.a.e.length; $$0++) {
         gar.a $$1 = gar.a.e[$$0];
         this.F.add(new gar.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      if (!this.F()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(gsn::H, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
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

         for (gar.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.D()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.m, this.B);
   }

   private static void a(frf $$0, gar.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         gar.a $$2 = gar.a.a($$0.r.i());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.j.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!fkc.a(this.m.aO().h(), 292)) {
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
      a(xc.c("gameMode.creative"), "gamemode creative", new daa(dng.i)),
      b(xc.c("gameMode.survival"), "gamemode survival", new daa(dae.pP)),
      c(xc.c("gameMode.adventure"), "gamemode adventure", new daa(dae.vt)),
      d(xc.c("gameMode.spectator"), "gamemode spectator", new daa(dae.tA));

      protected static final gar.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xc g;
      final String h;
      final daa i;

      private a(final xc $$0, final String $$1, final daa $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(ftz $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xc a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      gar.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static gar.a a(djw $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public static class b extends ful {
      final gar.a a;
      private boolean b;

      public b(gar.a $$0, int $$1, int $$2) {
         super($$1, $$2, 26, 26, $$0.a());
         this.a = $$0;
      }

      @Override
      public void b(ftz $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.F() + 5, this.G() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fyk $$0) {
         this.c($$0);
      }

      @Override
      public boolean D() {
         return super.D() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(ftz $$0) {
         $$0.a(gsn::H, gar.a, this.F(), this.G(), 26, 26);
      }

      private void b(ftz $$0) {
         $$0.a(gsn::H, gar.b, this.F(), this.G(), 26, 26);
      }
   }
}
