import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class geb extends fys {
   private static final Logger d = LogUtils.getLogger();
   public static final ehq a = new ehq((long)"test1".hashCode(), true, false);
   protected final fys b;
   private fta s;
   private fta u;
   private fta v;
   private fta w;
   protected ftj c;
   private geh x;

   public geb(fys $$0) {
      super(wy.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aO_() {
      this.c = new ftj(this.p, this.n / 2 - 100, 22, 200, 20, this.c, wy.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new geh(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fta.a(ezi.a, $$0 -> this.x.b().ifPresent(geh.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fta.a(wy.c("selectWorld.create"), $$0 -> gdt.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fta.a(wy.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(geh.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fta.a(wy.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(geh.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fta.a(wy.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(geh.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fta.a(wx.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aC_() {
      this.b(this.c);
   }

   @Override
   public void aL_() {
      this.m.a(this.b);
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable ezi $$0) {
      if ($$0 == null) {
         this.u.b(ezi.a);
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
   public void aF_() {
      if (this.x != null) {
         this.x.aE_().forEach(geh.a::close);
      }
   }
}
