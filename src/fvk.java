import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvk extends fqh {
   private static final Logger d = LogUtils.getLogger();
   public static final ebm a = new ebm((long)"test1".hashCode(), true, false);
   protected final fqh b;
   private fko s;
   private fko u;
   private fko v;
   private fko w;
   protected fkx c;
   private fvp x;

   public fvk(fqh $$0) {
      super(xe.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aS_() {
      this.c = new fkx(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xe.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new fvp(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fko.a(eta.a, $$0 -> this.x.c().ifPresent(fvp.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fko.a(xe.c("selectWorld.create"), $$0 -> fve.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fko.a(xe.c("selectWorld.edit"), $$0 -> this.x.c().ifPresent(fvp.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fko.a(xe.c("selectWorld.delete"), $$0 -> this.x.c().ifPresent(fvp.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fko.a(xe.c("selectWorld.recreate"), $$0 -> this.x.c().ifPresent(fvp.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fko.a(xd.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aH_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable eta $$0) {
      if ($$0 == null) {
         this.u.b(eta.a);
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
         this.x.aJ_().forEach(fvp.a::close);
      }
   }
}
