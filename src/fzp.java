import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzp extends fui {
   private static final Logger d = LogUtils.getLogger();
   public static final edo a = new edo((long)"test1".hashCode(), true, false);
   protected final fui b;
   private fop s;
   private fop u;
   private fop v;
   private fop w;
   protected foz c;
   private fzv x;

   public fzp(fui $$0) {
      super(wo.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aR_() {
      this.c = new foz(this.p, this.n / 2 - 100, 22, 200, 20, this.c, wo.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new fzv(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fop.a(eve.a, $$0 -> this.x.b().ifPresent(fzv.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fop.a(wo.c("selectWorld.create"), $$0 -> fzh.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.v = this.c(fop.a(wo.c("selectWorld.edit"), $$0 -> this.x.b().ifPresent(fzv.c::g)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.s = this.c(fop.a(wo.c("selectWorld.delete"), $$0 -> this.x.b().ifPresent(fzv.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.w = this.c(fop.a(wo.c("selectWorld.recreate"), $$0 -> this.x.b().ifPresent(fzv.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fop.a(wn.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(fob $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable eve $$0) {
      if ($$0 == null) {
         this.u.b(eve.a);
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
         this.x.aH_().forEach(fzv.a::close);
      }
   }
}
