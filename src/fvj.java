import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fvj extends fqs {
   private static final xh c = xh.c("gui.socialInteractions.title");
   private static final alh d = alh.b("social_interactions/background");
   private static final alh s = alh.b("icon/search");
   private static final xh u = xh.c("gui.socialInteractions.tab_all");
   private static final xh v = xh.c("gui.socialInteractions.tab_hidden");
   private static final xh w = xh.c("gui.socialInteractions.tab_blocked");
   private static final xh x = u.e().a(n.t);
   private static final xh y = v.e().a(n.t);
   private static final xh z = w.e().a(n.t);
   private static final xh A = xh.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final xh B = xh.c("gui.socialInteractions.search_empty").a(n.h);
   private static final xh C = xh.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final xh D = xh.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final xh E = xh.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final fon M = new fon(this);
   @Nullable
   private final fqs N;
   fvi O;
   fli P;
   private String Q = "";
   private fvj.a R = fvj.a.a;
   private fkz S;
   private fkz T;
   private fkz U;
   private fkz V;
   @Nullable
   private xh W;
   private int X;

   public fvj() {
      this(null);
   }

   public fvj(@Nullable fqs $$0) {
      super(c);
      this.N = $$0;
      this.a(fja.Q());
   }

   private int m() {
      return Math.max(52, this.o - 128 - 16);
   }

   private int D() {
      return 80 + this.m() - 8;
   }

   private int E() {
      return (this.n - 238) / 2;
   }

   @Override
   public xh i() {
      return (xh)(this.W != null ? xg.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aS_() {
      this.M.a(c, this.p);
      this.O = new fvi(this, this.m, this.n, this.D() - 88, 88, 36);
      int $$0 = this.O.b() / 3;
      int $$1 = this.O.s();
      int $$2 = this.O.t();
      this.S = this.c(fkz.a(u, $$0x -> this.a(fvj.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(fkz.a(v, $$0x -> this.a(fvj.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(fkz.a(w, $$0x -> this.a(fvj.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new fli(this.p, this.E() + 28, 74, 200, 15, A) {
         @Override
         protected xv aP_() {
            return !fvj.this.P.a().isEmpty() && fvj.this.O.c() ? super.aP_().f(", ").b(fvj.B) : super.aP_();
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
      this.V = this.c(fkz.a(E, fpp.b(this, ayf.o)).a(this.n / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.R);
      this.M.b(fkz.a(xg.d, $$0x -> this.d()).a(200).a());
      this.M.a($$1x -> {
         fkx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.M.a();
      this.O.b(this.n, this.D() - 88, 88);
      this.P.c(this.E() + 28, 74);
      int $$0 = this.O.s();
      int $$1 = this.O.t();
      int $$2 = this.O.b() / 3;
      this.S.c($$0, 45);
      this.T.c(($$0 + $$1 - $$2) / 2 + 1, 45);
      this.U.c($$1 - $$2 + 1, 45);
      this.V.c(this.n / 2 - 100, 64 + this.m());
   }

   @Override
   protected void aH_() {
      this.b(this.P);
   }

   @Override
   public void d() {
      this.m.a(this.N);
   }

   private void a(fvj.a $$0) {
      this.R = $$0;
      this.S.b(u);
      this.T.b(v);
      this.U.b(w);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.S.b(x);
            Collection<UUID> $$2 = this.m.t.cw.n();
            this.O.a($$2, this.O.n(), true);
            break;
         case b:
            this.T.b(y);
            Set<UUID> $$3 = this.m.aO().c();
            $$1 = $$3.isEmpty();
            this.O.a($$3, this.O.n(), false);
            break;
         case c:
            this.U.b(z);
            fvh $$4 = this.m.aO();
            Set<UUID> $$5 = this.m.t.cw.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.n(), false);
      }

      fir $$6 = this.m.ba();
      if (!this.P.a().isEmpty() && this.O.c() && !this.P.aN_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == fvj.a.b) {
            $$6.c(C);
         } else if ($$0 == fvj.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.E() + 3;
      $$0.a(gig::B, d, $$4, 64, 236, this.m() + 16);
      $$0.a(gig::B, s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.W != null) {
         $$0.b(this.m.h, this.W, this.E() + 8, 35, -1);
      }

      if (!this.O.c()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.D()) / 2, -1);
      } else if (this.R == fvj.a.b) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.D()) / 2, -1);
      } else if (this.R == fvj.a.c) {
         $$0.a(this.m.h, D, this.n / 2, (72 + this.D()) / 2, -1);
      }

      this.V.k = this.R == fvj.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.P.aN_() && this.m.n.L.a($$0, $$1)) {
         this.d();
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

   private void a(fja $$0) {
      int $$1 = $$0.L().m().size();
      if (this.X != $$1) {
         String $$2 = "";
         gcl $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = xh.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = xh.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(gci $$0) {
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
