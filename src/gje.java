import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class gje extends aqw {
   private so a;

   public gje(gjf $$0, io<ahq> $$1, egy $$2) {
      super($$0, $$1, $$2, 8);
      this.a(10);
   }

   @Override
   protected void b(anf $$0) {
      if (this.b().a($$0.fR())) {
         this.a = $$0.f(new so());
      }

      super.b($$0);
   }

   @Override
   public vg a(SocketAddress $$0, GameProfile $$1) {
      return (vg)(this.b().a($$1) && this.a($$1.getName()) != null ? vg.c("multiplayer.disconnect.name_taken") : super.a($$0, $$1));
   }

   public gjf b() {
      return (gjf)super.c();
   }

   @Override
   public so r() {
      return this.a;
   }
}
