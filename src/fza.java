import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fza extends fui {
   private static final wo c = wo.c("gui.socialInteractions.title");
   private static final aku d = aku.b("social_interactions/background");
   private static final aku s = aku.b("icon/search");
   private static final wo u = wo.c("gui.socialInteractions.tab_all");
   private static final wo v = wo.c("gui.socialInteractions.tab_hidden");
   private static final wo w = wo.c("gui.socialInteractions.tab_blocked");
   private static final wo x = u.e().a(n.t);
   private static final wo y = v.e().a(n.t);
   private static final wo z = w.e().a(n.t);
   private static final wo A = wo.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final wo B = wo.c("gui.socialInteractions.search_empty").a(n.h);
   private static final wo C = wo.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final wo D = wo.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final wo E = wo.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final fse M = new fse(this);
   @Nullable
   private final fui N;
   fyz O;
   foz P;
   private String Q = "";
   private fza.a R = fza.a.a;
   private fop S;
   private fop T;
   private fop U;
   private fop V;
   @Nullable
   private wo W;
   private int X;

   public fza() {
      this(null);
   }

   public fza(@Nullable fui $$0) {
      super(c);
      this.N = $$0;
      this.a(flh.Q());
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
   public wo i() {
      return (wo)(this.W != null ? wn.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aR_() {
      this.M.a(c, this.p);
      this.O = new fyz(this, this.m, this.n, this.E() - 88, 88, 36);
      int $$0 = this.O.a() / 3;
      int $$1 = this.O.u();
      int $$2 = this.O.v();
      this.S = this.c(fop.a(u, $$0x -> this.a(fza.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(fop.a(v, $$0x -> this.a(fza.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(fop.a(w, $$0x -> this.a(fza.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new foz(this.p, this.F() + 28, 74, 200, 15, A) {
         @Override
         protected xc d() {
            return !fza.this.P.a().isEmpty() && fza.this.O.b() ? super.d().f(", ").b(fza.B) : super.d();
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
      this.V = this.c(fop.a(E, ftf.b(this, axu.o)).a(this.n / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.R);
      this.M.b(fop.a(wn.d, $$0x -> this.aO_()).a(200).a());
      this.M.a($$1x -> {
         fon var10000 = this.c($$1x);
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
   protected void aF_() {
      this.b(this.P);
   }

   @Override
   public void aO_() {
      this.m.a(this.N);
   }

   private void a(fza.a $$0) {
      this.R = $$0;
      this.S.b(u);
      this.T.b(v);
      this.U.b(w);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.S.b(x);
            Collection<UUID> $$2 = this.m.t.j.n();
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
            fyy $$4 = this.m.aN();
            Set<UUID> $$5 = this.m.t.j.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.g(), false);
      }

      fky $$6 = this.m.aY();
      if (!this.P.a().isEmpty() && this.O.b() && !this.P.aM_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == fza.a.b) {
            $$6.c(C);
         } else if ($$0 == fza.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.F() + 3;
      $$0.a(gmf::H, d, $$4, 64, 236, this.m() + 16);
      $$0.a(gmf::H, s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.W != null) {
         $$0.b(this.m.h, this.W, this.F() + 8, 35, -1);
      }

      if (!this.O.b()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == fza.a.b) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == fza.a.c) {
         $$0.a(this.m.h, D, this.n / 2, (72 + this.E()) / 2, -1);
      }

      this.V.k = this.R == fza.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.P.aM_() && this.m.n.L.a($$0, $$1)) {
         this.aO_();
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

   private void a(flh $$0) {
      int $$1 = $$0.L().m().size();
      if (this.X != $$1) {
         String $$2 = "";
         ggl $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = wo.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = wo.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(ggi $$0) {
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
