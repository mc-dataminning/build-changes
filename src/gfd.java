import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfd extends gfc implements abo, wy {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private csk n;
   private final ke.b o;
   private final gft p = new gft();
   @Nullable
   private gfm q;
   @Nullable
   protected fnz.b k;

   public gfd(flz $$0, we $$1, gfk $$2) {
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
   protected void a(aau $$0) {
      this.b($$0);
   }

   private void b(aau $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abq $$0) {
      zu.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aai $$0) {
      zu.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abt $$0) {
      this.n = csm.e.a($$0.b());
   }

   @Override
   public void a(abs $$0) {
      zu.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gfm();
      }

      List<aur> $$1 = this.q.a($$0.b());
      this.b(new aby($$1));
   }

   @Override
   public void a(abr $$0) {
      this.k = null;
   }

   private <T> T a(Function<avo, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avo.b);
      } else {
         Object var3;
         try (avb $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abp $$0) {
      zu.a($$0, this, this.a);
      ke.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(aha.b.a(wv.a($$1)), new gfg(this.a, this.b, new gfk(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abx.a);
      this.b.a(aha.a.a(wv.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(wg $$0) {
      super.a($$0);
      this.a.z();
   }
}
