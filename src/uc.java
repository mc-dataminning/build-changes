import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record uc(UUID a, ccd b) {
   public uh a(Duration $$0) {
      return new uh.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public uf.b a(UUID $$0) {
      return new uf($$0, this.a).a(this.b);
   }

   public uc.a a() {
      return new uc.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public ccd d() {
      return this.b;
   }

   public static record a(UUID a, ccd.a b) {
      public static uc.a a(so $$0) {
         return new uc.a($$0.p(), new ccd.a($$0));
      }

      public static void a(so $$0, uc.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public uc a(GameProfile $$0, asm $$1) throws ccd.b {
         return new uc(this.a, ccd.a($$1, $$0.getId(), this.b));
      }
   }
}
