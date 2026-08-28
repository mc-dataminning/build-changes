import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gap extends fvi {
   private static final Logger d = LogUtils.getLogger();
   public static final eem a = new eem((long)"test1".hashCode(), true, false);
   protected final fvi b;
   private fpq s;
   private fpq u;
   private fpq v;
   private fpq w;
   protected fpz c;
   private gav x;

   public gap(fvi $$0) {
      super(wp.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aR_() {
      this.c = new fpz(this.p, this.n / 2 - 100, 22, 200, 20, this.c, wp.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new gav(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fpq.a(ewd.a, $$0 -> this.x.b().ifPresent(gav.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fpq.a(wp.c("selectWorld.create"), $$0 -> gah.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fpq.a(wp.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(gav.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fpq.a(wp.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(gav.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fpq.a(wp.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(gav.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fpq.a(wo.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
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
   public void aI_() {
      if (this.x != null) {
         this.x.aH_().forEach(gav.a::close);
      }
   }
}
