import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record wj(UUID a, cid b) {
   public wo a(Duration $$0) {
      return new wo.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public wm.b a(UUID $$0) {
      return new wm($$0, this.a).a(this.b);
   }

   public wj.a a() {
      return new wj.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cid d() {
      return this.b;
   }

   public static record a(UUID a, cid.a b) {
      public static wj.a a(us $$0) {
         return new wj.a($$0.n(), new cid.a($$0));
      }

      public static void a(us $$0, wj.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public wj a(GameProfile $$0, awy $$1) throws cid.b {
         return new wj(this.a, cid.a($$1, $$0.getId(), this.b));
      }
   }
}
