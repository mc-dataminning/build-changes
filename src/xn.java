import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xn(UUID a, cqv b) {
   public xs a(Duration $$0) {
      return new xs.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xq.b a(UUID $$0) {
      return new xq($$0, this.a).a(this.b);
   }

   public xn.a a() {
      return new xn.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cqv d() {
      return this.b;
   }

   public static record a(UUID a, cqv.a b) {
      public static xn.a a(vs $$0) {
         return new xn.a($$0.n(), new cqv.a($$0));
      }

      public static void a(vs $$0, xn.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xn a(GameProfile $$0, azz $$1) throws cqv.b {
         return new xn(this.a, cqv.a($$1, $$0.getId(), this.b));
      }
   }
}
