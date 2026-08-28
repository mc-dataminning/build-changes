import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyj extends fyi implements aav, wi {
   private static final Logger k = LogUtils.getLogger();
   private final GameProfile l;
   private coz m;
   private final jx.b n;
   private final fyy o = new fyy();
   @Nullable
   private fyr p;
   @Nullable
   protected fhv.b j;

   public fyj(ffw $$0, vp $$1, fyp $$2) {
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
   protected void a(aac $$0) {
      this.b($$0);
   }

   private void b(aac $$0) {
      k.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aax $$0) {
      ze.a($$0, this, this.a);
      this.o.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zq $$0) {
      ze.a($$0, this, this.a);
      this.o.a($$0.b());
   }

   @Override
   public void a(aba $$0) {
      this.m = cpb.d.a($$0.b());
   }

   @Override
   public void a(aaz $$0) {
      ze.a($$0, this, this.a);
      if (this.p == null) {
         this.p = new fyr();
      }

      List<atd> $$1 = this.p.a($$0.b());
      this.b(new abf($$1));
   }

   @Override
   public void a(aay $$0) {
      this.j = null;
   }

   private <T> T a(Function<atz, T> $$0) {
      if (this.p == null) {
         return $$0.apply(atz.b);
      } else {
         Object var3;
         try (atm $$1 = this.p.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aaw $$0) {
      ze.a($$0, this, this.a);
      jx.b $$1 = this.a($$0x -> this.o.a($$0x, this.n, this.b.e()));
      this.b.a(aga.b.bind(wf.a($$1)), new fym(this.a, this.b, new fyp(this.l, this.e, $$1, this.m, this.d, this.c, this.f, this.i, this.j, this.h)));
      this.b.a(abe.a);
      this.b.a(aga.a.bind(wf.a($$1)));
   }

   @Override
   public void d() {
      this.e();
   }

   @Override
   public void a(wu $$0) {
      super.a($$0);
      this.a.z();
   }
}
