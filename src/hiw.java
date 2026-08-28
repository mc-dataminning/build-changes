import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hiw extends avc {
   @Nullable
   private tq h;

   public hiw(hix $$0, jy<ald> $$1, evg $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(ard $$0) {
      if (this.b().a($$0.gh())) {
         this.h = $$0.f(new tq());
      }

      super.b($$0);
   }

   @Override
   public wo a(SocketAddress $$0, GameProfile $$1) {
      return (wo)(this.b().a($$1) && this.a($$1.getName()) != null ? wo.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hix b() {
      return (hix)super.c();
   }

   @Nullable
   @Override
   public tq r() {
      return this.h;
   }
}
