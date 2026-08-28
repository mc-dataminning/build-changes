import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gaz extends fxu {
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
   private static final ftn z = ftn.a(wy.c("options.telemetry.disabled"));
   private static final wy A = wy.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fvq C = new fvq(this, 61, 33);
   private final fxu D;
   private final fow E;
   @Nullable
   private fsj<bty> F;
   @Nullable
   private fss G;

   public gaz(fxu $$0, fow $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aN_() {
      fvu $$0 = this.C.a(fvu.d().a(8));
      $$0.a(new ftj(a, this.p), fvt::b);
      fvu $$1 = $$0.a(fvu.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fvp $$2 = new fvp();
      $$2.c().f(4).e(4).b();
      fvp.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gbb(this, this.E)));
      $$3.a(this.a(c, () -> new gbc(this, this.E)));
      $$3.a(this.a(d, () -> new gbe(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new gbf(this, this.E)));
      $$3.a(this.a(u, () -> new gaw(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new gau(this, this.E)));
      $$3.a(this.a(w, () -> new gbm(this.m.ad(), this::a, this.m.ag(), wy.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new gat(this, this.E)));
      fsc $$4 = $$3.a(this.a(y, () -> new gcr(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fww(this)));
      this.C.c($$2);
      this.C.b(fsc.a(wx.d, $$0x -> this.aK_()).a(200).a());
      this.C.a($$1x -> {
         fsa var10000 = this.c($$1x);
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

   private void a(aun $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fvs m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fss(0, 0, $$0x -> this.m.a(new fws(this::c, wy.c("difficulty.lock.title"), wy.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fvn $$0 = new fvn(150, 0, fvn.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fsc.a(wy.c("options.online"), $$0x -> this.m.a(new gay(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fsj<bty> a(int $$0, int $$1, String $$2, fos $$3) {
      return fsj.a(bty::b).a(bty.values()).a($$3.s.an()).a($$0, $$1, 150, 20, wy.c($$2), ($$1x, $$2x) -> $$3.L().b(new agt($$2x)));
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
   public void aE_() {
      this.E.az();
   }

   private fsc a(wy $$0, Supplier<fxu> $$1) {
      return fsc.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
