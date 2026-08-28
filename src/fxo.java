import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxo extends ful {
   private static final wp a = wp.c("options.title");
   private static final wp b = wp.c("options.skinCustomisation");
   private static final wp c = wp.c("options.sounds");
   private static final wp d = wp.c("options.video");
   private static final wp s = wp.c("options.controls");
   private static final wp u = wp.c("options.language");
   private static final wp v = wp.c("options.chat");
   private static final wp w = wp.c("options.resourcepack");
   private static final wp x = wp.c("options.accessibility");
   private static final wp y = wp.c("options.telemetry");
   private static final fqe z = fqe.a(wp.c("options.telemetry.disabled"));
   private static final wp A = wp.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fsh C = new fsh(this, 61, 33);
   private final ful D;
   private final fln E;
   @Nullable
   private fpa<bsh> F;
   @Nullable
   private fpj G;

   public fxo(ful $$0, fln $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aR_() {
      fsl $$0 = this.C.a(fsl.d().a(8));
      $$0.a(new fqa(a, this.p), fsk::b);
      fsl $$1 = $$0.a(fsl.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fsg $$2 = new fsg();
      $$2.c().f(4).e(4).b();
      fsg.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fxq(this, this.E)));
      $$3.a(this.a(c, () -> new fxr(this, this.E)));
      $$3.a(this.a(d, () -> new fxt(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fxu(this, this.E)));
      $$3.a(this.a(u, () -> new fxl(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fxj(this, this.E)));
      $$3.a(this.a(w, () -> new fyb(this.m.ad(), this::a, this.m.ag(), wp.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fxi(this, this.E)));
      fot $$4 = $$3.a(this.a(y, () -> new fzg(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new ftn(this)));
      this.C.c($$2);
      this.C.b(fot.a(wo.d, $$0x -> this.aO_()).a(200).a());
      this.C.a($$1x -> {
         foq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.C.a();
   }

   @Override
   public void aO_() {
      this.m.a(this.D);
   }

   private void a(aua $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fsj m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fpj(0, 0, $$0x -> this.m.a(new ftj(this::c, wp.c("difficulty.lock.title"), wp.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fse $$0 = new fse(150, 0, fse.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fot.a(wp.c("options.online"), $$0x -> this.m.a(new fxn(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fpa<bsh> a(int $$0, int $$1, String $$2, flj $$3) {
      return fpa.a(bsh::b).a(bsh.values()).a($$3.s.am()).a($$0, $$1, 150, 20, wp.c($$2), ($$1x, $$2x) -> $$3.L().b(new agk($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahe(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aI_() {
      this.E.az();
   }

   private fot a(wp $$0, Supplier<ful> $$1) {
      return fot.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
