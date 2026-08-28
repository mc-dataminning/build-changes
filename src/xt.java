import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xt(UUID a, csd b) {
   public xy a(Duration $$0) {
      return new xy.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xw.b a(UUID $$0) {
      return new xw($$0, this.a).a(this.b);
   }

   public xt.a a() {
      return new xt.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public csd d() {
      return this.b;
   }

   public static record a(UUID a, csd.a b) {
      public static xt.a a(vy $$0) {
         return new xt.a($$0.n(), new csd.a($$0));
      }

      public static void a(vy $$0, xt.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xt a(GameProfile $$0, baf $$1) throws csd.b {
         return new xt(this.a, csd.a($$1, $$0.getId(), this.b));
      }
   }
}
