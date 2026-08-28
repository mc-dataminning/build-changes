import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hfm {
   private static final hfv[] a = new hfv[]{
      a("textures/entity/player/slim/alex.png", hfv.a.a),
      a("textures/entity/player/slim/ari.png", hfv.a.a),
      a("textures/entity/player/slim/efe.png", hfv.a.a),
      a("textures/entity/player/slim/kai.png", hfv.a.a),
      a("textures/entity/player/slim/makena.png", hfv.a.a),
      a("textures/entity/player/slim/noor.png", hfv.a.a),
      a("textures/entity/player/slim/steve.png", hfv.a.a),
      a("textures/entity/player/slim/sunny.png", hfv.a.a),
      a("textures/entity/player/slim/zuri.png", hfv.a.a),
      a("textures/entity/player/wide/alex.png", hfv.a.b),
      a("textures/entity/player/wide/ari.png", hfv.a.b),
      a("textures/entity/player/wide/efe.png", hfv.a.b),
      a("textures/entity/player/wide/kai.png", hfv.a.b),
      a("textures/entity/player/wide/makena.png", hfv.a.b),
      a("textures/entity/player/wide/noor.png", hfv.a.b),
      a("textures/entity/player/wide/steve.png", hfv.a.b),
      a("textures/entity/player/wide/sunny.png", hfv.a.b),
      a("textures/entity/player/wide/zuri.png", hfv.a.b)
   };

   public static akv a() {
      return b().a();
   }

   public static hfv b() {
      return a[6];
   }

   public static hfv a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hfv a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hfv a(String $$0, hfv.a $$1) {
      return new hfv(akv.b($$0), null, null, null, $$1, true);
   }
}
