import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyy extends ftr {
   private static final Logger d = LogUtils.getLogger();
   public static final eeh a = new eeh((long)"test1".hashCode(), true, false);
   protected final ftr b;
   private fny s;
   private fny u;
   private fny v;
   private fny w;
   protected foh c;
   private fze x;

   public fyy(ftr $$0) {
      super(xk.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aT_() {
      this.c = new foh(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xk.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new fze(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fny.a(evx.a, $$0 -> this.x.b().ifPresent(fze.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fny.a(xk.c("selectWorld.create"), $$0 -> fyq.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fny.a(xk.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(fze.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fny.a(xk.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(fze.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fny.a(xk.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(fze.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fny.a(xj.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable evx $$0) {
      if ($$0 == null) {
         this.u.b(evx.a);
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
         this.x.aI_().forEach(fze.a::close);
      }
   }
}
