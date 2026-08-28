import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record yb(UUID a, cpr b) {
   public yg a(Duration $$0) {
      return new yg.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public ye.b a(UUID $$0) {
      return new ye($$0, this.a).a(this.b);
   }

   public yb.a a() {
      return new yb.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cpr d() {
      return this.b;
   }

   public static record a(UUID a, cpr.a b) {
      public static yb.a a(wh $$0) {
         return new yb.a($$0.n(), new cpr.a($$0));
      }

      public static void a(wh $$0, yb.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public yb a(GameProfile $$0, bah $$1) throws cpr.b {
         return new yb(this.a, cpr.a($$1, $$0.getId(), this.b));
      }
   }
}
