import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gdy extends apg {
   private rt a;

   public gdy(gdz $$0, ij<agf> $$1, edb $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(alr $$0) {
      if (this.b().a($$0.fR())) {
         this.a = $$0.f(new rt());
      }

      super.b($$0);
   }

   @Override
   public ui a(SocketAddress $$0, GameProfile $$1) {
      return (ui)(this.b().a($$1) && this.a($$1.getName()) != null ? ui.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gdz b() {
      return (gdz)super.c();
   }

   @Override
   public rt r() {
      return this.a;
   }
}
