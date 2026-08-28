import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hpm extends avu {
   @Nullable
   private ua h;

   public hpm(hpn $$0, jn<alt> $$1, faa $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arv $$0) {
      if (this.b().a($$0.gi())) {
         this.h = $$0.h(new ua());
      }

      super.b($$0);
   }

   @Override
   public xc a(SocketAddress $$0, GameProfile $$1) {
      return (xc)(this.b().a($$1) && this.a($$1.getName()) != null ? xc.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hpn b() {
      return (hpn)super.c();
   }

   @Nullable
   @Override
   public ua r() {
      return this.h;
   }
}
