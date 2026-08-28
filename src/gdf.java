import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gdf extends gde implements abn, wx {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private crq n;
   private final ke.b o;
   private final gdu p = new gdu();
   @Nullable
   private gdn q;
   @Nullable
   protected fme.b k;

   public gdf(fke $$0, wd $$1, gdl $$2) {
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
   protected void a(aat $$0) {
      this.b($$0);
   }

   private void b(aat $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abp $$0) {
      zt.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aah $$0) {
      zt.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abs $$0) {
      this.n = crs.e.a($$0.b());
   }

   @Override
   public void a(abr $$0) {
      zt.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gdn();
      }

      List<auj> $$1 = this.q.a($$0.b());
      this.b(new abx($$1));
   }

   @Override
   public void a(abq $$0) {
      this.k = null;
   }

   private <T> T a(Function<avg, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avg.b);
      } else {
         Object var3;
         try (aus $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abo $$0) {
      zt.a($$0, this, this.a);
      ke.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(agv.b.a(wu.a($$1)), new gdi(this.a, this.b, new gdl(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abw.a);
      this.b.a(agv.a.a(wu.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(wf $$0) {
      super.a($$0);
      this.a.z();
   }
}
