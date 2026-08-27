import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record ud(UUID a, cbz b) {
   public ui a(Duration $$0) {
      return new ui.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public ug.b a(UUID $$0) {
      return new ug($$0, this.a).a(this.b);
   }

   public ud.a a() {
      return new ud.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cbz d() {
      return this.b;
   }

   public static record a(UUID a, cbz.a b) {
      public static ud.a a(sq $$0) {
         return new ud.a($$0.o(), new cbz.a($$0));
      }

      public static void a(sq $$0, ud.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public ud a(GameProfile $$0, asj $$1) throws cbz.b {
         return new ud(this.a, cbz.a($$1, $$0.getId(), this.b));
      }
   }
}
