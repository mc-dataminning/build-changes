import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class gug extends auq {
   @Nullable
   private ua h;

   public gug(guh $$0, jt<akz> $$1, erc $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aqu $$0) {
      if (this.b().a($$0.fY())) {
         this.h = $$0.f(new ua());
      }

      super.b($$0);
   }

   @Override
   public wy a(SocketAddress $$0, GameProfile $$1) {
      return (wy)(this.b().a($$1) && this.a($$1.getName()) != null ? wy.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public guh b() {
      return (guh)super.c();
   }

   @Nullable
   @Override
   public ua r() {
      return this.h;
   }
}
