import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record wl(UUID a, cix b) {
   public wq a(Duration $$0) {
      return new wq.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public wo.b a(UUID $$0) {
      return new wo($$0, this.a).a(this.b);
   }

   public wl.a a() {
      return new wl.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cix d() {
      return this.b;
   }

   public static record a(UUID a, cix.a b) {
      public static wl.a a(uu $$0) {
         return new wl.a($$0.n(), new cix.a($$0));
      }

      public static void a(uu $$0, wl.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public wl a(GameProfile $$0, axi $$1) throws cix.b {
         return new wl(this.a, cix.a($$1, $$0.getId(), this.b));
      }
   }
}
