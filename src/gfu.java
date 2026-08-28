import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfu extends gft implements aas, wc {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private crr n;
   private final kf.b o;
   private final ggk p = new ggk();
   @Nullable
   private ggd q;
   @Nullable
   protected foq.b k;

   public gfu(flh $$0, vi $$1, ggb $$2) {
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
   protected void a(zy $$0) {
      this.b($$0);
   }

   private void b(zy $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aau $$0) {
      yy.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zm $$0) {
      yy.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(aax $$0) {
      this.n = crt.e.a($$0.b());
   }

   @Override
   public void a(aaw $$0) {
      yy.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new ggd();
      }

      List<atv> $$1 = this.q.a($$0.b());
      this.b(new abc($$1));
   }

   @Override
   public void a(aav $$0) {
      this.k = null;
   }

   private <T> T a(Function<aur, T> $$0) {
      if (this.q == null) {
         return $$0.apply(aur.b);
      } else {
         Object var3;
         try (aue $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aat $$0) {
      yy.a($$0, this, this.a);
      kf.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(age.b.a(vz.a($$1)), new gfx(this.a, this.b, new ggb(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abb.a);
      this.b.a(age.a.a(vz.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(vk $$0) {
      super.a($$0);
      this.a.z();
   }
}
