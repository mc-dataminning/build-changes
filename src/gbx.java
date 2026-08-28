import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gbx extends fys {
   private static final wy a = wy.c("options.title");
   private static final wy b = wy.c("options.skinCustomisation");
   private static final wy c = wy.c("options.sounds");
   private static final wy d = wy.c("options.video");
   private static final wy s = wy.c("options.controls");
   private static final wy u = wy.c("options.language");
   private static final wy v = wy.c("options.chat");
   private static final wy w = wy.c("options.resourcepack");
   private static final wy x = wy.c("options.accessibility");
   private static final wy y = wy.c("options.telemetry");
   private static final ful z = ful.a(wy.c("options.telemetry.disabled"));
   private static final wy A = wy.c("options.credits_and_attribution");
   private static final int B = 2;
   private final fwo C = new fwo(this, 61, 33);
   private final fys D;
   private final fpx E;
   @Nullable
   private fth<bud> F;
   @Nullable
   private ftq G;

   public gbx(fys $$0, fpx $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aO_() {
      fws $$0 = this.C.a(fws.d().a(8));
      $$0.a(new fuh(a, this.p), fwr::b);
      fws $$1 = $$0.a(fws.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.m());
      fwn $$2 = new fwn();
      $$2.c().f(4).e(4).b();
      fwn.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new gbz(this, this.E)));
      $$3.a(this.a(c, () -> new gca(this, this.E)));
      $$3.a(this.a(d, () -> new gcc(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new gcd(this, this.E)));
      $$3.a(this.a(u, () -> new gbu(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new gbs(this, this.E)));
      $$3.a(this.a(w, () -> new gck(this.m.ad(), this::a, this.m.ag(), wy.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new gbr(this, this.E)));
      fta $$4 = $$3.a(this.a(y, () -> new gdp(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fxu(this)));
      this.C.c($$2);
      this.C.b(fta.a(wx.d, $$0x -> this.aL_()).a(200).a());
      this.C.a($$1x -> {
         fsy var10000 = this.c($$1x);
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

   private void a(aun $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private fwq m() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new ftq(0, 0, $$0x -> this.m.a(new fxq(this::c, wy.c("difficulty.lock.title"), wy.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.h(this.F.A() - this.G.A());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            fwl $$0 = new fwl(150, 0, fwl.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fta.a(wy.c("options.online"), $$0x -> this.m.a(new gbw(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fth<bud> a(int $$0, int $$1, String $$2, fpt $$3) {
      return fth.a(bud::b).a(bud.values()).a($$3.s.an()).a($$0, $$1, 150, 20, wy.c($$2), ($$1x, $$2x) -> $$3.L().b(new agt($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahn(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aF_() {
      this.E.az();
   }

   private fta a(wy $$0, Supplier<fys> $$1) {
      return fta.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
