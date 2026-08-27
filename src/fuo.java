import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuo extends fun implements aaj, vw {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private cmn k;
   private final jb.b l;
   private final fvd m = new fvd();
   @Nullable
   private fuw n;

   public fuo(fby $$0, vg $$1, fuu $$2) {
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
   protected void a(zq $$0) {
      this.b($$0);
   }

   private void b(zq $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aal $$0) {
      ys.a($$0, this, this.a);
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ze $$0) {
      ys.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(aan $$0) {
      this.k = cmp.e.a($$0.b());
   }

   @Override
   public void a(aam $$0) {
      ys.a($$0, this, this.a);
      if (this.n == null) {
         this.n = new fuw();
      }

      List<asl> $$1 = this.n.a($$0.b());
      this.b(new aas($$1));
   }

   private <T> T a(Function<ath, T> $$0) {
      if (this.n == null) {
         return $$0.apply(ath.b);
      } else {
         Object var3;
         try (asu $$1 = this.n.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aak $$0) {
      ys.a($$0, this, this.a);
      jb.b $$1 = this.a($$0x -> this.m.a($$0x, this.l, this.b.e()));
      this.b.a(afm.b.bind(vt.a($$1)), new fur(this.a, this.b, new fuu(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(aar.a);
      this.b.a(afm.a.bind(vt.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(wi $$0) {
      super.a($$0);
      this.a.B();
   }
}
