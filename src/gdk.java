import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gdk extends gaf {
   private static final xc a = xc.c("options.title");
   private static final xc b = xc.c("options.skinCustomisation");
   private static final xc c = xc.c("options.sounds");
   private static final xc d = xc.c("options.video");
   private static final xc s = xc.c("options.controls");
   private static final xc u = xc.c("options.language");
   private static final xc v = xc.c("options.chat");
   private static final xc w = xc.c("options.resourcepack");
   private static final xc x = xc.c("options.accessibility");
   private static final xc y = xc.c("options.telemetry");
   private static final fvy z = fvy.a(xc.c("options.telemetry.disabled"));
   private static final xc A = xc.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fyb C = new fyb(this, 61, 33);
   private final gaf D;
   private final frj E;
   @Nullable
   private fuu<buq> F;
   @Nullable
   private fvd G;

   public gdk(gaf $$0, frj $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aS_() {
      fyf $$0 = this.C.a(fyf.d().a(8));
      $$0.a(new fvu(a, this.p), fye::b);
      fyf $$1 = $$0.a(fyf.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fya $$2 = new fya();
      $$2.c().f(4).e(4).b();
      fya.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gdm(this, this.E)));
      $$3.a(this.a(c, () -> new gdn(this, this.E)));
      $$3.a(this.a(d, () -> new gdp(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new gdq(this, this.E)));
      $$3.a(this.a(u, () -> new gdh(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new gdf(this, this.E)));
      $$3.a(this.a(w, () -> new gdx(this.m.ad(), this::a, this.m.ag(), xc.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new gde(this, this.E)));
      fun $$4 = $$3.a(this.a(y, () -> new gfc(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fzh(this)));
      this.C.c($$2);
      this.C.b(fun.a(xb.d, $$0x -> this.aP_()).a(200).a());
      this.C.a($$1x -> {
         ful var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.D);
   }

   private void a(aur $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fyd m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fvd(0, 0, $$0x -> this.m.a(new fzd(this::c, xc.c("difficulty.lock.title"), xc.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fxy $$0 = new fxy(150, 0, fxy.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fun.a(xc.c("options.online"), $$0x -> this.m.a(new gdj(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fuu<buq> a(int $$0, int $$1, String $$2, frf $$3) {
      return fuu.a(buq::b).a(buq.values()).a($$3.s.an()).a($$0, $$1, 150, 20, xc.c($$2), ($$1x, $$2x) -> $$3.L().b(new agx($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahr(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aJ_() {
      this.E.az();
   }

   private fun a(xc $$0, Supplier<gaf> $$1) {
      return fun.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
