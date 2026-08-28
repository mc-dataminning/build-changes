import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xg(UUID a, cpa b) {
   public xl a(Duration $$0) {
      return new xl.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xj.b a(UUID $$0) {
      return new xj($$0, this.a).a(this.b);
   }

   public xg.a a() {
      return new xg.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cpa d() {
      return this.b;
   }

   public static record a(UUID a, cpa.a b) {
      public static xg.a a(vl $$0) {
         return new xg.a($$0.n(), new cpa.a($$0));
      }

      public static void a(vl $$0, xg.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xg a(GameProfile $$0, azm $$1) throws cpa.b {
         return new xg(this.a, cpa.a($$1, $$0.getId(), this.b));
      }
   }
}
