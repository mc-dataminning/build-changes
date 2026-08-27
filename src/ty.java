import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record ty(UUID a, cbs b) {
   public ud a(Duration $$0) {
      return new ud.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public ub.b a(UUID $$0) {
      return new ub($$0, this.a).a(this.b);
   }

   public ty.a a() {
      return new ty.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cbs d() {
      return this.b;
   }

   public static record a(UUID a, cbs.a b) {
      public static ty.a a(sl $$0) {
         return new ty.a($$0.o(), new cbs.a($$0));
      }

      public static void a(sl $$0, ty.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public ty a(GameProfile $$0, asc $$1) throws cbs.b {
         return new ty(this.a, cbs.a($$1, $$0.getId(), this.b));
      }
   }
}
