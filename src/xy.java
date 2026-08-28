import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xy(UUID a, cok b) {
   public yd a(Duration $$0) {
      return new yd.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yb.b a(UUID $$0) {
      return new yb($$0, this.a).a(this.b);
   }

   public xy.a a() {
      return new xy.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cok d() {
      return this.b;
   }

   public static record a(UUID a, cok.a b) {
      public static xy.a a(we $$0) {
         return new xy.a($$0.n(), new cok.a($$0));
      }

      public static void a(we $$0, xy.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xy a(GameProfile $$0, azw $$1) throws cok.b {
         return new xy(this.a, cok.a($$1, $$0.getId(), this.b));
      }
   }
}
