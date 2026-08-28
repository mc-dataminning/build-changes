import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gav extends gau implements abh, wr {
   private static final Logger m = LogUtils.getLogger();
   private final GameProfile n;
   private cqh o;
   private final kb.b p;
   private final gbk q = new gbk();
   @Nullable
   private gbd r;
   @Nullable
   protected fkb.b l;

   public gav(fib $$0, vx $$1, gbb $$2) {
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
   protected void a(aan $$0) {
      this.b($$0);
   }

   private void b(aan $$0) {
      m.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abj $$0) {
      zn.a($$0, this, this.a);
      this.q.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aab $$0) {
      zn.a($$0, this, this.a);
      this.q.a($$0.b());
   }

   @Override
   public void a(abm $$0) {
      this.o = cqj.f.a($$0.b());
   }

   @Override
   public void a(abl $$0) {
      zn.a($$0, this, this.a);
      if (this.r == null) {
         this.r = new gbd();
      }

      List<atz> $$1 = this.r.a($$0.b());
      this.b(new abr($$1));
   }

   @Override
   public void a(abk $$0) {
      this.l = null;
   }

   private <T> T a(Function<auv, T> $$0) {
      if (this.r == null) {
         return $$0.apply(auv.b);
      } else {
         Object var3;
         try (aui $$1 = this.r.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abi $$0) {
      zn.a($$0, this, this.a);
      kb.b $$1 = this.a($$0x -> this.q.a($$0x, this.p, this.b.e()));
      this.b
         .a(agp.b.a(wo.a($$1)), new gay(this.a, this.b, new gbb(this.n, this.e, $$1, this.o, this.d, this.c, this.f, this.i, this.l, this.h, this.j, this.k)));
      this.b.a(abq.a);
      this.b.a(agp.a.a(wo.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vz $$0) {
      super.a($$0);
      this.a.z();
   }
}
