import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gpq {
   private static final gpy[] a = new gpy[]{
      a("textures/entity/player/slim/alex.png", gpy.a.a),
      a("textures/entity/player/slim/ari.png", gpy.a.a),
      a("textures/entity/player/slim/efe.png", gpy.a.a),
      a("textures/entity/player/slim/kai.png", gpy.a.a),
      a("textures/entity/player/slim/makena.png", gpy.a.a),
      a("textures/entity/player/slim/noor.png", gpy.a.a),
      a("textures/entity/player/slim/steve.png", gpy.a.a),
      a("textures/entity/player/slim/sunny.png", gpy.a.a),
      a("textures/entity/player/slim/zuri.png", gpy.a.a),
      a("textures/entity/player/wide/alex.png", gpy.a.b),
      a("textures/entity/player/wide/ari.png", gpy.a.b),
      a("textures/entity/player/wide/efe.png", gpy.a.b),
      a("textures/entity/player/wide/kai.png", gpy.a.b),
      a("textures/entity/player/wide/makena.png", gpy.a.b),
      a("textures/entity/player/wide/noor.png", gpy.a.b),
      a("textures/entity/player/wide/steve.png", gpy.a.b),
      a("textures/entity/player/wide/sunny.png", gpy.a.b),
      a("textures/entity/player/wide/zuri.png", gpy.a.b)
   };

   public static ale a() {
      return a[6].a();
   }

   public static gpy a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gpy a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gpy a(String $$0, gpy.a $$1) {
      return new gpy(new ale($$0), null, null, null, $$1, true);
   }
}
