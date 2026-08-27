import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gvc extends auq {
   private uk a;

   public gvc(gvd $$0, jh<alc> $$1, eri $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqu $$0) {
      if (this.b().a($$0.gk())) {
         this.a = $$0.f(new uk());
      }

      super.b($$0);
   }

   @Override
   public xe a(SocketAddress $$0, GameProfile $$1) {
      return (xe)(this.b().a($$1) && this.a($$1.getName()) != null ? xe.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gvd b() {
      return (gvd)super.c();
   }

   @Override
   public uk r() {
      return this.a;
   }
}
