import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxa extends ftx {
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
   private static final fpq z = fpq.a(xv.c("options.telemetry.disabled"));
   private static final xv A = xv.c("options.credits_and_attribution");
   private static final int B = 2;
   private final frt C = new frt(this, 61, 33);
   private final ftx D;
   private final fmj E;
   @Nullable
   private fol<btf> F;
   @Nullable
   private fov G;

   public fxa(ftx $$0, fmj $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aT_() {
      frx $$0 = this.C.a(frx.d().a(8));
      $$0.a(new fpm(a, this.p), frw::b);
      frx $$1 = $$0.a(frx.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.l());
      frs $$2 = new frs();
      $$2.c().f(4).e(4).b();
      frs.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fxc(this, this.E)));
      $$3.a(this.a(c, () -> new fxd(this, this.E)));
      $$3.a(this.a(d, () -> new fxf(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fxg(this, this.E)));
      $$3.a(this.a(u, () -> new fwx(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fwv(this, this.E)));
      $$3.a(this.a(w, () -> new fxn(this.m.ad(), this::a, this.m.ag(), xv.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fwu(this, this.E)));
      foe $$4 = $$3.a(this.a(y, () -> new fys(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fsz(this)));
      this.C.c($$2);
      this.C.b(foe.a(xu.d, $$0x -> this.aP_()).a(200).a());
      this.C.a($$1x -> {
         foc var10000 = this.c($$1x);
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

   private frv l() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new fov(0, 0, $$0x -> this.m.a(new fsv(this::c, xv.c("difficulty.lock.title"), xv.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.i(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            frq $$0 = new frq(150, 0, frq.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return foe.a(xv.c("options.online"), $$0x -> this.m.a(new fwz(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fol<btf> a(int $$0, int $$1, String $$2, fmf $$3) {
      return fol.a(btf::b).a(btf.values()).a($$3.s.al()).a($$0, $$1, 150, 20, xv.c($$2), ($$1x, $$2x) -> $$3.L().b(new ahq($$2x)));
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

   private foe a(xv $$0, Supplier<ftx> $$1) {
      return foe.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
