import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fze extends fum {
   private static final wp c = wp.c("gui.socialInteractions.title");
   private static final akv d = akv.b("social_interactions/background");
   private static final akv s = akv.b("icon/search");
   private static final wp u = wp.c("gui.socialInteractions.tab_all");
   private static final wp v = wp.c("gui.socialInteractions.tab_hidden");
   private static final wp w = wp.c("gui.socialInteractions.tab_blocked");
   private static final wp x = u.e().a(n.t);
   private static final wp y = v.e().a(n.t);
   private static final wp z = w.e().a(n.t);
   private static final wp A = wp.c("gui.socialInteractions.search_hint").a(n.u).a(n.h);
   static final wp B = wp.c("gui.socialInteractions.search_empty").a(n.h);
   private static final wp C = wp.c("gui.socialInteractions.empty_hidden").a(n.h);
   private static final wp D = wp.c("gui.socialInteractions.empty_blocked").a(n.h);
   private static final wp E = wp.c("gui.socialInteractions.blocking_hint");
   private static final int F = 8;
   private static final int G = 236;
   private static final int H = 16;
   private static final int I = 64;
   public static final int a = 72;
   public static final int b = 88;
   private static final int J = 238;
   private static final int K = 20;
   private static final int L = 36;
   private final fsi M = new fsi(this);
   @Nullable
   private final fum N;
   fzd O;
   fpd P;
   private String Q = "";
   private fze.a R = fze.a.a;
   private fou S;
   private fou T;
   private fou U;
   private fou V;
   @Nullable
   private wp W;
   private int X;

   public fze() {
      this(null);
   }

   public fze(@Nullable fum $$0) {
      super(c);
      this.N = $$0;
      this.a(flk.Q());
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
   public wp i() {
      return (wp)(this.W != null ? wo.a(super.i(), this.W) : super.i());
   }

   @Override
   protected void aR_() {
      this.M.a(c, this.p);
      this.O = new fzd(this, this.m, this.n, this.E() - 88, 88, 36);
      int $$0 = this.O.a() / 3;
      int $$1 = this.O.u();
      int $$2 = this.O.v();
      this.S = this.c(fou.a(u, $$0x -> this.a(fze.a.a)).a($$1, 45, $$0, 20).a());
      this.T = this.c(fou.a(v, $$0x -> this.a(fze.a.b)).a(($$1 + $$2 - $$0) / 2 + 1, 45, $$0, 20).a());
      this.U = this.c(fou.a(w, $$0x -> this.a(fze.a.c)).a($$2 - $$0 + 1, 45, $$0, 20).a());
      String $$3 = this.P != null ? this.P.a() : "";
      this.P = new fpd(this.p, this.F() + 28, 74, 200, 15, A) {
         @Override
         protected xd d() {
            return !fze.this.P.a().isEmpty() && fze.this.O.b() ? super.d().f(", ").b(fze.B) : super.d();
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
      this.V = this.c(fou.a(E, ftj.b(this, axv.o)).a(this.n / 2 - 100, 64 + this.m(), 200, 20).a());
      this.a(this.R);
      this.M.b(fou.a(wo.d, $$0x -> this.aO_()).a(200).a());
      this.M.a($$1x -> {
         fos var10000 = this.c($$1x);
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

   private void a(fze.a $$0) {
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
            fzc $$4 = this.m.aN();
            Set<UUID> $$5 = this.m.t.j.n().stream().filter($$4::e).collect(Collectors.toSet());
            $$1 = $$5.isEmpty();
            this.O.a($$5, this.O.g(), false);
      }

      flb $$6 = this.m.aY();
      if (!this.P.a().isEmpty() && this.O.b() && !this.P.aM_()) {
         $$6.c(B);
      } else if ($$1) {
         if ($$0 == fze.a.b) {
            $$6.c(C);
         } else if ($$0 == fze.a.c) {
            $$6.c(D);
         }
      }
   }

   @Override
   public void b(fof $$0, int $$1, int $$2, float $$3) {
      super.b($$0, $$1, $$2, $$3);
      int $$4 = this.F() + 3;
      $$0.a(gmj::H, d, $$4, 64, 236, this.m() + 16);
      $$0.a(gmj::H, s, $$4 + 10, 76, 12, 12);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a(this.m);
      if (this.W != null) {
         $$0.b(this.m.h, this.W, this.F() + 8, 35, -1);
      }

      if (!this.O.b()) {
         this.O.a($$0, $$1, $$2, $$3);
      } else if (!this.P.a().isEmpty()) {
         $$0.a(this.m.h, B, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == fze.a.b) {
         $$0.a(this.m.h, C, this.n / 2, (72 + this.E()) / 2, -1);
      } else if (this.R == fze.a.c) {
         $$0.a(this.m.h, D, this.n / 2, (72 + this.E()) / 2, -1);
      }

      this.V.k = this.R == fze.a.c;
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

   private void a(flk $$0) {
      int $$1 = $$0.L().m().size();
      if (this.X != $$1) {
         String $$2 = "";
         ggp $$3 = $$0.S();
         if ($$0.T()) {
            $$2 = $$0.V().ae();
         } else if ($$3 != null) {
            $$2 = $$3.a;
         }

         if ($$1 > 1) {
            this.W = wp.a("gui.socialInteractions.server_label.multiple", $$2, $$1);
         } else {
            this.W = wp.a("gui.socialInteractions.server_label.single", $$2, $$1);
         }

         this.X = $$1;
      }
   }

   public void a(ggm $$0) {
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
