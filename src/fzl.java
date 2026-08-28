import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzl extends fzq {
   private static final alr a = alr.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xg v = xg.c("menu.returnToGame");
   private static final xg w = xg.c("gui.advancements");
   private static final xg x = xg.c("gui.stats");
   private static final xg y = xg.c("menu.sendFeedback");
   private static final xg z = xg.c("menu.reportBugs");
   private static final xg A = xg.c("menu.feedback");
   private static final xg B = xg.c("menu.server_links");
   private static final xg C = xg.c("menu.options");
   private static final xg D = xg.c("menu.shareToLan");
   private static final xg E = xg.c("menu.playerReporting");
   private static final xg F = xg.c("menu.returnToMenu");
   private static final xg G = xg.c("menu.savingLevel");
   private static final xg H = xg.c("menu.game");
   private static final xg I = xg.c("menu.paused");
   private final boolean J;
   @Nullable
   private fty K;

   public fzl(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aT_() {
      if (this.J) {
         this.E();
      }

      this.c(new fvf(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fxl $$0 = new fxl();
      $$0.c().a(4, 4, 4, 0);
      fxl.b $$1 = $$0.d(2);
      $$1.a(fty.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new gaa(this.m.t.j.o(), this)));
      $$1.a(this.a(x, () -> new fzu(this, this.m.t.l())));
      amj $$2 = this.m.t.j.D();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fzl.a(this)));
         $$1.a(this.a(B, () -> new gck(this, $$2)));
      }

      $$1.a(this.a(C, () -> new gcv(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fzr(this)));
      } else {
         $$1.a(this.a(E, () -> new gek(this)));
      }

      xg $$3 = this.m.T() ? F : xf.p;
      this.K = $$1.a(fty.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fxk.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fzq $$0, fxl.b $$1) {
      $$1.a(a($$0, y, ac.b().g() ? ayt.i : ayt.h));
      $$1.a(a($$0, z, ayt.j)).j = !ac.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      gmd $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fzb(G));
      } else {
         this.m.y();
      }

      fzs $$2 = new fzs();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fll($$2));
      } else {
         this.m.a(new gci($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gry::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fty a(xg $$0, Supplier<fzq> $$1) {
      return fty.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fty a(fzq $$0, xg $$1, URI $$2) {
      return fty.a($$1, fyn.b($$0, $$2)).a(98).a();
   }

   static class a extends fzq {
      private static final xg b = xg.c("menu.feedback.title");
      public final fzq a;
      private final fxm c = new fxm(this);

      protected a(fzq $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aT_() {
         this.c.a(b, this.p);
         fxl $$0 = this.c.c(new fxl());
         $$0.c().a(4, 4, 4, 0);
         fxl.b $$1 = $$0.d(2);
         fzl.a(this, $$1);
         this.c.b(fty.a(xf.k, $$0x -> this.aQ_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aQ_() {
         this.m.a(this.a);
      }
   }
}
