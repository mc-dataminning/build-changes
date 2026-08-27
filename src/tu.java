import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record tu(UUID a, cbo b) {
   public tz a() {
      return new tz.a(this.b.a());
   }

   public tx.b a(UUID $$0) {
      return new tx($$0, this.a).a(this.b);
   }

   public tu.a b() {
      return new tu.a(this.a, this.b.b());
   }

   public boolean c() {
      return this.b.b().a();
   }

   public UUID d() {
      return this.a;
   }

   public cbo e() {
      return this.b;
   }

   public static record a(UUID a, cbo.a b) {
      public static tu.a a(sh $$0) {
         return new tu.a($$0.o(), new cbo.a($$0));
      }

      public static void a(sh $$0, tu.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public tu a(GameProfile $$0, arx $$1, Duration $$2) throws cbo.b {
         return new tu(this.a, cbo.a($$1, $$0.getId(), this.b, $$2));
      }
   }
}
