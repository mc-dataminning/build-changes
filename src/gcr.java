import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcr extends fxi {
   private static final Logger d = LogUtils.getLogger();
   public static final egl a = new egl((long)"test1".hashCode(), true, false);
   protected final fxi b;
   private frq s;
   private frq u;
   private frq v;
   private frq w;
   protected frz c;
   private gcx x;

   public gcr(fxi $$0) {
      super(ww.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new frz(this.p, this.n / 2 - 100, 22, 200, 20, this.c, ww.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new gcx(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(frq.a(eyc.a, $$0 -> this.x.b().ifPresent(gcx.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(frq.a(ww.c("selectWorld.create"), $$0 -> gcj.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(frq.a(ww.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(gcx.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(frq.a(ww.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(gcx.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(frq.a(ww.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(gcx.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(frq.a(wv.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable eyc $$0) {
      if ($$0 == null) {
         this.u.b(eyc.a);
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
         this.x.aD_().forEach(gcx.a::close);
      }
   }
}
