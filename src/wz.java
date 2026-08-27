import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record wz(UUID a, ckd b) {
   public xe a(Duration $$0) {
      return new xe.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xc.b a(UUID $$0) {
      return new xc($$0, this.a).a(this.b);
   }

   public wz.a a() {
      return new wz.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public ckd d() {
      return this.b;
   }

   public static record a(UUID a, ckd.a b) {
      public static wz.a a(vi $$0) {
         return new wz.a($$0.n(), new ckd.a($$0));
      }

      public static void a(vi $$0, wz.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public wz a(GameProfile $$0, axy $$1) throws ckd.b {
         return new wz(this.a, ckd.a($$1, $$0.getId(), this.b));
      }
   }
}
