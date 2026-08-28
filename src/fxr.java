import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxr extends fxq implements abp, xc {
   private static final Logger j = LogUtils.getLogger();
   private final GameProfile k;
   private cpj l;
   private final jw.b m;
   private final fyg n = new fyg();
   @Nullable
   private fxz o;
   @Nullable
   protected fhd.b i;

   public fxr(ffd $$0, wj $$1, fxx $$2) {
      super($$0, $$1, $$2);
      this.k = $$2.a();
      this.m = $$2.c();
      this.l = $$2.d();
      this.i = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aaw $$0) {
      this.b($$0);
   }

   private void b(aaw $$0) {
      j.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abr $$0) {
      zy.a($$0, this, this.a);
      this.n.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aak $$0) {
      zy.a($$0, this, this.a);
      this.n.a($$0.b());
   }

   @Override
   public void a(abu $$0) {
      this.l = cpl.e.a($$0.b());
   }

   @Override
   public void a(abt $$0) {
      zy.a($$0, this, this.a);
      if (this.o == null) {
         this.o = new fxz();
      }

      List<atv> $$1 = this.o.a($$0.b());
      this.b(new abz($$1));
   }

   @Override
   public void a(abs $$0) {
      this.i = null;
   }

   private <T> T a(Function<aur, T> $$0) {
      if (this.o == null) {
         return $$0.apply(aur.b);
      } else {
         Object var3;
         try (aue $$1 = this.o.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abq $$0) {
      zy.a($$0, this, this.a);
      jw.b $$1 = this.a($$0x -> this.n.a($$0x, this.m, this.b.e()));
      this.b.a(agu.b.bind(wz.a($$1)), new fxu(this.a, this.b, new fxx(this.k, this.e, $$1, this.l, this.d, this.c, this.f, this.h, this.i)));
      this.b.a(aby.a);
      this.b.a(agu.a.bind(wz.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(xo $$0) {
      super.a($$0);
      this.a.B();
   }
}
