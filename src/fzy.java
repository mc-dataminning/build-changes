import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzy extends gad {
   private static final ali a = ali.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xa v = xa.c("menu.returnToGame");
   private static final xa w = xa.c("gui.advancements");
   private static final xa x = xa.c("gui.stats");
   private static final xa y = xa.c("menu.sendFeedback");
   private static final xa z = xa.c("menu.reportBugs");
   private static final xa A = xa.c("menu.feedback");
   private static final xa B = xa.c("menu.server_links");
   private static final xa C = xa.c("menu.options");
   private static final xa D = xa.c("menu.shareToLan");
   private static final xa E = xa.c("menu.playerReporting");
   private static final xa F = xa.c("menu.returnToMenu");
   private static final xa G = xa.c("menu.savingLevel");
   private static final xa H = xa.c("menu.game");
   private static final xa I = xa.c("menu.paused");
   private final boolean J;
   @Nullable
   private ful K;

   public fzy(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aS_() {
      if (this.J) {
         this.E();
      }

      this.c(new fvs(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fxy $$0 = new fxy();
      $$0.c().a(4, 4, 4, 0);
      fxy.b $$1 = $$0.d(2);
      $$1.a(ful.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new gan(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new gah(this, this.m.t.l())));
      ama $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fzy.a(this)));
         $$1.a(this.a(B, () -> new gcx(this, $$2)));
      }

      $$1.a(this.a(C, () -> new gdi(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new gae(this)));
      } else {
         $$1.a(this.a(E, () -> new gex(this)));
      }

      xa $$3 = this.m.T() ? F : wz.p;
      this.K = $$1.a(ful.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fxx.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(gad $$0, fxy.b $$1) {
      $$1.a(a($$0, y, ac.b().g() ? ayj.i : ayj.h));
      $$1.a(a($$0, z, ayj.j)).j = !ac.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      gmq $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fzo(G));
      } else {
         this.m.y();
      }

      gaf $$2 = new gaf();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fly($$2));
      } else {
         this.m.a(new gcv($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gsl::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private ful a(xa $$0, Supplier<gad> $$1) {
      return ful.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static ful a(gad $$0, xa $$1, URI $$2) {
      return ful.a($$1, fza.b($$0, $$2)).a(98).a();
   }

   static class a extends gad {
      private static final xa b = xa.c("menu.feedback.title");
      public final gad a;
      private final fxz c = new fxz(this);

      protected a(gad $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         fxy $$0 = this.c.c(new fxy());
         $$0.c().a(4, 4, 4, 0);
         fxy.b $$1 = $$0.d(2);
         fzy.a(this, $$1);
         this.c.b(ful.a(wz.k, $$0x -> this.aP_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aP_() {
         this.m.a(this.a);
      }
   }
}
