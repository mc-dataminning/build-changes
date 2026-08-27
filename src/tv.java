import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record tv(UUID a, cbp b) {
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

   public cbp d() {
      return this.b;
   }

   public static record a(UUID a, cbp.a b) {
      public static tv.a a(si $$0) {
         return new tv.a($$0.o(), new cbp.a($$0));
      }

      public static void a(si $$0, tv.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public tv a(GameProfile $$0, arz $$1) throws cbp.b {
         return new tv(this.a, cbp.a($$1, $$0.getId(), this.b));
      }
   }
}
