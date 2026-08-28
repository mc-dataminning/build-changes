import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gbs extends fyn {
   private static final wy a = wy.c("options.title");
   private static final wy b = wy.c("options.skinCustomisation");
   private static final wy c = wy.c("options.sounds");
   private static final wy d = wy.c("options.video");
   private static final wy s = wy.c("options.controls");
   private static final wy u = wy.c("options.language");
   private static final wy v = wy.c("options.chat");
   private static final wy w = wy.c("options.resourcepack");
   private static final wy x = wy.c("options.accessibility");
   private static final wy y = wy.c("options.telemetry");
   private static final fug z = fug.a(wy.c("options.telemetry.disabled"));
   private static final wy A = wy.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fwj C = new fwj(this, 61, 33);
   private final fyn D;
   private final fps E;
   @Nullable
   private ftc<bud> F;
   @Nullable
   private ftl G;

   public gbs(fyn $$0, fps $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aO_() {
      fwn $$0 = this.C.a(fwn.d().a(8));
      $$0.a(new fuc(a, this.p), fwm::b);
      fwn $$1 = $$0.a(fwn.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fwi $$2 = new fwi();
      $$2.c().f(4).e(4).b();
      fwi.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gbu(this, this.E)));
      $$3.a(this.a(c, () -> new gbv(this, this.E)));
      $$3.a(this.a(d, () -> new gbx(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new gby(this, this.E)));
      $$3.a(this.a(u, () -> new gbp(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new gbn(this, this.E)));
      $$3.a(this.a(w, () -> new gcf(this.m.ad(), this::a, this.m.ag(), wy.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new gbm(this, this.E)));
      fsv $$4 = $$3.a(this.a(y, () -> new gdk(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fxp(this)));
      this.C.c($$2);
      this.C.b(fsv.a(wx.d, $$0x -> this.aL_()).a(200).a());
      this.C.a($$1x -> {
         fst var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void aL_() {
      this.m.a(this.D);
   }

   private void a(aun $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fwl m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new ftl(0, 0, $$0x -> this.m.a(new fxl(this::c, wy.c("difficulty.lock.title"), wy.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fwg $$0 = new fwg(150, 0, fwg.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fsv.a(wy.c("options.online"), $$0x -> this.m.a(new gbr(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static ftc<bud> a(int $$0, int $$1, String $$2, fpo $$3) {
      return ftc.a(bud::b).a(bud.values()).a($$3.s.an()).a($$0, $$1, 150, 20, wy.c($$2), ($$1x, $$2x) -> $$3.L().b(new agt($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahn(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aF_() {
      this.E.az();
   }

   private fsv a(wy $$0, Supplier<fyn> $$1) {
      return fsv.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
