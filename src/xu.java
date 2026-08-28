import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xu(UUID a, cnx b) {
   public xz a(Duration $$0) {
      return new xz.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xx.b a(UUID $$0) {
      return new xx($$0, this.a).a(this.b);
   }

   public xu.a a() {
      return new xu.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cnx d() {
      return this.b;
   }

   public static record a(UUID a, cnx.a b) {
      public static xu.a a(wa $$0) {
         return new xu.a($$0.n(), new cnx.a($$0));
      }

      public static void a(wa $$0, xu.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xu a(GameProfile $$0, azq $$1) throws cnx.b {
         return new xu(this.a, cnx.a($$1, $$0.getId(), this.b));
      }
   }
}
