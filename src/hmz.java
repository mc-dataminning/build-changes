import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hmz extends avq {
   @Nullable
   private tz h;

   public hmz(hna $$0, jl<alp> $$1, eyq $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arr $$0) {
      if (this.b().a($$0.gh())) {
         this.h = $$0.f(new tz());
      }

      super.b($$0);
   }

   @Override
   public wy a(SocketAddress $$0, GameProfile $$1) {
      return (wy)(this.b().a($$1) && this.a($$1.getName()) != null ? wy.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hna b() {
      return (hna)super.c();
   }

   @Nullable
   @Override
   public tz r() {
      return this.h;
   }
}
