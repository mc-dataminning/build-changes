import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ghx extends ghw implements aaz, wj {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private cte n;
   private final kg.b o;
   private final gin p = new gin();
   @Nullable
   private gig q;
   @Nullable
   protected fqo.b k;

   public ghx(fnd $$0, vo $$1, gie $$2) {
      super($$0, $$1, $$2);
      this.m = $$2.a();
      this.o = $$2.c();
      this.n = $$2.d();
      this.k = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aaf $$0) {
      this.b($$0);
   }

   private void b(aaf $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abb $$0) {
      zf.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zt $$0) {
      zf.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abe $$0) {
      this.n = ctg.e.a($$0.b());
   }

   @Override
   public void a(abd $$0) {
      zf.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gig();
      }

      List<aug> $$1 = this.q.a($$0.b());
      this.b(new abj($$1));
   }

   @Override
   public void a(abc $$0) {
      this.k = null;
   }

   private <T> T a(Function<avd, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avd.b);
      } else {
         Object var3;
         try (aup $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aba $$0) {
      zf.a($$0, this, this.a);
      kg.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(agl.b.a(wg.a($$1)), new gia(this.a, this.b, new gie(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abi.a);
      this.b.a(agl.a.a(wg.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vq $$0) {
      super.a($$0);
      this.a.z();
   }
}
