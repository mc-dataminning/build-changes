import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvu extends fvt implements aav, wi {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private cnu k;
   private final jk.b l;
   private final fwj m = new fwj();
   @Nullable
   private fwc n;

   public fvu(fde $$0, vs $$1, fwa $$2) {
      super($$0, $$1, $$2);
      this.j = $$2.a();
      this.l = $$2.c();
      this.k = $$2.d();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected void a(aac $$0) {
      this.b($$0);
   }

   private void b(aac $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aax $$0) {
      ze.a($$0, this, this.a);
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zq $$0) {
      ze.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(aaz $$0) {
      this.k = cnw.e.a($$0.b());
   }

   @Override
   public void a(aay $$0) {
      ze.a($$0, this, this.a);
      if (this.n == null) {
         this.n = new fwc();
      }

      List<asy> $$1 = this.n.a($$0.b());
      this.b(new abe($$1));
   }

   private <T> T a(Function<atu, T> $$0) {
      if (this.n == null) {
         return $$0.apply(atu.b);
      } else {
         Object var3;
         try (ath $$1 = this.n.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aaw $$0) {
      ze.a($$0, this, this.a);
      jk.b $$1 = this.a($$0x -> this.m.a($$0x, this.l, this.b.e()));
      this.b.a(afy.b.bind(wf.a($$1)), new fvx(this.a, this.b, new fwa(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(abd.a);
      this.b.a(afy.a.bind(wf.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(wu $$0) {
      super.a($$0);
      this.a.B();
   }
}
