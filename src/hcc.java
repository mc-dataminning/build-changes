import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hcc extends avn {
   @Nullable
   private uj h;

   public hcc(hcd $$0, jw<alq> $$1, etn $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arn $$0) {
      if (this.b().a($$0.gj())) {
         this.h = $$0.f(new uj());
      }

      super.b($$0);
   }

   @Override
   public xh a(SocketAddress $$0, GameProfile $$1) {
      return (xh)(this.b().a($$1) && this.a($$1.getName()) != null ? xh.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hcd b() {
      return (hcd)super.c();
   }

   @Nullable
   @Override
   public uj r() {
      return this.h;
   }
}
