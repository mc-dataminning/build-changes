import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfw extends gfv implements aat, wd {
   private static final Logger l = LogUtils.getLogger();
   private final GameProfile m;
   private crs n;
   private final kf.b o;
   private final ggm p = new ggm();
   @Nullable
   private ggf q;
   @Nullable
   protected fot.b k;

   public gfw(fli $$0, vi $$1, ggd $$2) {
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
   protected void a(zz $$0) {
      this.b($$0);
   }

   private void b(zz $$0) {
      l.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aav $$0) {
      yz.a($$0, this, this.a);
      this.p.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zn $$0) {
      yz.a($$0, this, this.a);
      this.p.a($$0.b());
   }

   @Override
   public void a(aay $$0) {
      this.n = cru.e.a($$0.b());
   }

   @Override
   public void a(aax $$0) {
      yz.a($$0, this, this.a);
      if (this.q == null) {
         this.q = new ggf();
      }

      List<atw> $$1 = this.q.a($$0.b());
      this.b(new abd($$1));
   }

   @Override
   public void a(aaw $$0) {
      this.k = null;
   }

   private <T> T a(Function<aus, T> $$0) {
      if (this.q == null) {
         return $$0.apply(aus.b);
      } else {
         Object var3;
         try (auf $$1 = this.q.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aau $$0) {
      yz.a($$0, this, this.a);
      kf.b $$1 = this.a($$0x -> this.p.a($$0x, this.o, this.b.e()));
      this.b.a(agf.b.a(wa.a($$1)), new gfz(this.a, this.b, new ggd(this.m, this.e, $$1, this.n, this.d, this.c, this.f, this.h, this.k, this.i, this.j)));
      this.b.a(abc.a);
      this.b.a(agf.a.a(wa.a($$1)));
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
