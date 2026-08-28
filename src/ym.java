import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record ym(UUID a, cpv b) {
   public yr a(Duration $$0) {
      return new yr.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yp.b a(UUID $$0) {
      return new yp($$0, this.a).a(this.b);
   }

   public ym.a a() {
      return new ym.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cpv d() {
      return this.b;
   }

   public static record a(UUID a, cpv.a b) {
      public static ym.a a(ws $$0) {
         return new ym.a($$0.n(), new cpv.a($$0));
      }

      public static void a(ws $$0, ym.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public ym a(GameProfile $$0, bar $$1) throws cpv.b {
         return new ym(this.a, cpv.a($$1, $$0.getId(), this.b));
      }
   }
}
