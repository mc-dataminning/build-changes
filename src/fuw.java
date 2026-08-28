import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuw extends fpt {
   private static final Logger d = LogUtils.getLogger();
   public static final eau a = new eau((long)"test1".hashCode(), true, false);
   protected final fpt b;
   private fka s;
   private fka u;
   private fka v;
   private fka w;
   protected fkj c;
   private fvb x;

   public fuw(fpt $$0) {
      super(xd.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aT_() {
      this.c = new fkj(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xd.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new fvb(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fka.a(esi.a, $$0 -> this.x.c().ifPresent(fvb.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fka.a(xd.c("selectWorld.create"), $$0 -> fuq.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fka.a(xd.c("selectWorld.edit"), $$0 -> this.x.c().ifPresent(fvb.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fka.a(xd.c("selectWorld.delete"), $$0 -> this.x.c().ifPresent(fvb.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fka.a(xd.c("selectWorld.recreate"), $$0 -> this.x.c().ifPresent(fvb.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fka.a(xc.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aI_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable esi $$0) {
      if ($$0 == null) {
         this.u.b(esi.a);
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
         this.x.aK_().forEach(fvb.a::close);
      }
   }
}
