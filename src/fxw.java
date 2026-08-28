import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxw extends fyb {
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
   private fsj K;

   public fxw(boolean $$0) {
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

      this.c(new ftq(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fvw $$0 = new fvw();
      $$0.c().a(4, 4, 4, 0);
      fvw.b $$1 = $$0.d(2);
      $$1.a(fsj.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fyl(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fyf(this, this.m.t.l())));
      aly $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fxw.a(this)));
         $$1.a(this.a(B, () -> new gav(this, $$2)));
      }

      $$1.a(this.a(C, () -> new gbg(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fyc(this)));
      } else {
         $$1.a(this.a(E, () -> new gcv(this)));
      }

      wy $$3 = this.m.T() ? F : wx.p;
      this.K = $$1.a(fsj.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fvv.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fyb $$0, fvw.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayh.i : ayh.h));
      $$1.a(a($$0, z, ayh.j)).j = !ab.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      gko $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fxm(G));
      } else {
         this.m.y();
      }

      fyd $$2 = new fyd();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fju($$2));
      } else {
         this.m.a(new gat($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(frv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gqk::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(frv $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fsj a(wy $$0, Supplier<fyb> $$1) {
      return fsj.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fsj a(fyb $$0, wy $$1, URI $$2) {
      return fsj.a($$1, fwy.b($$0, $$2)).a(98).a();
   }

   static class a extends fyb {
      private static final wy b = wy.c("menu.feedback.title");
      public final fyb a;
      private final fvx c = new fvx(this);

      protected a(fyb $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aO_() {
         this.c.a(b, this.p);
         fvw $$0 = this.c.c(new fvw());
         $$0.c().a(4, 4, 4, 0);
         fvw.b $$1 = $$0.d(2);
         fxw.a(this, $$1);
         this.c.b(fsj.a(wx.k, $$0x -> this.aL_()).a(200).a());
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
