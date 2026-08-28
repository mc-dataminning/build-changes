import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fvd extends fvi {
   private static final aku a = aku.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final wp v = wp.c("menu.returnToGame");
   private static final wp w = wp.c("gui.advancements");
   private static final wp x = wp.c("gui.stats");
   private static final wp y = wp.c("menu.sendFeedback");
   private static final wp z = wp.c("menu.reportBugs");
   private static final wp A = wp.c("menu.feedback");
   private static final wp B = wp.c("menu.server_links");
   private static final wp C = wp.c("menu.options");
   private static final wp D = wp.c("menu.shareToLan");
   private static final wp E = wp.c("menu.playerReporting");
   private static final wp F = wp.c("menu.returnToMenu");
   private static final wp G = wp.c("menu.savingLevel");
   private static final wp H = wp.c("menu.game");
   private static final wp I = wp.c("menu.paused");
   private final boolean J;
   @Nullable
   private fpq K;

   public fvd(boolean $$0) {
      super($$0 ? H : I);
      this.J = $$0;
   }

   public boolean m() {
      return this.J;
   }

   @Override
   protected void aR_() {
      if (this.J) {
         this.E();
      }

      this.c(new fqx(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      ftd $$0 = new ftd();
      $$0.c().a(4, 4, 4, 0);
      ftd.b $$1 = $$0.d(2);
      $$1.a(fpq.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fvs(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fvm(this, this.m.t.l())));
      alm $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fvd.a(this)));
         $$1.a(this.a(B, () -> new fya(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fyl(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fvj(this)));
      } else {
         $$1.a(this.a(E, () -> new gaa(this)));
      }

      wp $$3 = this.m.T() ? F : wo.p;
      this.K = $$1.a(fpq.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      ftc.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fvi $$0, ftd.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? axv.i : axv.h));
      $$1.a(a($$0, z, axv.j)).j = !ab.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      ghn $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fut(G));
      } else {
         this.m.y();
      }

      fvk $$2 = new fvk();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fhc($$2));
      } else {
         this.m.a(new fxy($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gnh::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fpq a(wp $$0, Supplier<fvi> $$1) {
      return fpq.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fpq a(fvi $$0, wp $$1, URI $$2) {
      return fpq.a($$1, fuf.b($$0, $$2)).a(98).a();
   }

   static class a extends fvi {
      private static final wp b = wp.c("menu.feedback.title");
      public final fvi a;
      private final fte c = new fte(this);

      protected a(fvi $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aR_() {
         this.c.a(b, this.p);
         ftd $$0 = this.c.c(new ftd());
         $$0.c().a(4, 4, 4, 0);
         ftd.b $$1 = $$0.d(2);
         fvd.a(this, $$1);
         this.c.b(fpq.a(wo.k, $$0x -> this.aO_()).a(200).a());
         this.c.a(this::c);
         this.c();
      }

      @Override
      protected void c() {
         this.c.a();
      }

      @Override
      public void aO_() {
         this.m.a(this.a);
      }
   }
}
