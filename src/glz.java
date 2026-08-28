import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class glz extends gly implements abe, wo {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private cvh n;
   private final jt.b o;
   private final gmp p = new gmp();
   @Nullable
   private gmi q;
   @Nullable
   protected fum.b k;

   public glz(frd $$0, vt $$1, gmg $$2) {
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
   protected void a(aak $$0) {
      this.b($$0);
   }

   private void b(aak $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abg $$0) {
      zk.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zy $$0) {
      zk.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abj $$0) {
      this.n = cvj.e.a($$0.b());
   }

   @Override
   public void a(abi $$0) {
      zk.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gmi();
      }

      List<aul> $$1 = this.q.a($$0.b());
      this.b(new abo($$1));
   }

   @Override
   public void a(abh $$0) {
      this.k = null;
   }

   private <T> T a(Function<avi, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avi.b);
      } else {
         Object var3;
         try (auu $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abf $$0) {
      zk.a($$0, this, this.a);
      jt.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(agq.b.a(wl.a($$1)), new gmc(this.a, this.b, new gmg(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abn.a);
      this.b.a(agq.a.a(wl.a($$1)));
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
