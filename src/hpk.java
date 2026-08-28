import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hpk extends avs {
   @Nullable
   private tz h;

   public hpk(hpl $$0, jm<alr> $$1, ezy $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(art $$0) {
      if (this.b().a($$0.gi())) {
         this.h = $$0.h(new tz());
      }

      super.b($$0);
   }

   @Override
   public xa a(SocketAddress $$0, GameProfile $$1) {
      return (xa)(this.b().a($$1) && this.a($$1.getName()) != null ? xa.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hpl b() {
      return (hpl)super.c();
   }

   @Nullable
   @Override
   public tz r() {
      return this.h;
   }
}
