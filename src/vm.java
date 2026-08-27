import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record vm(UUID a, cec b) {
   public vr a(Duration $$0) {
      return new vr.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public vp.b a(UUID $$0) {
      return new vp($$0, this.a).a(this.b);
   }

   public vm.a a() {
      return new vm.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cec d() {
      return this.b;
   }

   public static record a(UUID a, cec.a b) {
      public static vm.a a(ty $$0) {
         return new vm.a($$0.p(), new cec.a($$0));
      }

      public static void a(ty $$0, vm.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public vm a(GameProfile $$0, auc $$1) throws cec.b {
         return new vm(this.a, cec.a($$1, $$0.getId(), this.b));
      }
   }
}
