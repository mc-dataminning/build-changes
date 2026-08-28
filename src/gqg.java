import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gqg {
   private static final gqo[] a = new gqo[]{
      a("textures/entity/player/slim/alex.png", gqo.a.a),
      a("textures/entity/player/slim/ari.png", gqo.a.a),
      a("textures/entity/player/slim/efe.png", gqo.a.a),
      a("textures/entity/player/slim/kai.png", gqo.a.a),
      a("textures/entity/player/slim/makena.png", gqo.a.a),
      a("textures/entity/player/slim/noor.png", gqo.a.a),
      a("textures/entity/player/slim/steve.png", gqo.a.a),
      a("textures/entity/player/slim/sunny.png", gqo.a.a),
      a("textures/entity/player/slim/zuri.png", gqo.a.a),
      a("textures/entity/player/wide/alex.png", gqo.a.b),
      a("textures/entity/player/wide/ari.png", gqo.a.b),
      a("textures/entity/player/wide/efe.png", gqo.a.b),
      a("textures/entity/player/wide/kai.png", gqo.a.b),
      a("textures/entity/player/wide/makena.png", gqo.a.b),
      a("textures/entity/player/wide/noor.png", gqo.a.b),
      a("textures/entity/player/wide/steve.png", gqo.a.b),
      a("textures/entity/player/wide/sunny.png", gqo.a.b),
      a("textures/entity/player/wide/zuri.png", gqo.a.b)
   };

   public static akk a() {
      return a[6].a();
   }

   public static gqo a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gqo a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gqo a(String $$0, gqo.a $$1) {
      return new gqo(new akk($$0), null, null, null, $$1, true);
   }
}
