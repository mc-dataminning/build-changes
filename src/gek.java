import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gek extends fzq {
   private static final xg c = xg.c("gui.socialInteractions.title");
   private static final alr d = alr.b("social_interactions/background");
   private static final alr s = alr.b("icon/search");
   private static final xg u = xg.c("gui.socialInteractions.tab_all");
   private static final xg v = xg.c("gui.socialInteractions.tab_hidden");
   private static final xg w = xg.c("gui.socialInteractions.tab_blocked");
   private static final xg x = u.e().a(o.t);
   private static final xg y = v.e().a(o.t);
   private static final xg z = w.e().a(o.t);
   private static final xg A = xg.c("gui.socialInteractions.search_hint").a(o.u).a(o.h);
   static final xg B = xg.c("gui.socialInteractions.search_empty").a(o.h);
   private static final xg C = xg.c("gui.socialInteractions.empty_hidden").a(o.h);
   private static final xg D = xg.c("gui.socialInteractions.empty_blocked").a(o.h);
   private static final xg E = xg.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final fxm M = new fxm(this);
   @Nullable
   private final fzq N;
   gej O;
   fuh P;
   private String Q = "";
   private gek.a R = gek.a.a;
   private fty S;
   private fty T;
   private fty U;
   private fty V;
   @Nullable
   private xg W;
   private int X;

   public gek() {
      this(null);
   }

   public gek(@Nullable fzq $$0) {
      super(c);
      this.N = $$0;
      this.a(fqq.Q());
   }

   private int m() {
      return Math.max(52, this.o - 128 - 16);
   }

   private int E() {
      return 80 + this.m() - 8;
   }

   private int F() {
      return (this.n - 238) / 2;
   }

   @Override
   public xg i() {
      return (xg)(this.W != null ? xf.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aO_() {
      this.M.a(c, this.p);
      this.O = new gej(this, this.m, this.n, this.E() - 88, 88, 36);
      int $$0 = this.O.a() / 3;
      int $$1 = this.O.u();
      int $$2 = this.O.v();
      this.S = this.c(fty.a(u, $$0x -> this.a(gek.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(fty.a(v, $$0x -> this.a(gek.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(fty.a(w, $$0x -> this.a(gek.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new fuh(this.p, this.F() + 28, 74, 200, 15, A) {
         @Override
         protected xu d() {
            return !gek.this.P.a().isEmpty() && gek.this.O.b() ? super.d().f(", ").b(gek.B) : super.d();
         }
      };
      this.P.f(16);
      this.P.g(true);
      this.P.m(-1);
      this.P.a($$3);
      this.P.c(A);
      this.P.b(this::a);
      this.c(this.P);
      this.d(this.O);
      this.V = this.c(fty.a(E, fyn.b(this, ayt.o)).a(this.n / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.R);
      this.M.b(fty.a(xf.d, $$0x -> this.aL_()).a(200).a());
      this.M.a($$1x -> {
         ftw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.M.a();
      this.O.b(this.n, this.E() - 88, 88);
      this.P.c(this.F() + 28, 74);
      int $$0 = this.O.u();
      int $$1 = this.O.v();
      int $$2 = this.O.a() / 3;
      this.S.c($$0, 45);
      this.T.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.U.c($$1 - $$2 + 1, 45);
      this.V.c(this.n / 2 - 100, 64 + this.m());
   }

   @Override
   protected void aC_() {
      this.b(this.P);
   }

   @Override
   public void aL_() {
      this.m.a(this.N);
   }

   private void a(gek.a $$0) {
      this.R = $$0;
      this.S.b(u);
      this.T.b(v);
      this.U.b(w);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.S.b(x);
            Collection<UUID> $$2 = this.m.t.j.m();
            this.O.a($$2, this.O.g(), true);
            break;
         case b:
            this.T.b(y);
            Set<UUID> $$3 = this.m.aN().c();
            $$1 = $$3.isEmpty();
            this.O.a($$3, this.O.g(), false);
            break;
         case c:
            this.U.b(z);
            gei $$4 = this.m.aN();
            Set<UUID> $$5 = this.m.t.j.m().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.g(), false);
      }

      fqh $$6 = this.m.aY();
      if (!this.P.a().isEmpty() && this.O.b() && !this.P.aJ_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == gek.a.b) {
            $$6.c(C);
         } else if ($$0 == gek.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.F() + 3;
      $$0.a(gry::H, d, $$4, 64, 236, this.m() + 16);
      $$0.a(gry::H, s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.W != null) {
         $$0.b(this.m.h, this.W, this.F() + 8, 35, -1);
      }

      if (!this.O.b()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == gek.a.b) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == gek.a.c) {
         $$0.a(this.m.h, D, this.n / 2, (72 + this.E()) / 2, -1);
      }

      this.V.k = this.R == gek.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.P.aJ_() && this.m.n.L.a($$0, $$1)) {
         this.aL_();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   private void a(String $$0) {
      $$0 = $$0.toLowerCase(Locale.ROOT);
      if (!$$0.equals(this.Q)) {
         this.O.a($$0);
         this.Q = $$0;
         this.a(this.R);
      }
   }

   private void a(fqq $$0) {
      int $$1 = $$0.L().l().size();
      if (this.X != $$1) {
         String $$2 = "";
         gmd $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = xg.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = xg.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(gma $$0) {
      this.O.a($$0, this.R);
   }

   public void a(UUID $$0) {
      this.O.a($$0);
   }

   public static enum a {
      a,
      b,
      c;
   }
}
