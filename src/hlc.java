import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hlc extends avn {
   @Nullable
   private tw h;

   public hlc(hld $$0, jz<alm> $$1, exc $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(aro $$0) {
      if (this.b().a($$0.gh())) {
         this.h = $$0.f(new tw());
      }

      super.b($$0);
   }

   @Override
   public wv a(SocketAddress $$0, GameProfile $$1) {
      return (wv)(this.b().a($$1) && this.a($$1.getName()) != null ? wv.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hld b() {
      return (hld)super.c();
   }

   @Nullable
   @Override
   public tw r() {
      return this.h;
   }
}
