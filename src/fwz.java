import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fwz extends ftw {
   private static final xv a = xv.c("options.title");
   private static final xv b = xv.c("options.skinCustomisation");
   private static final xv c = xv.c("options.sounds");
   private static final xv d = xv.c("options.video");
   private static final xv s = xv.c("options.controls");
   private static final xv u = xv.c("options.language");
   private static final xv v = xv.c("options.chat");
   private static final xv w = xv.c("options.resourcepack");
   private static final xv x = xv.c("options.accessibility");
   private static final xv y = xv.c("options.telemetry");
   private static final fpp z = fpp.a(xv.c("options.telemetry.disabled"));
   private static final xv A = xv.c("options.credits_and_attribution");
   private static final int B = 2;
   private final frs C = new frs(this, 61, 33);
   private final ftw D;
   private final fmi E;
   @Nullable
   private fok<btf> F;
   @Nullable
   private fou G;

   public fwz(ftw $$0, fmi $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aT_() {
      frw $$0 = this.C.a(frw.d().a(8));
      $$0.a(new fpl(a, this.p), frv::b);
      frw $$1 = $$0.a(frw.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.l());
      frr $$2 = new frr();
      $$2.c().f(4).e(4).b();
      frr.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fxb(this, this.E)));
      $$3.a(this.a(c, () -> new fxc(this, this.E)));
      $$3.a(this.a(d, () -> new fxe(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fxf(this, this.E)));
      $$3.a(this.a(u, () -> new fww(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fwu(this, this.E)));
      $$3.a(this.a(w, () -> new fxm(this.m.ad(), this::a, this.m.ag(), xv.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fwt(this, this.E)));
      fod $$4 = $$3.a(this.a(y, () -> new fyr(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fsy(this)));
      this.C.c($$2);
      this.C.b(fod.a(xu.d, $$0x -> this.aP_()).a(200).a());
      this.C.a($$1x -> {
         fob var10000 = this.c($$1x);
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

   private void a(avg $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fru l() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new fou(0, 0, $$0x -> this.m.a(new fsu(this::c, xv.c("difficulty.lock.title"), xv.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.i(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            frp $$0 = new frp(150, 0, frp.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fod.a(xv.c("options.online"), $$0x -> this.m.a(new fwy(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fok<btf> a(int $$0, int $$1, String $$2, fme $$3) {
      return fok.a(btf::b).a(btf.values()).a($$3.s.al()).a($$0, $$1, 150, 20, xv.c($$2), ($$1x, $$2x) -> $$3.L().b(new ahq($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new aik(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aJ_() {
      this.E.az();
   }

   private fod a(xv $$0, Supplier<ftw> $$1) {
      return fod.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
