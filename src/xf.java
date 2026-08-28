import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xf(UUID a, cpa b) {
   public xk a(Duration $$0) {
      return new xk.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xi.b a(UUID $$0) {
      return new xi($$0, this.a).a(this.b);
   }

   public xf.a a() {
      return new xf.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cpa d() {
      return this.b;
   }

   public static record a(UUID a, cpa.a b) {
      public static xf.a a(vl $$0) {
         return new xf.a($$0.n(), new cpa.a($$0));
      }

      public static void a(vl $$0, xf.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xf a(GameProfile $$0, azm $$1) throws cpa.b {
         return new xf(this.a, cpa.a($$1, $$0.getId(), this.b));
      }
   }
}
