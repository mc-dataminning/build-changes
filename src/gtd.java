import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class gtd extends avd {
   @Nullable
   private us h;

   public gtd(gte $$0, jp<alo> $$1, epz $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arg $$0) {
      if (this.b().a($$0.gb())) {
         this.h = $$0.f(new us());
      }

      super.b($$0);
   }

   @Override
   public xp a(SocketAddress $$0, GameProfile $$1) {
      return (xp)(this.b().a($$1) && this.a($$1.getName()) != null ? xp.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gte b() {
      return (gte)super.c();
   }

   @Nullable
   @Override
   public us r() {
      return this.h;
   }
}
