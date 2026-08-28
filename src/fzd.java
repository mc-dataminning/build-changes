import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzd extends fzc implements abc, wn {
   private static final Logger m = LogUtils.getLogger();
   private final GameProfile n;
   private cpl o;
   private final ka.b p;
   private final fzs q = new fzs();
   @Nullable
   private fzl r;
   @Nullable
   protected fin.b l;

   public fzd(fgo $$0, vt $$1, fzj $$2) {
      super($$0, $$1, $$2);
      this.n = $$2.a();
      this.p = $$2.c();
      this.o = $$2.d();
      this.l = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aaj $$0) {
      this.b($$0);
   }

   private void b(aaj $$0) {
      m.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abe $$0) {
      zj.a($$0, this, this.a);
      this.q.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zx $$0) {
      zj.a($$0, this, this.a);
      this.q.a($$0.b());
   }

   @Override
   public void a(abh $$0) {
      this.o = cpn.d.a($$0.b());
   }

   @Override
   public void a(abg $$0) {
      zj.a($$0, this, this.a);
      if (this.r == null) {
         this.r = new fzl();
      }

      List<atl> $$1 = this.r.a($$0.b());
      this.b(new abm($$1));
   }

   @Override
   public void a(abf $$0) {
      this.l = null;
   }

   private <T> T a(Function<auh, T> $$0) {
      if (this.r == null) {
         return $$0.apply(auh.b);
      } else {
         Object var3;
         try (atu $$1 = this.r.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abd $$0) {
      zj.a($$0, this, this.a);
      ka.b $$1 = this.a($$0x -> this.q.a($$0x, this.p, this.b.e()));
      this.b
         .a(agh.b.a(wk.a($$1)), new fzg(this.a, this.b, new fzj(this.n, this.e, $$1, this.o, this.d, this.c, this.f, this.i, this.l, this.h, this.j, this.k)));
      this.b.a(abl.a);
      this.b.a(agh.a.a(wk.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vv $$0) {
      super.a($$0);
      this.a.z();
   }
}
