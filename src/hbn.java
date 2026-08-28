import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hbn extends avj {
   @Nullable
   private ug h;

   public hbn(hbo $$0, jv<aln> $$1, etc $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(ark $$0) {
      if (this.b().a($$0.gc())) {
         this.h = $$0.f(new ug());
      }

      super.b($$0);
   }

   @Override
   public xe a(SocketAddress $$0, GameProfile $$1) {
      return (xe)(this.b().a($$1) && this.a($$1.getName()) != null ? xe.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hbo b() {
      return (hbo)super.c();
   }

   @Nullable
   @Override
   public ug r() {
      return this.h;
   }
}
