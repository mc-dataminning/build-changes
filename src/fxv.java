import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxv extends fxu implements abq, xd {
   private static final Logger k = LogUtils.getLogger();
   private final GameProfile l;
   private cpn m;
   private final jw.b n;
   private final fyk o = new fyk();
   @Nullable
   private fyd p;
   @Nullable
   protected fhh.b j;

   public fxv(ffh $$0, wk $$1, fyb $$2) {
      super($$0, $$1, $$2);
      this.l = $$2.a();
      this.n = $$2.c();
      this.m = $$2.d();
      this.j = $$2.i();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aax $$0) {
      this.b($$0);
   }

   private void b(aax $$0) {
      k.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abs $$0) {
      zz.a($$0, this, this.a);
      this.o.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aal $$0) {
      zz.a($$0, this, this.a);
      this.o.a($$0.b());
   }

   @Override
   public void a(abv $$0) {
      this.m = cpp.e.a($$0.b());
   }

   @Override
   public void a(abu $$0) {
      zz.a($$0, this, this.a);
      if (this.p == null) {
         this.p = new fyd();
      }

      List<atw> $$1 = this.p.a($$0.b());
      this.b(new aca($$1));
   }

   @Override
   public void a(abt $$0) {
      this.j = null;
   }

   private <T> T a(Function<aus, T> $$0) {
      if (this.p == null) {
         return $$0.apply(aus.b);
      } else {
         Object var3;
         try (auf $$1 = this.p.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abr $$0) {
      zz.a($$0, this, this.a);
      jw.b $$1 = this.a($$0x -> this.o.a($$0x, this.n, this.b.e()));
      this.b.a(agv.b.bind(xa.a($$1)), new fxy(this.a, this.b, new fyb(this.l, this.e, $$1, this.m, this.d, this.c, this.f, this.i, this.j, this.h)));
      this.b.a(abz.a);
      this.b.a(agv.a.bind(xa.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(xp $$0) {
      super.a($$0);
      this.a.B();
   }
}
