import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xx(UUID a, csm b) {
   public yc a(Duration $$0) {
      return new yc.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public ya.b a(UUID $$0) {
      return new ya($$0, this.a).a(this.b);
   }

   public xx.a a() {
      return new xx.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public csm d() {
      return this.b;
   }

   public static record a(UUID a, csm.a b) {
      public static xx.a a(vy $$0) {
         return new xx.a($$0.n(), new csm.a($$0));
      }

      public static void a(vy $$0, xx.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xx a(GameProfile $$0, bao $$1) throws csm.b {
         return new xx(this.a, csm.a($$1, $$0.getId(), this.b));
      }
   }
}
