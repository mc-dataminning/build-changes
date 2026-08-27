import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xv(UUID a, cmb b) {
   public ya a(Duration $$0) {
      return new ya.a(this.b.a(), () -> this.b.b().a($$0));
   }

   public xy.b a(UUID $$0) {
      return new xy($$0, this.a).a(this.b);
   }

   public xv.a a() {
      return new xv.a(this.a, this.b.b());
   }

   public boolean b() {
      return this.b.b().a();
   }

   public UUID c() {
      return this.a;
   }

   public cmb d() {
      return this.b;
   }

   public static record a(UUID a, cmb.a b) {
      public static xv.a a(we $$0) {
         return new xv.a($$0.n(), new cmb.a($$0));
      }

      public static void a(we $$0, xv.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xv a(GameProfile $$0, ayy $$1) throws cmb.b {
         return new xv(this.a, cmb.a($$1, $$0.getId(), this.b));
      }
   }
}
