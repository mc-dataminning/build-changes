import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxd extends frw {
   private static final Logger d = LogUtils.getLogger();
   public static final eco a = new eco((long)"test1".hashCode(), true, false);
   protected final frw b;
   private fmd s;
   private fmd u;
   private fmd v;
   private fmd w;
   protected fmm c;
   private fxj x;

   public fxd(frw $$0) {
      super(xj.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aR_() {
      this.c = new fmm(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xj.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new fxj(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fmd.a(euc.a, $$0 -> this.x.c().ifPresent(fxj.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fmd.a(xj.c("selectWorld.create"), $$0 -> fwv.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fmd.a(xj.c("selectWorld.edit"), $$0 -> this.x.c().ifPresent(fxj.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fmd.a(xj.c("selectWorld.delete"), $$0 -> this.x.c().ifPresent(fxj.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fmd.a(xj.c("selectWorld.recreate"), $$0 -> this.x.c().ifPresent(fxj.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fmd.a(xi.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aF_() {
      this.b(this.c);
   }

   @Override
   public void aO_() {
      this.m.a(this.b);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable euc $$0) {
      if ($$0 == null) {
         this.u.b(euc.a);
         this.u.j = false;
         this.v.j = false;
         this.w.j = false;
         this.s.j = false;
      } else {
         this.u.b($$0.t());
         this.u.j = $$0.u();
         this.v.j = $$0.w();
         this.w.j = $$0.x();
         this.s.j = $$0.y();
      }
   }

   @Override
   public void j() {
      if (this.x != null) {
         this.x.aH_().forEach(fxj.a::close);
      }
   }
}
