import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gdi extends gad {
   private static final xa a = xa.c("options.title");
   private static final xa b = xa.c("options.skinCustomisation");
   private static final xa c = xa.c("options.sounds");
   private static final xa d = xa.c("options.video");
   private static final xa s = xa.c("options.controls");
   private static final xa u = xa.c("options.language");
   private static final xa v = xa.c("options.chat");
   private static final xa w = xa.c("options.resourcepack");
   private static final xa x = xa.c("options.accessibility");
   private static final xa y = xa.c("options.telemetry");
   private static final fvw z = fvw.a(xa.c("options.telemetry.disabled"));
   private static final xa A = xa.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fxz C = new fxz(this, 61, 33);
   private final gad D;
   private final frh E;
   @Nullable
   private fus<buo> F;
   @Nullable
   private fvb G;

   public gdi(gad $$0, frh $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aS_() {
      fyd $$0 = this.C.a(fyd.d().a(8));
      $$0.a(new fvs(a, this.p), fyc::b);
      fyd $$1 = $$0.a(fyd.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fxy $$2 = new fxy();
      $$2.c().f(4).e(4).b();
      fxy.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gdk(this, this.E)));
      $$3.a(this.a(c, () -> new gdl(this, this.E)));
      $$3.a(this.a(d, () -> new gdn(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new gdo(this, this.E)));
      $$3.a(this.a(u, () -> new gdf(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new gdd(this, this.E)));
      $$3.a(this.a(w, () -> new gdv(this.m.ad(), this::a, this.m.ag(), xa.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new gdc(this, this.E)));
      ful $$4 = $$3.a(this.a(y, () -> new gfa(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fzf(this)));
      this.C.c($$2);
      this.C.b(ful.a(wz.d, $$0x -> this.aP_()).a(200).a());
      this.C.a($$1x -> {
         fuj var10000 = this.c($$1x);
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

   private void a(aup $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fyb m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new fvb(0, 0, $$0x -> this.m.a(new fzb(this::c, xa.c("difficulty.lock.title"), xa.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fxw $$0 = new fxw(150, 0, fxw.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return ful.a(xa.c("options.online"), $$0x -> this.m.a(new gdh(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fus<buo> a(int $$0, int $$1, String $$2, frd $$3) {
      return fus.a(buo::b).a(buo.values()).a($$3.s.an()).a($$0, $$1, 150, 20, xa.c($$2), ($$1x, $$2x) -> $$3.L().b(new agv($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahp(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aJ_() {
      this.E.az();
   }

   private ful a(xa $$0, Supplier<gad> $$1) {
      return ful.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
