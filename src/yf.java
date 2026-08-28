import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record yf(UUID a, cmy b) {
   public yk a(Duration $$0) {
      return new yk.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yi.b a(UUID $$0) {
      return new yi($$0, this.a).a(this.b);
   }

   public yf.a a() {
      return new yf.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cmy d() {
      return this.b;
   }

   public static record a(UUID a, cmy.a b) {
      public static yf.a a(wl $$0) {
         return new yf.a($$0.n(), new cmy.a($$0));
      }

      public static void a(wl $$0, yf.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public yf a(GameProfile $$0, azk $$1) throws cmy.b {
         return new yf(this.a, cmy.a($$1, $$0.getId(), this.b));
      }
   }
}
