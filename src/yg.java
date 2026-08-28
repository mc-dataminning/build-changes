import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record yg(UUID a, cnc b) {
   public yl a(Duration $$0) {
      return new yl.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yj.b a(UUID $$0) {
      return new yj($$0, this.a).a(this.b);
   }

   public yg.a a() {
      return new yg.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cnc d() {
      return this.b;
   }

   public static record a(UUID a, cnc.a b) {
      public static yg.a a(wm $$0) {
         return new yg.a($$0.n(), new cnc.a($$0));
      }

      public static void a(wm $$0, yg.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public yg a(GameProfile $$0, azm $$1) throws cnc.b {
         return new yg(this.a, cnc.a($$1, $$0.getId(), this.b));
      }
   }
}
