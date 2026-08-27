import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record vx(UUID a, cft b) {
   public wc a(Duration $$0) {
      return new wc.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public wa.b a(UUID $$0) {
      return new wa($$0, this.a).a(this.b);
   }

   public vx.a a() {
      return new vx.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cft d() {
      return this.b;
   }

   public static record a(UUID a, cft.a b) {
      public static vx.a a(uj $$0) {
         return new vx.a($$0.p(), new cft.a($$0));
      }

      public static void a(uj $$0, vx.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public vx a(GameProfile $$0, avd $$1) throws cft.b {
         return new vx(this.a, cft.a($$1, $$0.getId(), this.b));
      }
   }
}
