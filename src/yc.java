import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record yc(UUID a, cou b) {
   public yh a(Duration $$0) {
      return new yh.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yf.b a(UUID $$0) {
      return new yf($$0, this.a).a(this.b);
   }

   public yc.a a() {
      return new yc.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cou d() {
      return this.b;
   }

   public static record a(UUID a, cou.a b) {
      public static yc.a a(wi $$0) {
         return new yc.a($$0.n(), new cou.a($$0));
      }

      public static void a(wi $$0, yc.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public yc a(GameProfile $$0, baa $$1) throws cou.b {
         return new yc(this.a, cou.a($$1, $$0.getId(), this.b));
      }
   }
}
