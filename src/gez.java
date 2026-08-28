import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gez extends fzq {
   private static final Logger d = LogUtils.getLogger();
   public static final ein a = new ein((long)"test1".hashCode(), true, false);
   protected final fzq b;
   private fty s;
   private fty u;
   private fty v;
   private fty w;
   protected fuh c;
   private gff x;

   public gez(fzq $$0) {
      super(xg.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aT_() {
      this.c = new fuh(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xg.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new gff(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fty.a(fai.a, $$0 -> this.x.b().ifPresent(gff.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fty.a(xg.c("selectWorld.create"), $$0 -> ger.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fty.a(xg.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(gff.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fty.a(xg.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(gff.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fty.a(xg.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(gff.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fty.a(xf.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aH_() {
      this.b(this.c);
   }

   @Override
   public void aQ_() {
      this.m.a(this.b);
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable fai $$0) {
      if ($$0 == null) {
         this.u.b(fai.a);
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
   public void aK_() {
      if (this.x != null) {
         this.x.aJ_().forEach(gff.a::close);
      }
   }
}
