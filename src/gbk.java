import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gbk extends gbj implements abi, ws {
   private static final Logger m = LogUtils.getLogger();
   private final GameProfile n;
   private cqq o;
   private final kc.b p;
   private final gbz q = new gbz();
   @Nullable
   private gbs r;
   @Nullable
   protected fkp.b l;

   public gbk(fip $$0, vy $$1, gbq $$2) {
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
   protected void a(aao $$0) {
      this.b($$0);
   }

   private void b(aao $$0) {
      m.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abk $$0) {
      zo.a($$0, this, this.a);
      this.q.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aac $$0) {
      zo.a($$0, this, this.a);
      this.q.a($$0.b());
   }

   @Override
   public void a(abn $$0) {
      this.o = cqs.f.a($$0.b());
   }

   @Override
   public void a(abm $$0) {
      zo.a($$0, this, this.a);
      if (this.r == null) {
         this.r = new gbs();
      }

      List<auc> $$1 = this.r.a($$0.b());
      this.b(new abs($$1));
   }

   @Override
   public void a(abl $$0) {
      this.l = null;
   }

   private <T> T a(Function<auz, T> $$0) {
      if (this.r == null) {
         return $$0.apply(auz.b);
      } else {
         Object var3;
         try (aul $$1 = this.r.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abj $$0) {
      zo.a($$0, this, this.a);
      kc.b $$1 = this.a($$0x -> this.q.a($$0x, this.p, this.b.e()));
      this.b
         .a(agq.b.a(wp.a($$1)), new gbn(this.a, this.b, new gbq(this.n, this.e, $$1, this.o, this.d, this.c, this.f, this.i, this.l, this.h, this.j, this.k)));
      this.b.a(abr.a);
      this.b.a(agq.a.a(wp.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(wa $$0) {
      super.a($$0);
      this.a.z();
   }
}
