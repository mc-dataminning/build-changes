import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xz(UUID a, coq b) {
   public ye a(Duration $$0) {
      return new ye.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public yc.b a(UUID $$0) {
      return new yc($$0, this.a).a(this.b);
   }

   public xz.a a() {
      return new xz.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public coq d() {
      return this.b;
   }

   public static record a(UUID a, coq.a b) {
      public static xz.a a(wf $$0) {
         return new xz.a($$0.n(), new coq.a($$0));
      }

      public static void a(wf $$0, xz.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xz a(GameProfile $$0, azx $$1) throws coq.b {
         return new xz(this.a, coq.a($$1, $$0.getId(), this.b));
      }
   }
}
