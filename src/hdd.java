import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hdd extends avr {
   @Nullable
   private un h;

   public hdd(hde $$0, jx<alu> $$1, etx $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arr $$0) {
      if (this.b().a($$0.gk())) {
         this.h = $$0.f(new un());
      }

      super.b($$0);
   }

   @Override
   public xl a(SocketAddress $$0, GameProfile $$1) {
      return (xl)(this.b().a($$1) && this.a($$1.getName()) != null ? xl.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hde b() {
      return (hde)super.c();
   }

   @Nullable
   @Override
   public un r() {
      return this.h;
   }
}
