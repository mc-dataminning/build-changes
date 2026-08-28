import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xr(UUID a, csb b) {
   public xw a(Duration $$0) {
      return new xw.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xu.b a(UUID $$0) {
      return new xu($$0, this.a).a(this.b);
   }

   public xr.a a() {
      return new xr.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public csb d() {
      return this.b;
   }

   public static record a(UUID a, csb.a b) {
      public static xr.a a(vw $$0) {
         return new xr.a($$0.n(), new csb.a($$0));
      }

      public static void a(vw $$0, xr.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xr a(GameProfile $$0, bad $$1) throws csb.b {
         return new xr(this.a, csb.a($$1, $$0.getId(), this.b));
      }
   }
}
