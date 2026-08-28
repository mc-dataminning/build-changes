import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfo extends gaf {
   private static final Logger d = LogUtils.getLogger();
   public static final eid a = new eid((long)"test1".hashCode(), true, false);
   protected final gaf b;
   private fun s;
   private fun u;
   private fun v;
   private fun w;
   protected fuw c;
   private gfu x;

   public gfo(gaf $$0) {
      super(xc.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aS_() {
      this.c = new fuw(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xc.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new gfu(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fun.a(ezy.a, $$0 -> this.x.b().ifPresent(gfu.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fun.a(xc.c("selectWorld.create"), $$0 -> gfg.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fun.a(xc.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(gfu.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fun.a(xc.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(gfu.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fun.a(xc.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(gfu.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fun.a(xb.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aG_() {
      this.b(this.c);
   }

   @Override
   public void aP_() {
      this.m.a(this.b);
   }

   @Override
   public void a(ftz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable ezy $$0) {
      if ($$0 == null) {
         this.u.b(ezy.a);
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
   public void aJ_() {
      if (this.x != null) {
         this.x.aI_().forEach(gfu.a::close);
      }
   }
}
