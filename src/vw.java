import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record vw(UUID a, cfl b) {
   public wb a(Duration $$0) {
      return new wb.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public vz.b a(UUID $$0) {
      return new vz($$0, this.a).a(this.b);
   }

   public vw.a a() {
      return new vw.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cfl d() {
      return this.b;
   }

   public static record a(UUID a, cfl.a b) {
      public static vw.a a(ui $$0) {
         return new vw.a($$0.p(), new cfl.a($$0));
      }

      public static void a(ui $$0, vw.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public vw a(GameProfile $$0, avc $$1) throws cfl.b {
         return new vw(this.a, cfl.a($$1, $$0.getId(), this.b));
      }
   }
}
