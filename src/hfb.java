import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hfb {
   private static final hfk[] a = new hfk[]{
      a("textures/entity/player/slim/alex.png", hfk.a.a),
      a("textures/entity/player/slim/ari.png", hfk.a.a),
      a("textures/entity/player/slim/efe.png", hfk.a.a),
      a("textures/entity/player/slim/kai.png", hfk.a.a),
      a("textures/entity/player/slim/makena.png", hfk.a.a),
      a("textures/entity/player/slim/noor.png", hfk.a.a),
      a("textures/entity/player/slim/steve.png", hfk.a.a),
      a("textures/entity/player/slim/sunny.png", hfk.a.a),
      a("textures/entity/player/slim/zuri.png", hfk.a.a),
      a("textures/entity/player/wide/alex.png", hfk.a.b),
      a("textures/entity/player/wide/ari.png", hfk.a.b),
      a("textures/entity/player/wide/efe.png", hfk.a.b),
      a("textures/entity/player/wide/kai.png", hfk.a.b),
      a("textures/entity/player/wide/makena.png", hfk.a.b),
      a("textures/entity/player/wide/noor.png", hfk.a.b),
      a("textures/entity/player/wide/steve.png", hfk.a.b),
      a("textures/entity/player/wide/sunny.png", hfk.a.b),
      a("textures/entity/player/wide/zuri.png", hfk.a.b)
   };

   public static aku a() {
      return b().a();
   }

   public static hfk b() {
      return a[6];
   }

   public static hfk a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hfk a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hfk a(String $$0, hfk.a $$1) {
      return new hfk(aku.b($$0), null, null, null, $$1, true);
   }
}
