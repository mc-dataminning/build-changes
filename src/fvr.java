import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fvr extends fra {
   private static final xi c = xi.c("gui.socialInteractions.title");
   private static final ali d = ali.b("social_interactions/background");
   private static final ali s = ali.b("icon/search");
   private static final xi u = xi.c("gui.socialInteractions.tab_all");
   private static final xi v = xi.c("gui.socialInteractions.tab_hidden");
   private static final xi w = xi.c("gui.socialInteractions.tab_blocked");
   private static final xi x = u.e().a(n.t);
   private static final xi y = v.e().a(n.t);
   private static final xi z = w.e().a(n.t);
   private static final xi A = xi.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final xi B = xi.c("gui.socialInteractions.search_empty").a(n.h);
   private static final xi C = xi.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final xi D = xi.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final xi E = xi.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final fow M = new fow(this);
   @Nullable
   private final fra N;
   fvq O;
   flq P;
   private String Q = "";
   private fvr.a R = fvr.a.a;
   private flh S;
   private flh T;
   private flh U;
   private flh V;
   @Nullable
   private xi W;
   private int X;

   public fvr() {
      this(null);
   }

   public fvr(@Nullable fra $$0) {
      super(c);
      this.N = $$0;
      this.a(fji.Q());
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
   public xi i() {
      return (xi)(this.W != null ? xh.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aR_() {
      this.M.a(c, this.p);
      this.O = new fvq(this, this.m, this.n, this.D() - 88, 88, 36);
      int $$0 = this.O.b() / 3;
      int $$1 = this.O.s();
      int $$2 = this.O.t();
      this.S = this.c(flh.a(u, $$0x -> this.a(fvr.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(flh.a(v, $$0x -> this.a(fvr.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(flh.a(w, $$0x -> this.a(fvr.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new flq(this.p, this.E() + 28, 74, 200, 15, A) {
         @Override
         protected xw aO_() {
            return !fvr.this.P.a().isEmpty() && fvr.this.O.c() ? super.aO_().f(", ").b(fvr.B) : super.aO_();
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
      this.V = this.c(flh.a(E, fpx.b(this, ayg.o)).a(this.n / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.R);
      this.M.b(flh.a(xh.d, $$0x -> this.d()).a(200).a());
      this.M.a($$1x -> {
         flf var10000 = this.c($$1x);
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
   protected void aG_() {
      this.b(this.P);
   }

   @Override
   public void d() {
      this.m.a(this.N);
   }

   private void a(fvr.a $$0) {
      this.R = $$0;
      this.S.b(u);
      this.T.b(v);
      this.U.b(w);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.S.b(x);
            Collection<UUID> $$2 = this.m.t.j.n();
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
            fvp $$4 = this.m.aN();
            Set<UUID> $$5 = this.m.t.j.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.n(), false);
      }

      fiz $$6 = this.m.aZ();
      if (!this.P.a().isEmpty() && this.O.c() && !this.P.aM_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == fvr.a.b) {
            $$6.c(C);
         } else if ($$0 == fvr.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.E() + 3;
      $$0.a(gir::B, d, $$4, 64, 236, this.m() + 16);
      $$0.a(gir::B, s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.W != null) {
         $$0.b(this.m.h, this.W, this.E() + 8, 35, -1);
      }

      if (!this.O.c()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.D()) / 2, -1);
      } else if (this.R == fvr.a.b) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.D()) / 2, -1);
      } else if (this.R == fvr.a.c) {
         $$0.a(this.m.h, D, this.n / 2, (72 + this.D()) / 2, -1);
      }

      this.V.k = this.R == fvr.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.P.aM_() && this.m.n.L.a($$0, $$1)) {
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

   private void a(fji $$0) {
      int $$1 = $$0.L().m().size();
      if (this.X != $$1) {
         String $$2 = "";
         gcw $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = xi.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = xi.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(gct $$0) {
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
