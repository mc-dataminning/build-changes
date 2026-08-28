import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fwu extends ftr {
   private static final xk a = xk.c("options.title");
   private static final xk b = xk.c("options.skinCustomisation");
   private static final xk c = xk.c("options.sounds");
   private static final xk d = xk.c("options.video");
   private static final xk s = xk.c("options.controls");
   private static final xk u = xk.c("options.language");
   private static final xk v = xk.c("options.chat");
   private static final xk w = xk.c("options.resourcepack");
   private static final xk x = xk.c("options.accessibility");
   private static final xk y = xk.c("options.telemetry");
   private static final fpk z = fpk.a(xk.c("options.telemetry.disabled"));
   private static final xk A = xk.c("options.credits_and_attribution");
   private static final int B = 2;
   private final frn C = new frn(this, 61, 33);
   private final ftr D;
   private final fmd E;
   @Nullable
   private fof<bsx> F;
   @Nullable
   private foo G;

   public fwu(ftr $$0, fmd $$1) {
      super(a);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   protected void aT_() {
      frr $$0 = this.C.a(frr.d().a(8));
      $$0.a(new fpg(a, this.p), frq::b);
      frr $$1 = $$0.a(frr.e()).a(8);
      $$1.a(this.E.ak().a(this.m.n));
      $$1.a(this.l());
      frm $$2 = new frm();
      $$2.c().f(4).e(4).b();
      frm.b $$3 = $$2.d(2);
      $$3.a(this.a(b, () -> new fww(this, this.E)));
      $$3.a(this.a(c, () -> new fwx(this, this.E)));
      $$3.a(this.a(d, () -> new fwz(this, this.m, this.E)));
      $$3.a(this.a(s, () -> new fxa(this, this.E)));
      $$3.a(this.a(u, () -> new fwr(this, this.E, this.m.ah())));
      $$3.a(this.a(v, () -> new fwp(this, this.E)));
      $$3.a(this.a(w, () -> new fxh(this.m.ad(), this::a, this.m.ag(), xk.c("resourcePack.title"))));
      $$3.a(this.a(x, () -> new fwo(this, this.E)));
      fny $$4 = $$3.a(this.a(y, () -> new fym(this, this.E)));
      if (!this.m.E()) {
         $$4.j = false;
         $$4.a(z);
      }

      $$3.a(this.a(A, () -> new fst(this)));
      this.C.c($$2);
      this.C.b(fny.a(xj.d, $$0x -> this.aP_()).a(200).a());
      this.C.a($$1x -> {
         fnw var10000 = this.c($$1x);
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

   private void a(auv $$0) {
      this.E.a($$0);
      this.m.a(this);
   }

   private frp l() {
      if (this.m.s != null && this.m.U()) {
         this.F = a(0, 0, "options.difficulty", this.m);
         if (!this.m.s.k().l()) {
            this.G = new foo(0, 0, $$0x -> this.m.a(new fsp(this::c, xk.c("difficulty.lock.title"), xk.a("difficulty.lock.question", this.m.s.k().q().b()))));
            this.F.i(this.F.y() - this.G.y());
            this.G.b(this.m.s.k().r());
            this.G.j = !this.G.a();
            this.F.j = !this.G.a();
            frk $$0 = new frk(150, 0, frk.b.a);
            $$0.a(this.F);
            $$0.a(this.G);
            return $$0;
         } else {
            this.F.j = false;
            return this.F;
         }
      } else {
         return fny.a(xk.c("options.online"), $$0x -> this.m.a(new fwt(this, this.E))).a(this.n / 2 + 5, this.o / 6 - 12 + 24, 150, 20).a();
      }
   }

   public static fof<bsx> a(int $$0, int $$1, String $$2, flz $$3) {
      return fof.a(bsx::b).a(bsx.values()).a($$3.s.am()).a($$0, $$1, 150, 20, xk.c($$2), ($$1x, $$2x) -> $$3.L().b(new ahf($$2x)));
   }

   private void c(boolean $$0) {
      this.m.a(this);
      if ($$0 && this.m.s != null && this.G != null && this.F != null) {
         this.m.L().b(new ahz(true));
         this.G.b(true);
         this.G.j = false;
         this.F.j = false;
      }
   }

   @Override
   public void aJ_() {
      this.E.az();
   }

   private fny a(xk $$0, Supplier<ftr> $$1) {
      return fny.a($$0, $$1x -> this.m.a($$1.get())).a();
   }
}
