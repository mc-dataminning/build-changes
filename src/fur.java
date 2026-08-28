import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fur extends frp {
   private static final xl a = xl.c("options.title");
   private static final xl b = xl.c("options.skinCustomisation");
   private static final xl c = xl.c("options.sounds");
   private static final xl d = xl.c("options.video");
   private static final xl s = xl.c("options.controls");
   private static final xl u = xl.c("options.language");
   private static final xl v = xl.c("options.chat");
   private static final xl w = xl.c("options.resourcepack");
   private static final xl x = xl.c("options.accessibility");
   private static final xl y = xl.c("options.telemetry");
   private static final fnh z = fnh.a(xl.c("options.telemetry.disabled"));
   private static final xl A = xl.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fpl C = new fpl(this, 61, 33);
   private final frp D;
   private final fkb E;
   @Nullable
   private fmd<bse> F;
   @Nullable
   private fmm G;

   public fur(frp $$0, fkb $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aS_() {
      fpp $$0 = this.C.a(fpp.d().a(8));
      $$0.a(new fnd(a, this.p), fpo::b);
      fpp $$1 = $$0.a(fpp.e()).a(8);
      $$1.a(this.E.aj().a(this.m.n));
      $$1.a(this.m());
      fpk $$2 = new fpk();
      $$2.c().f(4).e(4).b();
      fpk.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fut(this, this.E)));
      $$3.a(this.a(c, () -> new fuu(this, this.E)));
      $$3.a(this.a(d, () -> new fuw(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fux(this, this.E)));
      $$3.a(this.a(u, () -> new fuo(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fum(this, this.E)));
      $$3.a(this.a(w, () -> new fve(this.m.ad(), this::a, this.m.ag(), xl.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new ful(this, this.E)));
      flw $$4 = $$3.a(this.a(y, () -> new fwj(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fqr(this)));
      this.C.c($$2);
      this.C.b(flw.a(xk.d, $$0x -> this.aP_()).a(200).a());
      this.C.a($$1x -> {
         flu var10000 = this.c($$1x);
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

   private void a(auo $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fpn m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new fmm(0, 0, $$0x -> this.m.a(new fqn(this::c, xl.c("difficulty.lock.title"), xl.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fpi $$0 = new fpi(150, 0, fpi.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return flw.a(xl.c("options.online"), $$0x -> this.m.a(new fuq(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fmd<bse> a(int $$0, int $$1, String $$2, fjx $$3) {
      return fmd.a(bse::b).a(bse.values()).a($$3.s.ak()).a($$0, $$1, 150, 20, xl.c($$2), ($$1x, $$2x) -> $$3.L().b(new ahc($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahw(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void j() {
      this.E.ay();
   }

   private flw a(xl $$0, Supplier<frp> $$1) {
      return flw.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
