import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class grc extends aue {
   private ua a;

   public grc(grd $$0, jd<akq> $$1, eoe $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqi $$0) {
      if (this.b().a($$0.fZ())) {
         this.a = $$0.f(new ua());
      }

      super.b($$0);
   }

   @Override
   public wu a(SocketAddress $$0, GameProfile $$1) {
      return (wu)(this.b().a($$1) && this.a($$1.getName()) != null ? wu.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public grd b() {
      return (grd)super.c();
   }

   @Override
   public ua r() {
      return this.a;
   }
}
