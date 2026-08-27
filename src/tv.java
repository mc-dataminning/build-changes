import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record tv(UUID a, cbq b) {
   public ua a(Duration $$0) {
      return new ua.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public ty.b a(UUID $$0) {
      return new ty($$0, this.a).a(this.b);
   }

   public tv.a a() {
      return new tv.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cbq d() {
      return this.b;
   }

   public static record a(UUID a, cbq.a b) {
      public static tv.a a(si $$0) {
         return new tv.a($$0.o(), new cbq.a($$0));
      }

      public static void a(si $$0, tv.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public tv a(GameProfile $$0, arz $$1) throws cbq.b {
         return new tv(this.a, cbq.a($$1, $$0.getId(), this.b));
      }
   }
}
