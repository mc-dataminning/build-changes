import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hcb {
   private static final hck[] a = new hck[]{
      a("textures/entity/player/slim/alex.png", hck.a.a),
      a("textures/entity/player/slim/ari.png", hck.a.a),
      a("textures/entity/player/slim/efe.png", hck.a.a),
      a("textures/entity/player/slim/kai.png", hck.a.a),
      a("textures/entity/player/slim/makena.png", hck.a.a),
      a("textures/entity/player/slim/noor.png", hck.a.a),
      a("textures/entity/player/slim/steve.png", hck.a.a),
      a("textures/entity/player/slim/sunny.png", hck.a.a),
      a("textures/entity/player/slim/zuri.png", hck.a.a),
      a("textures/entity/player/wide/alex.png", hck.a.b),
      a("textures/entity/player/wide/ari.png", hck.a.b),
      a("textures/entity/player/wide/efe.png", hck.a.b),
      a("textures/entity/player/wide/kai.png", hck.a.b),
      a("textures/entity/player/wide/makena.png", hck.a.b),
      a("textures/entity/player/wide/noor.png", hck.a.b),
      a("textures/entity/player/wide/steve.png", hck.a.b),
      a("textures/entity/player/wide/sunny.png", hck.a.b),
      a("textures/entity/player/wide/zuri.png", hck.a.b)
   };

   public static alz a() {
      return b().a();
   }

   public static hck b() {
      return a[6];
   }

   public static hck a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hck a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hck a(String $$0, hck.a $$1) {
      return new hck(alz.b($$0), null, null, null, $$1, true);
   }
}
