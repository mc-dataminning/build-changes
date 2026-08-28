import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gkj extends gki implements abc, wm {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private cut n;
   private final jt.b o;
   private final gkz p = new gkz();
   @Nullable
   private gks q;
   @Nullable
   protected fsw.b k;

   public gkj(fpo $$0, vr $$1, gkq $$2) {
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
   protected void a(aai $$0) {
      this.b($$0);
   }

   private void b(aai $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abe $$0) {
      zi.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zw $$0) {
      zi.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abh $$0) {
      this.n = cuv.e.a($$0.b());
   }

   @Override
   public void a(abg $$0) {
      zi.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gks();
      }

      List<auj> $$1 = this.q.a($$0.b());
      this.b(new abm($$1));
   }

   @Override
   public void a(abf $$0) {
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
   public void a(abd $$0) {
      zi.a($$0, this, this.a);
      jt.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(ago.b.a(wj.a($$1)), new gkm(this.a, this.b, new gkq(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abl.a);
      this.b.a(ago.a.a(wj.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vt $$0) {
      super.a($$0);
      this.a.z();
   }
}
