import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xj(UUID a, cko b) {
   public xo a(Duration $$0) {
      return new xo.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xm.b a(UUID $$0) {
      return new xm($$0, this.a).a(this.b);
   }

   public xj.a a() {
      return new xj.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cko d() {
      return this.b;
   }

   public static record a(UUID a, cko.a b) {
      public static xj.a a(vs $$0) {
         return new xj.a($$0.n(), new cko.a($$0));
      }

      public static void a(vs $$0, xj.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xj a(GameProfile $$0, ayi $$1) throws cko.b {
         return new xj(this.a, cko.a($$1, $$0.getId(), this.b));
      }
   }
}
