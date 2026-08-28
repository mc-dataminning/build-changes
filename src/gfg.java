import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfg extends gff implements abz, xj {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private css n;
   private final ke.b o;
   private final gfw p = new gfw();
   @Nullable
   private gfp q;
   @Nullable
   protected foe.b k;

   public gfg(fme $$0, wp $$1, gfn $$2) {
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
   protected void a(abf $$0) {
      this.b($$0);
   }

   private void b(abf $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(acb $$0) {
      aaf.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aat $$0) {
      aaf.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(ace $$0) {
      this.n = csu.f.a($$0.b());
   }

   @Override
   public void a(acd $$0) {
      aaf.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gfp();
      }

      List<avc> $$1 = this.q.a($$0.b());
      this.b(new acj($$1));
   }

   @Override
   public void a(acc $$0) {
      this.k = null;
   }

   private <T> T a(Function<avy, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avy.b);
      } else {
         Object var3;
         try (avl $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aca $$0) {
      aaf.a($$0, this, this.a);
      ke.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(ahl.b.a(xg.a($$1)), new gfj(this.a, this.b, new gfn(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(aci.a);
      this.b.a(ahl.a.a(xg.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(wr $$0) {
      super.a($$0);
      this.a.z();
   }
}
