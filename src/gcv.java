import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gcv extends fzq {
   private static final xg a = xg.c("options.title");
   private static final xg b = xg.c("options.skinCustomisation");
   private static final xg c = xg.c("options.sounds");
   private static final xg d = xg.c("options.video");
   private static final xg s = xg.c("options.controls");
   private static final xg u = xg.c("options.language");
   private static final xg v = xg.c("options.chat");
   private static final xg w = xg.c("options.resourcepack");
   private static final xg x = xg.c("options.accessibility");
   private static final xg y = xg.c("options.telemetry");
   private static final fvj z = fvj.a(xg.c("options.telemetry.disabled"));
   private static final xg A = xg.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fxm C = new fxm(this, 61, 33);
   private final fzq D;
   private final fqu E;
   @Nullable
   private fuf<buz> F;
   @Nullable
   private fuo G;

   public gcv(fzq $$0, fqu $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aO_() {
      fxq $$0 = this.C.a(fxq.d().a(8));
      $$0.a(new fvf(a, this.p), fxp::b);
      fxq $$1 = $$0.a(fxq.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fxl $$2 = new fxl();
      $$2.c().f(4).e(4).b();
      fxl.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gcx(this, this.E)));
      $$3.a(this.a(c, () -> new gcy(this, this.E)));
      $$3.a(this.a(d, () -> new gda(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new gdb(this, this.E)));
      $$3.a(this.a(u, () -> new gcs(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new gcq(this, this.E)));
      $$3.a(this.a(w, () -> new gdi(this.m.ad(), this::a, this.m.ag(), xg.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new gcp(this, this.E)));
      fty $$4 = $$3.a(this.a(y, () -> new gen(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fys(this)));
      this.C.c($$2);
      this.C.b(fty.a(xf.d, $$0x -> this.aL_()).a(200).a());
      this.C.a($$1x -> {
         ftw var10000 = this.c($$1x);
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

   private void a(auz $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fxo m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fuo(0, 0, $$0x -> this.m.a(new fyo(this::c, xg.c("difficulty.lock.title"), xg.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fxj $$0 = new fxj(150, 0, fxj.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fty.a(xg.c("options.online"), $$0x -> this.m.a(new gcu(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fuf<buz> a(int $$0, int $$1, String $$2, fqq $$3) {
      return fuf.a(buz::b).a(buz.values()).a($$3.s.an()).a($$0, $$1, 150, 20, xg.c($$2), ($$1x, $$2x) -> $$3.L().b(new ahe($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahy(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aF_() {
      this.E.az();
   }

   private fty a(xg $$0, Supplier<fzq> $$1) {
      return fty.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
