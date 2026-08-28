import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record ya(UUID a, cox b) {
   public yf a(Duration $$0) {
      return new yf.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yd.b a(UUID $$0) {
      return new yd($$0, this.a).a(this.b);
   }

   public ya.a a() {
      return new ya.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cox d() {
      return this.b;
   }

   public static record a(UUID a, cox.a b) {
      public static ya.a a(wg $$0) {
         return new ya.a($$0.n(), new cox.a($$0));
      }

      public static void a(wg $$0, ya.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public ya a(GameProfile $$0, azz $$1) throws cox.b {
         return new ya(this.a, cox.a($$1, $$0.getId(), this.b));
      }
   }
}
