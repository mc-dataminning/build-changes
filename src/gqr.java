import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gqr extends aub {
   private ty a;

   public gqr(gqs $$0, jc<ako> $$1, ent $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqf $$0) {
      if (this.b().a($$0.fZ())) {
         this.a = $$0.f(new ty());
      }

      super.b($$0);
   }

   @Override
   public ws a(SocketAddress $$0, GameProfile $$1) {
      return (ws)(this.b().a($$1) && this.a($$1.getName()) != null ? ws.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gqs b() {
      return (gqs)super.c();
   }

   @Override
   public ty r() {
      return this.a;
   }
}
