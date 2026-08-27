import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record vs(UUID a, ceu b) {
   public vx a(Duration $$0) {
      return new vx.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public vv.b a(UUID $$0) {
      return new vv($$0, this.a).a(this.b);
   }

   public vs.a a() {
      return new vs.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public ceu d() {
      return this.b;
   }

   public static record a(UUID a, ceu.a b) {
      public static vs.a a(ue $$0) {
         return new vs.a($$0.p(), new ceu.a($$0));
      }

      public static void a(ue $$0, vs.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public vs a(GameProfile $$0, aul $$1) throws ceu.b {
         return new vs(this.a, ceu.a($$1, $$0.getId(), this.b));
      }
   }
}
