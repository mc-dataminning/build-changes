import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record uz(UUID a, cda b) {
   public ve a(Duration $$0) {
      return new ve.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public vc.b a(UUID $$0) {
      return new vc($$0, this.a).a(this.b);
   }

   public uz.a a() {
      return new uz.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cda d() {
      return this.b;
   }

   public static record a(UUID a, cda.a b) {
      public static uz.a a(tl $$0) {
         return new uz.a($$0.p(), new cda.a($$0));
      }

      public static void a(tl $$0, uz.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public uz a(GameProfile $$0, atj $$1) throws cda.b {
         return new uz(this.a, cda.a($$1, $$0.getId(), this.b));
      }
   }
}
