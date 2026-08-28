import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fyq extends fty {
   private static final xv c = xv.c("gui.socialInteractions.title");
   private static final alz d = alz.b("social_interactions/background");
   private static final alz s = alz.b("icon/search");
   private static final xv u = xv.c("gui.socialInteractions.tab_all");
   private static final xv v = xv.c("gui.socialInteractions.tab_hidden");
   private static final xv w = xv.c("gui.socialInteractions.tab_blocked");
   private static final xv x = u.e().a(n.t);
   private static final xv y = v.e().a(n.t);
   private static final xv z = w.e().a(n.t);
   private static final xv A = xv.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final xv B = xv.c("gui.socialInteractions.search_empty").a(n.h);
   private static final xv C = xv.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final xv D = xv.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final xv E = xv.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final fru M = new fru(this);
   @Nullable
   private final fty N;
   fyp O;
   foo P;
   private String Q = "";
   private fyq.a R = fyq.a.a;
   private fof S;
   private fof T;
   private fof U;
   private fof V;
   @Nullable
   private xv W;
   private int X;

   public fyq() {
      this(null);
   }

   public fyq(@Nullable fty $$0) {
      super(c);
      this.N = $$0;
      this.a(fmg.Q());
   }

   private int l() {
      return Math.max(52, this.o - 128 - 16);
   }

   private int E() {
      return 80 + this.l() - 8;
   }

   private int F() {
      return (this.n - 238) / 2;
   }

   @Override
   public xv i() {
      return (xv)(this.W != null ? xu.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aT_() {
      this.M.a(c, this.p);
      this.O = new fyp(this, this.m, this.n, this.E() - 88, 88, 36);
      int $$0 = this.O.a() / 3;
      int $$1 = this.O.s();
      int $$2 = this.O.t();
      this.S = this.c(fof.a(u, $$0x -> this.a(fyq.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(fof.a(v, $$0x -> this.a(fyq.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(fof.a(w, $$0x -> this.a(fyq.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new foo(this.p, this.F() + 28, 74, 200, 15, A) {
         @Override
         protected yj aR_() {
            return !fyq.this.P.a().isEmpty() && fyq.this.O.b() ? super.aR_().f(", ").b(fyq.B) : super.aR_();
         }
      };
      this.P.f(16);
      this.P.g(true);
      this.P.g(-1);
      this.P.a($$3);
      this.P.c(A);
      this.P.b(this::a);
      this.c(this.P);
      this.d(this.O);
      this.V = this.c(fof.a(E, fsv.b(this, aza.o)).a(this.n / 2 - 100, 64 + this.l(), 200, 20).a());
      this.a(this.R);
      this.M.b(fof.a(xu.d, $$0x -> this.aP_()).a(200).a());
      this.M.a($$1x -> {
         fod var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.M.a();
      this.O.b(this.n, this.E() - 88, 88);
      this.P.c(this.F() + 28, 74);
      int $$0 = this.O.s();
      int $$1 = this.O.t();
      int $$2 = this.O.a() / 3;
      this.S.c($$0, 45);
      this.T.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.U.c($$1 - $$2 + 1, 45);
      this.V.c(this.n / 2 - 100, 64 + this.l());
   }

   @Override
   protected void aG_() {
      this.b(this.P);
   }

   @Override
   public void aP_() {
      this.m.a(this.N);
   }

   private void a(fyq.a $$0) {
      this.R = $$0;
      this.S.b(u);
      this.T.b(v);
      this.U.b(w);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.S.b(x);
            Collection<UUID> $$2 = this.m.t.i.n();
            this.O.a($$2, this.O.n(), true);
            break;
         case b:
            this.T.b(y);
            Set<UUID> $$3 = this.m.aN().c();
            $$1 = $$3.isEmpty();
            this.O.a($$3, this.O.n(), false);
            break;
         case c:
            this.U.b(z);
            fyo $$4 = this.m.aN();
            Set<UUID> $$5 = this.m.t.i.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.n(), false);
      }

      flx $$6 = this.m.aZ();
      if (!this.P.a().isEmpty() && this.O.b() && !this.P.aN_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == fyq.a.b) {
            $$6.c(C);
         } else if ($$0 == fyq.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(fns $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.F() + 3;
      $$0.a(glv::C, d, $$4, 64, 236, this.l() + 16);
      $$0.a(glv::C, s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.W != null) {
         $$0.b(this.m.h, this.W, this.F() + 8, 35, -1);
      }

      if (!this.O.b()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == fyq.a.b) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == fyq.a.c) {
         $$0.a(this.m.h, D, this.n / 2, (72 + this.E()) / 2, -1);
      }

      this.V.k = this.R == fyq.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.P.aN_() && this.m.n.L.a($$0, $$1)) {
         this.aP_();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean j() {
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

   private void a(fmg $$0) {
      int $$1 = $$0.L().m().size();
      if (this.X != $$1) {
         String $$2 = "";
         gfz $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = xv.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = xv.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(gfw $$0) {
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
