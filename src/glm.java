import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class glm extends gll implements abn, wu {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private cvs n;
   private final ju.b o;
   private final gmc p = new gmc();
   @Nullable
   private glv q;
   @Nullable
   protected ftz.b k;

   public glm(fqq $$0, vv $$1, glt $$2) {
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
      zr.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aah $$0) {
      zr.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(abs $$0) {
      this.n = cvu.e.a($$0.b());
   }

   @Override
   public void a(abr $$0) {
      zr.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new glv();
      }

      List<auu> $$1 = this.q.a($$0.b());
      this.b(new abx($$1));
   }

   @Override
   public void a(abq $$0) {
      this.k = null;
   }

   private <T> T a(Function<avr, T> $$0) {
      if (this.q == null) {
         return $$0.apply(avr.b);
      } else {
         Object var3;
         try (ave $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abo $$0) {
      zr.a($$0, this, this.a);
      ju.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(agz.c.a(wp.a($$1)), new glp(this.a, this.b, new glt(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abw.a);
      this.b.a(agz.b.a(wp.a($$1), new agz.a() {
         @Override
         public boolean a() {
            return true;
         }
      }));
   }

   @Override
   public void d() {
      this.a();
   }

   @Override
   public void a(vx $$0) {
      super.a($$0);
      this.a.z();
   }
}
