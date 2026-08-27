import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record vi(UUID a, cdx b) {
   public vn a(Duration $$0) {
      return new vn.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public vl.b a(UUID $$0) {
      return new vl($$0, this.a).a(this.b);
   }

   public vi.a a() {
      return new vi.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cdx d() {
      return this.b;
   }

   public static record a(UUID a, cdx.a b) {
      public static vi.a a(tu $$0) {
         return new vi.a($$0.p(), new cdx.a($$0));
      }

      public static void a(tu $$0, vi.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public vi a(GameProfile $$0, aty $$1) throws cdx.b {
         return new vi(this.a, cdx.a($$1, $$0.getId(), this.b));
      }
   }
}
