import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gan extends fxi {
   private static final ww a = ww.c("options.title");
   private static final ww b = ww.c("options.skinCustomisation");
   private static final ww c = ww.c("options.sounds");
   private static final ww d = ww.c("options.video");
   private static final ww s = ww.c("options.controls");
   private static final ww u = ww.c("options.language");
   private static final ww v = ww.c("options.chat");
   private static final ww w = ww.c("options.resourcepack");
   private static final ww x = ww.c("options.accessibility");
   private static final ww y = ww.c("options.telemetry");
   private static final ftb z = ftb.a(ww.c("options.telemetry.disabled"));
   private static final ww A = ww.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fve C = new fve(this, 61, 33);
   private final fxi D;
   private final foj E;
   @Nullable
   private frx<btv> F;
   @Nullable
   private fsg G;

   public gan(fxi $$0, foj $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aN_() {
      fvi $$0 = this.C.a(fvi.d().a(8));
      $$0.a(new fsx(a, this.p), fvh::b);
      fvi $$1 = $$0.a(fvi.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fvd $$2 = new fvd();
      $$2.c().f(4).e(4).b();
      fvd.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gap(this, this.E)));
      $$3.a(this.a(c, () -> new gaq(this, this.E)));
      $$3.a(this.a(d, () -> new gas(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new gat(this, this.E)));
      $$3.a(this.a(u, () -> new gak(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new gai(this, this.E)));
      $$3.a(this.a(w, () -> new gba(this.m.ad(), this::a, this.m.ag(), ww.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new gah(this, this.E)));
      frq $$4 = $$3.a(this.a(y, () -> new gcf(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fwk(this)));
      this.C.c($$2);
      this.C.b(frq.a(wv.d, $$0x -> this.aK_()).a(200).a());
      this.C.a($$1x -> {
         fro var10000 = this.c($$1x);
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

   private void a(aul $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fvg m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fsg(0, 0, $$0x -> this.m.a(new fwg(this::c, ww.c("difficulty.lock.title"), ww.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fvb $$0 = new fvb(150, 0, fvb.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return frq.a(ww.c("options.online"), $$0x -> this.m.a(new gam(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static frx<btv> a(int $$0, int $$1, String $$2, fof $$3) {
      return frx.a(btv::b).a(btv.values()).a($$3.s.an()).a($$0, $$1, 150, 20, ww.c($$2), ($$1x, $$2x) -> $$3.L().b(new agr($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahl(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aE_() {
      this.E.az();
   }

   private frq a(ww $$0, Supplier<fxi> $$1) {
      return frq.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
