import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import javax.annotation.Nullable;

public class hmj extends avo {
   @Nullable
   private tx h;

   public hmj(hmk $$0, jl<aln> $$1, eye $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(arp $$0) {
      if (this.b().a($$0.gh())) {
         this.h = $$0.f(new tx());
      }

      super.b($$0);
   }

   @Override
   public ww a(SocketAddress $$0, GameProfile $$1) {
      return (ww)(this.b().a($$1) && this.a($$1.getName()) != null ? ww.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public hmk b() {
      return (hmk)super.c();
   }

   @Nullable
   @Override
   public tx r() {
      return this.h;
   }
}
