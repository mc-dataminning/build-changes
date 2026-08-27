import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fwp extends fwo implements aay, wl {
   private static final Logger j = LogUtils.getLogger();
   private final GameProfile k;
   private coj l;
   private final jl.b m;
   private final fxe n = new fxe();
   @Nullable
   private fwx o;
   @Nullable
   protected fga.b i;

   public fwp(fdz $$0, vv $$1, fwv $$2) {
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
   protected void a(aaf $$0) {
      this.b($$0);
   }

   private void b(aaf $$0) {
      j.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aba $$0) {
      zh.a($$0, this, this.a);
      this.n.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zt $$0) {
      zh.a($$0, this, this.a);
      this.n.a($$0.b());
   }

   @Override
   public void a(abd $$0) {
      this.l = col.e.a($$0.b());
   }

   @Override
   public void a(abc $$0) {
      zh.a($$0, this, this.a);
      if (this.o == null) {
         this.o = new fwx();
      }

      List<atd> $$1 = this.o.a($$0.b());
      this.b(new abi($$1));
   }

   @Override
   public void a(abb $$0) {
      this.i = null;
   }

   private <T> T a(Function<atz, T> $$0) {
      if (this.o == null) {
         return $$0.apply(atz.b);
      } else {
         Object var3;
         try (atm $$1 = this.o.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aaz $$0) {
      zh.a($$0, this, this.a);
      jl.b $$1 = this.a($$0x -> this.n.a($$0x, this.m, this.b.e()));
      this.b.a(agc.b.bind(wi.a($$1)), new fws(this.a, this.b, new fwv(this.k, this.e, $$1, this.l, this.d, this.c, this.f, this.h, this.i)));
      this.b.a(abh.a);
      this.b.a(agc.a.bind(wi.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      this.a.B();
   }
}
