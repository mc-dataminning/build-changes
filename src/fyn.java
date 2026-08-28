import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fyn extends fys {
   private static final alg a = alg.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final wy v = wy.c("menu.returnToGame");
   private static final wy w = wy.c("gui.advancements");
   private static final wy x = wy.c("gui.stats");
   private static final wy y = wy.c("menu.sendFeedback");
   private static final wy z = wy.c("menu.reportBugs");
   private static final wy A = wy.c("menu.feedback");
   private static final wy B = wy.c("menu.server_links");
   private static final wy C = wy.c("menu.options");
   private static final wy D = wy.c("menu.shareToLan");
   private static final wy E = wy.c("menu.playerReporting");
   private static final wy F = wy.c("menu.returnToMenu");
   private static final wy G = wy.c("menu.savingLevel");
   private static final wy H = wy.c("menu.game");
   private static final wy I = wy.c("menu.paused");
   private final boolean J;
   @Nullable
   private fta K;

   public fyn(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aO_() {
      if (this.J) {
         this.E();
      }

      this.c(new fuh(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fwn $$0 = new fwn();
      $$0.c().a(4, 4, 4, 0);
      fwn.b $$1 = $$0.d(2);
      $$1.a(fta.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fzc(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fyw(this, this.m.t.l())));
      aly $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fyn.a(this)));
         $$1.a(this.a(B, () -> new gbm(this, $$2)));
      }

      $$1.a(this.a(C, () -> new gbx(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fyt(this)));
      } else {
         $$1.a(this.a(E, () -> new gdm(this)));
      }

      wy $$3 = this.m.T() ? F : wx.p;
      this.K = $$1.a(fta.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fwm.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fys $$0, fwn.b $$1) {
      $$1.a(a($$0, y, ac.b().g() ? ayh.i : ayh.h));
      $$1.a(a($$0, z, ayh.j)).j = !ac.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      glf $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fyd(G));
      } else {
         this.m.y();
      }

      fyu $$2 = new fyu();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fko($$2));
      } else {
         this.m.a(new gbk($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(grc::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(fsm $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fta a(wy $$0, Supplier<fys> $$1) {
      return fta.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fta a(fys $$0, wy $$1, URI $$2) {
      return fta.a($$1, fxp.b($$0, $$2)).a(98).a();
   }

   static class a extends fys {
      private static final wy b = wy.c("menu.feedback.title");
      public final fys a;
      private final fwo c = new fwo(this);

      protected a(fys $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aO_() {
         this.c.a(b, this.p);
         fwn $$0 = this.c.c(new fwn());
         $$0.c().a(4, 4, 4, 0);
         fwn.b $$1 = $$0.d(2);
         fyn.a(this, $$1);
         this.c.b(fta.a(wx.k, $$0x -> this.aL_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aL_() {
         this.m.a(this.a);
      }
   }
}
