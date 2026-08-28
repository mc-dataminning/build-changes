import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxn extends fuk {
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
   private static final fqd z = fqd.a(wp.c("options.telemetry.disabled"));
   private static final wp A = wp.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fsg C = new fsg(this, 61, 33);
   private final fuk D;
   private final flm E;
   @Nullable
   private foz<bsg> F;
   @Nullable
   private fpi G;

   public fxn(fuk $$0, flm $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aR_() {
      fsk $$0 = this.C.a(fsk.d().a(8));
      $$0.a(new fpz(a, this.p), fsj::b);
      fsk $$1 = $$0.a(fsk.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fsf $$2 = new fsf();
      $$2.c().f(4).e(4).b();
      fsf.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fxp(this, this.E)));
      $$3.a(this.a(c, () -> new fxq(this, this.E)));
      $$3.a(this.a(d, () -> new fxs(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fxt(this, this.E)));
      $$3.a(this.a(u, () -> new fxk(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fxi(this, this.E)));
      $$3.a(this.a(w, () -> new fya(this.m.ad(), this::a, this.m.ag(), wp.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fxh(this, this.E)));
      fos $$4 = $$3.a(this.a(y, () -> new fzf(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new ftm(this)));
      this.C.c($$2);
      this.C.b(fos.a(wo.d, $$0x -> this.aO_()).a(200).a());
      this.C.a($$1x -> {
         fop var10000 = this.c($$1x);
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

   private fsi m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fpi(0, 0, $$0x -> this.m.a(new fti(this::c, wp.c("difficulty.lock.title"), wp.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fsd $$0 = new fsd(150, 0, fsd.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fos.a(wp.c("options.online"), $$0x -> this.m.a(new fxm(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static foz<bsg> a(int $$0, int $$1, String $$2, fli $$3) {
      return foz.a(bsg::b).a(bsg.values()).a($$3.s.am()).a($$0, $$1, 150, 20, wp.c($$2), ($$1x, $$2x) -> $$3.L().b(new agk($$2x)));
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

   private fos a(wp $$0, Supplier<fuk> $$1) {
      return fos.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
