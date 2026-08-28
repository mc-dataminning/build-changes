import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xl(UUID a, cmk b) {
   public xq a(Duration $$0) {
      return new xq.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xo.b a(UUID $$0) {
      return new xo($$0, this.a).a(this.b);
   }

   public xl.a a() {
      return new xl.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cmk d() {
      return this.b;
   }

   public static record a(UUID a, cmk.a b) {
      public static xl.a a(vr $$0) {
         return new xl.a($$0.n(), new cmk.a($$0));
      }

      public static void a(vr $$0, xl.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xl a(GameProfile $$0, ayr $$1) throws cmk.b {
         return new xl(this.a, cmk.a($$1, $$0.getId(), this.b));
      }
   }
}
