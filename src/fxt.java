import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fxt extends fxs implements abq, xd {
   private static final Logger j = LogUtils.getLogger();
   private final GameProfile k;
   private cpl l;
   private final jw.b m;
   private final fyi n = new fyi();
   @Nullable
   private fyb o;
   @Nullable
   protected fhf.b i;

   public fxt(fff $$0, wk $$1, fxz $$2) {
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
   protected void a(aax $$0) {
      this.b($$0);
   }

   private void b(aax $$0) {
      j.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(abs $$0) {
      zz.a($$0, this, this.a);
      this.n.a($$0.b(), $$0.e());
   }

   @Override
   public void a(aal $$0) {
      zz.a($$0, this, this.a);
      this.n.a($$0.b());
   }

   @Override
   public void a(abv $$0) {
      this.l = cpn.e.a($$0.b());
   }

   @Override
   public void a(abu $$0) {
      zz.a($$0, this, this.a);
      if (this.o == null) {
         this.o = new fyb();
      }

      List<atw> $$1 = this.o.a($$0.b());
      this.b(new aca($$1));
   }

   @Override
   public void a(abt $$0) {
      this.i = null;
   }

   private <T> T a(Function<aus, T> $$0) {
      if (this.o == null) {
         return $$0.apply(aus.b);
      } else {
         Object var3;
         try (auf $$1 = this.o.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(abr $$0) {
      zz.a($$0, this, this.a);
      jw.b $$1 = this.a($$0x -> this.n.a($$0x, this.m, this.b.e()));
      this.b.a(agv.b.bind(xa.a($$1)), new fxw(this.a, this.b, new fxz(this.k, this.e, $$1, this.l, this.d, this.c, this.f, this.h, this.i)));
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
