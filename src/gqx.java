import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gqx {
   private static final grf[] a = new grf[]{
      a("textures/entity/player/slim/alex.png", grf.a.a),
      a("textures/entity/player/slim/ari.png", grf.a.a),
      a("textures/entity/player/slim/efe.png", grf.a.a),
      a("textures/entity/player/slim/kai.png", grf.a.a),
      a("textures/entity/player/slim/makena.png", grf.a.a),
      a("textures/entity/player/slim/noor.png", grf.a.a),
      a("textures/entity/player/slim/steve.png", grf.a.a),
      a("textures/entity/player/slim/sunny.png", grf.a.a),
      a("textures/entity/player/slim/zuri.png", grf.a.a),
      a("textures/entity/player/wide/alex.png", grf.a.b),
      a("textures/entity/player/wide/ari.png", grf.a.b),
      a("textures/entity/player/wide/efe.png", grf.a.b),
      a("textures/entity/player/wide/kai.png", grf.a.b),
      a("textures/entity/player/wide/makena.png", grf.a.b),
      a("textures/entity/player/wide/noor.png", grf.a.b),
      a("textures/entity/player/wide/steve.png", grf.a.b),
      a("textures/entity/player/wide/sunny.png", grf.a.b),
      a("textures/entity/player/wide/zuri.png", grf.a.b)
   };

   public static akq a() {
      return a[6].a();
   }

   public static grf a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static grf a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static grf a(String $$0, grf.a $$1) {
      return new grf(akq.b($$0), null, null, null, $$1, true);
   }
}
