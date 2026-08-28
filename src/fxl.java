import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fxl extends fui {
   private static final wo a = wo.c("options.title");
   private static final wo b = wo.c("options.skinCustomisation");
   private static final wo c = wo.c("options.sounds");
   private static final wo d = wo.c("options.video");
   private static final wo s = wo.c("options.controls");
   private static final wo u = wo.c("options.language");
   private static final wo v = wo.c("options.chat");
   private static final wo w = wo.c("options.resourcepack");
   private static final wo x = wo.c("options.accessibility");
   private static final wo y = wo.c("options.telemetry");
   private static final fqb z = fqb.a(wo.c("options.telemetry.disabled"));
   private static final wo A = wo.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fse C = new fse(this, 61, 33);
   private final fui D;
   private final fll E;
   @Nullable
   private fox<bsf> F;
   @Nullable
   private fpg G;

   public fxl(fui $$0, fll $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aR_() {
      fsi $$0 = this.C.a(fsi.d().a(8));
      $$0.a(new fpx(a, this.p), fsh::b);
      fsi $$1 = $$0.a(fsi.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fsd $$2 = new fsd();
      $$2.c().f(4).e(4).b();
      fsd.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fxn(this, this.E)));
      $$3.a(this.a(c, () -> new fxo(this, this.E)));
      $$3.a(this.a(d, () -> new fxq(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fxr(this, this.E)));
      $$3.a(this.a(u, () -> new fxi(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fxg(this, this.E)));
      $$3.a(this.a(w, () -> new fxy(this.m.ad(), this::a, this.m.ag(), wo.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fxf(this, this.E)));
      fop $$4 = $$3.a(this.a(y, () -> new fzd(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new ftk(this)));
      this.C.c($$2);
      this.C.b(fop.a(wn.d, $$0x -> this.aO_()).a(200).a());
      this.C.a($$1x -> {
         fon var10000 = this.c($$1x);
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

   private void a(atz $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fsg m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fpg(0, 0, $$0x -> this.m.a(new ftg(this::c, wo.c("difficulty.lock.title"), wo.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fsb $$0 = new fsb(150, 0, fsb.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fop.a(wo.c("options.online"), $$0x -> this.m.a(new fxk(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fox<bsf> a(int $$0, int $$1, String $$2, flh $$3) {
      return fox.a(bsf::b).a(bsf.values()).a($$3.s.am()).a($$0, $$1, 150, 20, wo.c($$2), ($$1x, $$2x) -> $$3.L().b(new agj($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahd(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aI_() {
      this.E.az();
   }

   private fop a(wo $$0, Supplier<fui> $$1) {
      return fop.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
