import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fuk extends fpt {
   private static final xd c = xd.c("gui.socialInteractions.title");
   private static final alb d = alb.b("social_interactions/background");
   private static final alb s = alb.b("icon/search");
   private static final xd u = xd.c("gui.socialInteractions.tab_all");
   private static final xd v = xd.c("gui.socialInteractions.tab_hidden");
   private static final xd w = xd.c("gui.socialInteractions.tab_blocked");
   private static final xd x = u.e().a(n.t);
   private static final xd y = v.e().a(n.t);
   private static final xd z = w.e().a(n.t);
   private static final xd A = xd.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final xd B = xd.c("gui.socialInteractions.search_empty").a(n.h);
   private static final xd C = xd.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final xd D = xd.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final xd E = xd.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final fno M = new fno(this);
   @Nullable
   private final fpt N;
   fuj O;
   fkj P;
   private String Q = "";
   private fuk.a R = fuk.a.a;
   private fka S;
   private fka T;
   private fka U;
   private fka V;
   @Nullable
   private xd W;
   private int X;

   public fuk() {
      this(null);
   }

   public fuk(@Nullable fpt $$0) {
      super(c);
      this.N = $$0;
      this.a(fib.Q());
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
   public xd i() {
      return (xd)(this.W != null ? xc.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aT_() {
      this.M.a(c, this.p);
      this.O = new fuj(this, this.m, this.n, this.D() - 88, 88, 36);
      int $$0 = this.O.b() / 3;
      int $$1 = this.O.s();
      int $$2 = this.O.t();
      this.S = this.c(fka.a(u, $$0x -> this.a(fuk.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(fka.a(v, $$0x -> this.a(fuk.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(fka.a(w, $$0x -> this.a(fuk.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new fkj(this.p, this.E() + 28, 74, 200, 15, A) {
         @Override
         protected xr aQ_() {
            return !fuk.this.P.a().isEmpty() && fuk.this.O.c() ? super.aQ_().f(", ").b(fuk.B) : super.aQ_();
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
      this.V = this.c(fka.a(E, fop.b(this, axy.o)).a(this.n / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.R);
      this.M.b(fka.a(xc.d, $$0x -> this.d()).a(200).a());
      this.M.a($$1x -> {
         fjy var10000 = this.c($$1x);
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
   protected void aI_() {
      this.b(this.P);
   }

   @Override
   public void d() {
      this.m.a(this.N);
   }

   private void a(fuk.a $$0) {
      this.R = $$0;
      this.S.b(u);
      this.T.b(v);
      this.U.b(w);
      boolean $$1 = false;
      switch ($$0) {
         case a:
            this.S.b(x);
            Collection<UUID> $$2 = this.m.t.cx.n();
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
            fui $$4 = this.m.aN();
            Set<UUID> $$5 = this.m.t.cx.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.n(), false);
      }

      fhs $$6 = this.m.aY();
      if (!this.P.a().isEmpty() && this.O.c() && !this.P.aO_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == fuk.a.b) {
            $$6.c(C);
         } else if ($$0 == fuk.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.E() + 3;
      $$0.a(ghe::C, d, $$4, 64, 236, this.m() + 16);
      $$0.a(ghe::C, s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.W != null) {
         $$0.b(this.m.h, this.W, this.E() + 8, 35, -1);
      }

      if (!this.O.c()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.D()) / 2, -1);
      } else if (this.R == fuk.a.b) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.D()) / 2, -1);
      } else if (this.R == fuk.a.c) {
         $$0.a(this.m.h, D, this.n / 2, (72 + this.D()) / 2, -1);
      }

      this.V.k = this.R == fuk.a.c;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.P.aO_() && this.m.n.L.a($$0, $$1)) {
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

   private void a(fib $$0) {
      int $$1 = $$0.L().m().size();
      if (this.X != $$1) {
         String $$2 = "";
         gbl $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = xd.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = xd.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(gbi $$0) {
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
