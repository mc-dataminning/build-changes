import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record ub(UUID a, cbx b) {
   public ug a(Duration $$0) {
      return new ug.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public ue.b a(UUID $$0) {
      return new ue($$0, this.a).a(this.b);
   }

   public ub.a a() {
      return new ub.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cbx d() {
      return this.b;
   }

   public static record a(UUID a, cbx.a b) {
      public static ub.a a(so $$0) {
         return new ub.a($$0.o(), new cbx.a($$0));
      }

      public static void a(so $$0, ub.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public ub a(GameProfile $$0, ash $$1) throws cbx.b {
         return new ub(this.a, cbx.a($$1, $$0.getId(), this.b));
      }
   }
}
