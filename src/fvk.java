import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvk extends fvj implements aat, wg {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private cmy k;
   private final jj.b l;
   private final fvz m = new fvz();
   @Nullable
   private fvs n;

   public fvk(fcu $$0, vq $$1, fvq $$2) {
      super($$0, $$1, $$2);
      this.j = $$2.a();
      this.l = $$2.c();
      this.k = $$2.d();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aaa $$0) {
      this.b($$0);
   }

   private void b(aaa $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aav $$0) {
      zc.a($$0, this, this.a);
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zo $$0) {
      zc.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(aax $$0) {
      this.k = cna.e.a($$0.b());
   }

   @Override
   public void a(aaw $$0) {
      zc.a($$0, this, this.a);
      if (this.n == null) {
         this.n = new fvs();
      }

      List<asv> $$1 = this.n.a($$0.b());
      this.b(new abc($$1));
   }

   private <T> T a(Function<atr, T> $$0) {
      if (this.n == null) {
         return $$0.apply(atr.b);
      } else {
         Object var3;
         try (ate $$1 = this.n.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aau $$0) {
      zc.a($$0, this, this.a);
      jj.b $$1 = this.a($$0x -> this.m.a($$0x, this.l, this.b.e()));
      this.b.a(afw.b.bind(wd.a($$1)), new fvn(this.a, this.b, new fvq(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(abb.a);
      this.b.a(afw.a.bind(wd.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(ws $$0) {
      super.a($$0);
      this.a.B();
   }
}
