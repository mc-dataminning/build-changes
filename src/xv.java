import com.mojang.authlib.GameProfile;
import java.time.Duration;
import java.util.UUID;

public record xv(UUID a, coa b) {
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

   public coa d() {
      return this.b;
   }

   public static record a(UUID a, coa.a b) {
      public static xv.a a(wb $$0) {
         return new xv.a($$0.n(), new coa.a($$0));
      }

      public static void a(wb $$0, xv.a $$1) {
         $$0.a($$1.a);
         $$1.b.a($$0);
      }

      public xv a(GameProfile $$0, azs $$1) throws coa.b {
         return new xv(this.a, coa.a($$1, $$0.getId(), this.b));
      }
   }
}
