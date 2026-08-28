import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzd extends ftw {
   private static final Logger d = LogUtils.getLogger();
   public static final een a = new een((long)"test1".hashCode(), true, false);
   protected final ftw b;
   private fod s;
   private fod u;
   private fod v;
   private fod w;
   protected fom c;
   private fzj x;

   public fzd(ftw $$0) {
      super(xv.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aT_() {
      this.c = new fom(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xv.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new fzj(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fod.a(ewd.a, $$0 -> this.x.b().ifPresent(fzj.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fod.a(xv.c("selectWorld.create"), $$0 -> fyv.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fod.a(xv.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(fzj.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fod.a(xv.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(fzj.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fod.a(xv.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(fzj.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fod.a(xu.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable ewd $$0) {
      if ($$0 == null) {
         this.u.b(ewd.a);
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
         this.x.aI_().forEach(fzj.a::close);
      }
   }
}
