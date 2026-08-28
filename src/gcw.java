import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcw extends gcv implements abp, wz {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private crj n;
   private final ke.b o;
   private final gdl p = new gdl();
   @Nullable
   private gde q;
   @Nullable
   protected flx.b k;

   public gcw(fjx $$0, wf $$1, gdc $$2) {
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
   protected void a(aav $$0) {
      this.b($$0);
   }

   private void b(aav $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abr $$0) {
      zv.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aaj $$0) {
      zv.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abu $$0) {
      this.n = crl.f.a($$0.b());
   }

   @Override
   public void a(abt $$0) {
      zv.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new gde();
      }

      List<auk> $$1 = this.q.a($$0.b());
      this.b(new abz($$1));
   }

   @Override
   public void a(abs $$0) {
      this.k = null;
   }

   private <T> T a(Function<avh, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avh.b);
      } else {
         Object var3;
         try (aut $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abq $$0) {
      zv.a($$0, this, this.a);
      ke.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(agx.b.a(ww.a($$1)), new gcz(this.a, this.b, new gdc(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(aby.a);
      this.b.a(agx.a.a(ww.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(wh $$0) {
      super.a($$0);
      this.a.z();
   }
}
