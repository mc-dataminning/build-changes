import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fzk extends fwf {
   private static final wv a = wv.c("options.title");
   private static final wv b = wv.c("options.skinCustomisation");
   private static final wv c = wv.c("options.sounds");
   private static final wv d = wv.c("options.video");
   private static final wv s = wv.c("options.controls");
   private static final wv u = wv.c("options.language");
   private static final wv v = wv.c("options.chat");
   private static final wv w = wv.c("options.resourcepack");
   private static final wv x = wv.c("options.accessibility");
   private static final wv y = wv.c("options.telemetry");
   private static final fry z = fry.a(wv.c("options.telemetry.disabled"));
   private static final wv A = wv.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fub C = new fub(this, 61, 33);
   private final fwf D;
   private final fnh E;
   @Nullable
   private fqu<btn> F;
   @Nullable
   private frd G;

   public fzk(fwf $$0, fnh $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aN_() {
      fuf $$0 = this.C.a(fuf.d().a(8));
      $$0.a(new fru(a, this.p), fue::b);
      fuf $$1 = $$0.a(fuf.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fua $$2 = new fua();
      $$2.c().f(4).e(4).b();
      fua.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fzm(this, this.E)));
      $$3.a(this.a(c, () -> new fzn(this, this.E)));
      $$3.a(this.a(d, () -> new fzp(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fzq(this, this.E)));
      $$3.a(this.a(u, () -> new fzh(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fzf(this, this.E)));
      $$3.a(this.a(w, () -> new fzx(this.m.ad(), this::a, this.m.ag(), wv.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fze(this, this.E)));
      fqn $$4 = $$3.a(this.a(y, () -> new gbc(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fvh(this)));
      this.C.c($$2);
      this.C.b(fqn.a(wu.d, $$0x -> this.aK_()).a(200).a());
      this.C.a($$1x -> {
         fql var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void aK_() {
      this.m.a(this.D);
   }

   private void a(auk $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fud m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new frd(0, 0, $$0x -> this.m.a(new fvd(this::c, wv.c("difficulty.lock.title"), wv.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fty $$0 = new fty(150, 0, fty.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fqn.a(wv.c("options.online"), $$0x -> this.m.a(new fzj(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fqu<btn> a(int $$0, int $$1, String $$2, fnd $$3) {
      return fqu.a(btn::b).a(btn.values()).a($$3.s.an()).a($$0, $$1, 150, 20, wv.c($$2), ($$1x, $$2x) -> $$3.L().b(new agq($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahk(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aE_() {
      this.E.az();
   }

   private fqn a(wv $$0, Supplier<fwf> $$1) {
      return fqn.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
