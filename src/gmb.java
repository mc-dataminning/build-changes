import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gmb extends gma implements abg, wq {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private cvj n;
   private final ju.b o;
   private final gmr p = new gmr();
   @Nullable
   private gmk q;
   @Nullable
   protected fuo.b k;

   public gmb(frf $$0, vv $$1, gmi $$2) {
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
   protected void a(aam $$0) {
      this.b($$0);
   }

   private void b(aam $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abi $$0) {
      zm.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aaa $$0) {
      zm.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abl $$0) {
      this.n = cvl.e.a($$0.b());
   }

   @Override
   public void a(abk $$0) {
      zm.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gmk();
      }

      List<aun> $$1 = this.q.a($$0.b());
      this.b(new abq($$1));
   }

   @Override
   public void a(abj $$0) {
      this.k = null;
   }

   private <T> T a(Function<avk, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avk.b);
      } else {
         Object var3;
         try (auw $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abh $$0) {
      zm.a($$0, this, this.a);
      ju.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(ags.b.a(wn.a($$1)), new gme(this.a, this.b, new gmi(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abp.a);
      this.b.a(ags.a.a(wn.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vx $$0) {
      super.a($$0);
      this.a.z();
   }
}
