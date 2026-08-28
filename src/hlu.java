import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hlu {
   private static final hme[] a = new hme[]{
      a("textures/entity/player/slim/alex.png", hme.a.a),
      a("textures/entity/player/slim/ari.png", hme.a.a),
      a("textures/entity/player/slim/efe.png", hme.a.a),
      a("textures/entity/player/slim/kai.png", hme.a.a),
      a("textures/entity/player/slim/makena.png", hme.a.a),
      a("textures/entity/player/slim/noor.png", hme.a.a),
      a("textures/entity/player/slim/steve.png", hme.a.a),
      a("textures/entity/player/slim/sunny.png", hme.a.a),
      a("textures/entity/player/slim/zuri.png", hme.a.a),
      a("textures/entity/player/wide/alex.png", hme.a.b),
      a("textures/entity/player/wide/ari.png", hme.a.b),
      a("textures/entity/player/wide/efe.png", hme.a.b),
      a("textures/entity/player/wide/kai.png", hme.a.b),
      a("textures/entity/player/wide/makena.png", hme.a.b),
      a("textures/entity/player/wide/noor.png", hme.a.b),
      a("textures/entity/player/wide/steve.png", hme.a.b),
      a("textures/entity/player/wide/sunny.png", hme.a.b),
      a("textures/entity/player/wide/zuri.png", hme.a.b)
   };

   public static alk a() {
      return b().a();
   }

   public static hme b() {
      return a[6];
   }

   public static hme a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hme a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hme a(String $$0, hme.a $$1) {
      return new hme(alk.b($$0), null, null, null, $$1, true);
   }
}
