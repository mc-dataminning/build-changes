import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xo(UUID a, clz b) {
   public xt a(Duration $$0) {
      return new xt.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xr.b a(UUID $$0) {
      return new xr($$0, this.a).a(this.b);
   }

   public xo.a a() {
      return new xo.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public clz d() {
      return this.b;
   }

   public static record a(UUID a, clz.a b) {
      public static xo.a a(vx $$0) {
         return new xo.a($$0.n(), new clz.a($$0));
      }

      public static void a(vx $$0, xo.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xo a(GameProfile $$0, ayp $$1) throws clz.b {
         return new xo(this.a, clz.a($$1, $$0.getId(), this.b));
      }
   }
}
