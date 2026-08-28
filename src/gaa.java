import java.net.URI;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gaa extends gaf {
   private static final alk a = alk.b("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int s = 204;
   private static final int u = 98;
   private static final xc v = xc.c("menu.returnToGame");
   private static final xc w = xc.c("gui.advancements");
   private static final xc x = xc.c("gui.stats");
   private static final xc y = xc.c("menu.sendFeedback");
   private static final xc z = xc.c("menu.reportBugs");
   private static final xc A = xc.c("menu.feedback");
   private static final xc B = xc.c("menu.server_links");
   private static final xc C = xc.c("menu.options");
   private static final xc D = xc.c("menu.shareToLan");
   private static final xc E = xc.c("menu.playerReporting");
   private static final xc F = xc.c("menu.returnToMenu");
   private static final xc G = xc.c("menu.savingLevel");
   private static final xc H = xc.c("menu.game");
   private static final xc I = xc.c("menu.paused");
   private final boolean J;
   @Nullable
   private fun K;

   public gaa(boolean $$0) {
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

      this.c(new fvu(0, this.J ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fya $$0 = new fya();
      $$0.c().a(4, 4, 4, 0);
      fya.b $$1 = $$0.d(2);
      $$1.a(fun.a(v, $$0x -> {
         this.m.a(null);
         this.m.o.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(w, () -> new gap(this.m.t.j.p(), this)));
      $$1.a(this.a(x, () -> new gaj(this, this.m.t.l())));
      amc $$2 = this.m.t.j.E();
      if ($$2.a()) {
         a(this, $$1);
      } else {
         $$1.a(this.a(A, () -> new gaa.a(this)));
         $$1.a(this.a(B, () -> new gcz(this, $$2)));
      }

      $$1.a(this.a(C, () -> new gdk(this, this.m.n)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(D, () -> new gag(this)));
      } else {
         $$1.a(this.a(E, () -> new gez(this)));
      }

      xc $$3 = this.m.T() ? F : xb.p;
      this.K = $$1.a(fun.a($$3, $$0x -> {
         $$0x.j = false;
         this.m.ba().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fxz.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   static void a(gaf $$0, fya.b $$1) {
      $$1.a(a($$0, y, ac.b().g() ? ayl.i : ayl.h));
      $$1.a(a($$0, z, ayl.j)).j = !ac.b().d().a();
   }

   private void F() {
      boolean $$0 = this.m.T();
      gms $$1 = this.m.S();
      this.m.s.ad();
      if ($$0) {
         this.m.b(new fzq(G));
      } else {
         this.m.y();
      }

      gah $$2 = new gah();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fma($$2));
      } else {
         this.m.a(new gcx($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J && this.m != null && this.m.ba().c() && this.K != null) {
         $$0.a(gsn::H, a, this.K.F() + this.K.A() - 17, this.K.G() + 3, 15, 15);
      }
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      if (this.J) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fun a(xc $$0, Supplier<gaf> $$1) {
      return fun.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private static fun a(gaf $$0, xc $$1, URI $$2) {
      return fun.a($$1, fzc.b($$0, $$2)).a(98).a();
   }

   static class a extends gaf {
      private static final xc b = xc.c("menu.feedback.title");
      public final gaf a;
      private final fyb c = new fyb(this);

      protected a(gaf $$0) {
         super(b);
         this.a = $$0;
      }

      @Override
      protected void aS_() {
         this.c.a(b, this.p);
         fya $$0 = this.c.c(new fya());
         $$0.c().a(4, 4, 4, 0);
         fya.b $$1 = $$0.d(2);
         gaa.a(this, $$1);
         this.c.b(fun.a(xb.k, $$0x -> this.aP_()).a(200).a());
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
