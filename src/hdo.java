import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hdo extends avq {
   @Nullable
   private ul h;

   public hdo(hdp $$0, jx<als> $$1, eue $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arq $$0) {
      if (this.b().a($$0.gf())) {
         this.h = $$0.f(new ul());
      }

      super.b($$0);
   }

   @Override
   public xj a(SocketAddress $$0, GameProfile $$1) {
      return (xj)(this.b().a($$1) && this.a($$1.getName()) != null ? xj.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hdp b() {
      return (hdp)super.c();
   }

   @Nullable
   @Override
   public ul r() {
      return this.h;
   }
}
