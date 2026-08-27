import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record vu(UUID a, cfe b) {
   public vz a(Duration $$0) {
      return new vz.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public vx.b a(UUID $$0) {
      return new vx($$0, this.a).a(this.b);
   }

   public vu.a a() {
      return new vu.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cfe d() {
      return this.b;
   }

   public static record a(UUID a, cfe.a b) {
      public static vu.a a(ug $$0) {
         return new vu.a($$0.p(), new cfe.a($$0));
      }

      public static void a(ug $$0, vu.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public vu a(GameProfile $$0, auv $$1) throws cfe.b {
         return new vu(this.a, cfe.a($$1, $$0.getId(), this.b));
      }
   }
}
