import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xp(UUID a, cmy b) {
   public xu a(Duration $$0) {
      return new xu.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xs.b a(UUID $$0) {
      return new xs($$0, this.a).a(this.b);
   }

   public xp.a a() {
      return new xp.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cmy d() {
      return this.b;
   }

   public static record a(UUID a, cmy.a b) {
      public static xp.a a(vv $$0) {
         return new xp.a($$0.n(), new cmy.a($$0));
      }

      public static void a(vv $$0, xp.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xp a(GameProfile $$0, aza $$1) throws cmy.b {
         return new xp(this.a, cmy.a($$1, $$0.getId(), this.b));
      }
   }
}
