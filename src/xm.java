import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xm(UUID a, cql b) {
   public xr a(Duration $$0) {
      return new xr.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xp.b a(UUID $$0) {
      return new xp($$0, this.a).a(this.b);
   }

   public xm.a a() {
      return new xm.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cql d() {
      return this.b;
   }

   public static record a(UUID a, cql.a b) {
      public static xm.a a(vr $$0) {
         return new xm.a($$0.n(), new cql.a($$0));
      }

      public static void a(vr $$0, xm.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xm a(GameProfile $$0, azx $$1) throws cql.b {
         return new xm(this.a, cql.a($$1, $$0.getId(), this.b));
      }
   }
}
