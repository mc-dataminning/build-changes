import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record wh(UUID a, chk b) {
   public wm a(Duration $$0) {
      return new wm.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public wk.b a(UUID $$0) {
      return new wk($$0, this.a).a(this.b);
   }

   public wh.a a() {
      return new wh.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public chk d() {
      return this.b;
   }

   public static record a(UUID a, chk.a b) {
      public static wh.a a(uq $$0) {
         return new wh.a($$0.p(), new chk.a($$0));
      }

      public static void a(uq $$0, wh.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public wh a(GameProfile $$0, awu $$1) throws chk.b {
         return new wh(this.a, chk.a($$1, $$0.getId(), this.b));
      }
   }
}
