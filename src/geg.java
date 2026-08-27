import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class geg {
   private static final geo[] a = new geo[]{
      a("textures/entity/player/slim/alex.png", geo.a.a),
      a("textures/entity/player/slim/ari.png", geo.a.a),
      a("textures/entity/player/slim/efe.png", geo.a.a),
      a("textures/entity/player/slim/kai.png", geo.a.a),
      a("textures/entity/player/slim/makena.png", geo.a.a),
      a("textures/entity/player/slim/noor.png", geo.a.a),
      a("textures/entity/player/slim/steve.png", geo.a.a),
      a("textures/entity/player/slim/sunny.png", geo.a.a),
      a("textures/entity/player/slim/zuri.png", geo.a.a),
      a("textures/entity/player/wide/alex.png", geo.a.b),
      a("textures/entity/player/wide/ari.png", geo.a.b),
      a("textures/entity/player/wide/efe.png", geo.a.b),
      a("textures/entity/player/wide/kai.png", geo.a.b),
      a("textures/entity/player/wide/makena.png", geo.a.b),
      a("textures/entity/player/wide/noor.png", geo.a.b),
      a("textures/entity/player/wide/steve.png", geo.a.b),
      a("textures/entity/player/wide/sunny.png", geo.a.b),
      a("textures/entity/player/wide/zuri.png", geo.a.b)
   };

   public static agt a() {
      return a[6].a();
   }

   public static geo a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static geo a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static geo a(String $$0, geo.a $$1) {
      return new geo(new agt($$0), null, null, null, $$1, true);
   }
}
