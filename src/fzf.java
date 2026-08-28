import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzf extends fty {
   private static final Logger d = LogUtils.getLogger();
   public static final eeo a = new eeo((long)"test1".hashCode(), true, false);
   protected final fty b;
   private fof s;
   private fof u;
   private fof v;
   private fof w;
   protected foo c;
   private fzl x;

   public fzf(fty $$0) {
      super(xv.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aT_() {
      this.c = new foo(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xv.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new fzl(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fof.a(ewe.a, $$0 -> this.x.b().ifPresent(fzl.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fof.a(xv.c("selectWorld.create"), $$0 -> fyx.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fof.a(xv.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(fzl.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fof.a(xv.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(fzl.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fof.a(xv.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(fzl.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fof.a(xu.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(fns $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable ewe $$0) {
      if ($$0 == null) {
         this.u.b(ewe.a);
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
         this.x.aI_().forEach(fzl.a::close);
      }
   }
}
