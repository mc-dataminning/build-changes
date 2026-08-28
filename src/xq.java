import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xq(UUID a, cna b) {
   public xv a(Duration $$0) {
      return new xv.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xt.b a(UUID $$0) {
      return new xt($$0, this.a).a(this.b);
   }

   public xq.a a() {
      return new xq.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cna d() {
      return this.b;
   }

   public static record a(UUID a, cna.a b) {
      public static xq.a a(vw $$0) {
         return new xq.a($$0.n(), new cna.a($$0));
      }

      public static void a(vw $$0, xq.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xq a(GameProfile $$0, azb $$1) throws cna.b {
         return new xq(this.a, cna.a($$1, $$0.getId(), this.b));
      }
   }
}
