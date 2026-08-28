import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fwa extends fwf {
   private static final ald a = ald.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final wv v = wv.c("menu.returnToGame");
   private static final wv w = wv.c("gui.advancements");
   private static final wv x = wv.c("gui.stats");
   private static final wv y = wv.c("menu.sendFeedback");
   private static final wv z = wv.c("menu.reportBugs");
   private static final wv A = wv.c("menu.feedback");
   private static final wv B = wv.c("menu.server_links");
   private static final wv C = wv.c("menu.options");
   private static final wv D = wv.c("menu.shareToLan");
   private static final wv E = wv.c("menu.playerReporting");
   private static final wv F = wv.c("menu.returnToMenu");
   private static final wv G = wv.c("menu.savingLevel");
   private static final wv H = wv.c("menu.game");
   private static final wv I = wv.c("menu.paused");
   private final boolean J;
   @Nullable
   private fqn K;

   public fwa(boolean $$0) {
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

      this.c(new fru(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fua $$0 = new fua();
      $$0.c().a(4, 4, 4, 0);
      fua.b $$1 = $$0.d(2);
      $$1.a(fqn.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new fwp(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new fwj(this, this.m.t.l())));
      alv $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new fwa.a(this)));
         $$1.a(this.a(B, () -> new fyz(this, $$2)));
      }

      $$1.a(this.a(C, () -> new fzk(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new fwg(this)));
      } else {
         $$1.a(this.a(E, () -> new gaz(this)));
      }

      wv $$3 = this.m.T() ? F : wu.p;
      this.K = $$1.a(fqn.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      ftz.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(fwf $$0, fua.b $$1) {
      $$1.a(a($$0, y, ab.b().g() ? ayf.i : ayf.h));
      $$1.a(a($$0, z, ayf.j)).j = !ab.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      gio $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fvq(G));
      } else {
         this.m.y();
      }

      fwh $$2 = new fwh();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fhz($$2));
      } else {
         this.m.a(new fyx($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(goi::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fqn a(wv $$0, Supplier<fwf> $$1) {
      return fqn.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fqn a(fwf $$0, wv $$1, URI $$2) {
      return fqn.a($$1, fvc.b($$0, $$2)).a(98).a();
   }

   static class a extends fwf {
      private static final wv b = wv.c("menu.feedback.title");
      public final fwf a;
      private final fub c = new fub(this);

      protected a(fwf $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aN_() {
         this.c.a(b, this.p);
         fua $$0 = this.c.c(new fua());
         $$0.c().a(4, 4, 4, 0);
         fua.b $$1 = $$0.d(2);
         fwa.a(this, $$1);
         this.c.b(fqn.a(wu.k, $$0x -> this.aK_()).a(200).a());
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
