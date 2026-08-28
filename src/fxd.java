import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxd extends fxi {
   private static final ale a = ale.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final ww v = ww.c("menu.returnToGame");
   private static final ww w = ww.c("gui.advancements");
   private static final ww x = ww.c("gui.stats");
   private static final ww y = ww.c("menu.sendFeedback");
   private static final ww z = ww.c("menu.reportBugs");
   private static final ww A = ww.c("menu.feedback");
   private static final ww B = ww.c("menu.server_links");
   private static final ww C = ww.c("menu.options");
   private static final ww D = ww.c("menu.shareToLan");
   private static final ww E = ww.c("menu.playerReporting");
   private static final ww F = ww.c("menu.returnToMenu");
   private static final ww G = ww.c("menu.savingLevel");
   private static final ww H = ww.c("menu.game");
   private static final ww I = ww.c("menu.paused");
   private final boolean J;
   @Nullable
   private frq K;

   public fxd(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aN_() {
      if (this.J) {
         this.E();
      }

      this.c(new fsx(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fvd $$0 = new fvd();
      $$0.c().a(4, 4, 4, 0);
      fvd.b $$1 = $$0.d(2);
      $$1.a(frq.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fxs(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fxm(this, this.m.t.l())));
      alw $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fxd.a(this)));
         $$1.a(this.a(B, () -> new gac(this, $$2)));
      }

      $$1.a(this.a(C, () -> new gan(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fxj(this)));
      } else {
         $$1.a(this.a(E, () -> new gcc(this)));
      }

      ww $$3 = this.m.T() ? F : wv.p;
      this.K = $$1.a(frq.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fvc.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fxi $$0, fvd.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayf.i : ayf.h));
      $$1.a(a($$0, z, ayf.j)).j = !ab.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      gjs $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fwt(G));
      } else {
         this.m.y();
      }

      fxk $$2 = new fxk();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fjb($$2));
      } else {
         this.m.a(new gaa($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gpn::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private frq a(ww $$0, Supplier<fxi> $$1) {
      return frq.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static frq a(fxi $$0, ww $$1, URI $$2) {
      return frq.a($$1, fwf.b($$0, $$2)).a(98).a();
   }

   static class a extends fxi {
      private static final ww b = ww.c("menu.feedback.title");
      public final fxi a;
      private final fve c = new fve(this);

      protected a(fxi $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         fvd $$0 = this.c.c(new fvd());
         $$0.c().a(4, 4, 4, 0);
         fvd.b $$1 = $$0.d(2);
         fxd.a(this, $$1);
         this.c.b(frq.a(wv.k, $$0x -> this.aK_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aK_() {
         this.m.a(this.a);
      }
   }
}
