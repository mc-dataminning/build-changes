import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fuz extends frw {
   private static final xj a = xj.c("options.title");
   private static final xj b = xj.c("options.skinCustomisation");
   private static final xj c = xj.c("options.sounds");
   private static final xj d = xj.c("options.video");
   private static final xj s = xj.c("options.controls");
   private static final xj u = xj.c("options.language");
   private static final xj v = xj.c("options.chat");
   private static final xj w = xj.c("options.resourcepack");
   private static final xj x = xj.c("options.accessibility");
   private static final xj y = xj.c("options.telemetry");
   private static final fno z = fno.a(xj.c("options.telemetry.disabled"));
   private static final xj A = xj.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fps C = new fps(this, 61, 33);
   private final frw D;
   private final fki E;
   @Nullable
   private fmk<bsh> F;
   @Nullable
   private fmt G;

   public fuz(frw $$0, fki $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aR_() {
      fpw $$0 = this.C.a(fpw.d().a(8));
      $$0.a(new fnk(a, this.p), fpv::b);
      fpw $$1 = $$0.a(fpw.e()).a(8);
      $$1.a(this.E.aj().a(this.m.n));
      $$1.a(this.m());
      fpr $$2 = new fpr();
      $$2.c().f(4).e(4).b();
      fpr.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fvb(this, this.E)));
      $$3.a(this.a(c, () -> new fvc(this, this.E)));
      $$3.a(this.a(d, () -> new fve(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fvf(this, this.E)));
      $$3.a(this.a(u, () -> new fuw(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fuu(this, this.E)));
      $$3.a(this.a(w, () -> new fvm(this.m.ad(), this::a, this.m.ag(), xj.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fut(this, this.E)));
      fmd $$4 = $$3.a(this.a(y, () -> new fwr(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fqy(this)));
      this.C.c($$2);
      this.C.b(fmd.a(xi.d, $$0x -> this.aO_()).a(200).a());
      this.C.a($$1x -> {
         fmb var10000 = this.c($$1x);
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

   private void a(aun $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fpu m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.j().l()) {
            this.G = new fmt(0, 0, $$0x -> this.m.a(new fqu(this::c, xj.c("difficulty.lock.title"), xj.a("difficulty.lock.question", this.m.s.j().q().b()))));
            this.F.k(this.F.y() - this.G.y());
            this.G.b(this.m.s.j().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fpp $$0 = new fpp(150, 0, fpp.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fmd.a(xj.c("options.online"), $$0x -> this.m.a(new fuy(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fmk<bsh> a(int $$0, int $$1, String $$2, fke $$3) {
      return fmk.a(bsh::b).a(bsh.values()).a($$3.s.ak()).a($$0, $$1, 150, 20, xj.c($$2), ($$1x, $$2x) -> $$3.L().b(new aha($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahu(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void j() {
      this.E.ay();
   }

   private fmd a(xj $$0, Supplier<frw> $$1) {
      return fmd.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
