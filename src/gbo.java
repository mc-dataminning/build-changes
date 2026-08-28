import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gbo extends fwf {
   private static final Logger d = LogUtils.getLogger();
   public static final efj a = new efj((long)"test1".hashCode(), true, false);
   protected final fwf b;
   private fqn s;
   private fqn u;
   private fqn v;
   private fqn w;
   protected fqw c;
   private gbu x;

   public gbo(fwf $$0) {
      super(wv.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new fqw(this.p, this.n / 2 - 100, 22, 200, 20, this.c, wv.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new gbu(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fqn.a(exa.a, $$0 -> this.x.b().ifPresent(gbu.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fqn.a(wv.c("selectWorld.create"), $$0 -> gbg.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fqn.a(wv.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(gbu.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fqn.a(wv.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(gbu.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fqn.a(wv.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(gbu.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fqn.a(wu.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aB_() {
      this.b(this.c);
   }

   @Override
   public void aK_() {
      this.m.a(this.b);
   }

   @Override
   public void a(fpz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable exa $$0) {
      if ($$0 == null) {
         this.u.b(exa.a);
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
   public void aE_() {
      if (this.x != null) {
         this.x.aD_().forEach(gbu.a::close);
      }
   }
}
