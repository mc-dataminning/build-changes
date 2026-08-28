import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gbv extends gbu implements abl, wv {
   private static final Logger m = LogUtils.getLogger();
   private final GameProfile n;
   private cra o;
   private final kd.b p;
   private final gck q = new gck();
   @Nullable
   private gcd r;
   @Nullable
   protected fla.b l;

   public gbv(fja $$0, wb $$1, gcb $$2) {
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
   protected void a(aar $$0) {
      this.b($$0);
   }

   private void b(aar $$0) {
      m.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abn $$0) {
      zr.a($$0, this, this.a);
      this.q.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aaf $$0) {
      zr.a($$0, this, this.a);
      this.q.a($$0.b());
   }

   @Override
   public void a(abq $$0) {
      this.o = crc.f.a($$0.b());
   }

   @Override
   public void a(abp $$0) {
      zr.a($$0, this, this.a);
      if (this.r == null) {
         this.r = new gcd();
      }

      List<aug> $$1 = this.r.a($$0.b());
      this.b(new abv($$1));
   }

   @Override
   public void a(abo $$0) {
      this.l = null;
   }

   private <T> T a(Function<avd, T> $$0) {
      if (this.r == null) {
         return $$0.apply(avd.b);
      } else {
         Object var3;
         try (aup $$1 = this.r.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abm $$0) {
      zr.a($$0, this, this.a);
      kd.b $$1 = this.a($$0x -> this.q.a($$0x, this.p, this.b.e()));
      this.b
         .a(agt.b.a(ws.a($$1)), new gby(this.a, this.b, new gcb(this.n, this.e, $$1, this.o, this.d, this.c, this.f, this.i, this.l, this.h, this.j, this.k)));
      this.b.a(abu.a);
      this.b.a(agt.a.a(ws.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(wd $$0) {
      super.a($$0);
      this.a.z();
   }
}
