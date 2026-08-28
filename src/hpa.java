import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hpa extends awb {
   @Nullable
   private ua h;

   public hpa(hpb $$0, jn<ama> $$1, fak $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(asc $$0) {
      if (this.b().a($$0.gi())) {
         this.h = $$0.h(new ua());
      }

      super.b($$0);
   }

   @Override
   public xg a(SocketAddress $$0, GameProfile $$1) {
      return (xg)(this.b().a($$1) && this.a($$1.getName()) != null ? xg.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hpb b() {
      return (hpb)super.c();
   }

   @Nullable
   @Override
   public ua r() {
      return this.h;
   }
}
