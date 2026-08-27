import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gfd {
   private static final gfk[] a = new gfk[]{
      a("textures/entity/player/slim/alex.png", gfk.a.a),
      a("textures/entity/player/slim/ari.png", gfk.a.a),
      a("textures/entity/player/slim/efe.png", gfk.a.a),
      a("textures/entity/player/slim/kai.png", gfk.a.a),
      a("textures/entity/player/slim/makena.png", gfk.a.a),
      a("textures/entity/player/slim/noor.png", gfk.a.a),
      a("textures/entity/player/slim/steve.png", gfk.a.a),
      a("textures/entity/player/slim/sunny.png", gfk.a.a),
      a("textures/entity/player/slim/zuri.png", gfk.a.a),
      a("textures/entity/player/wide/alex.png", gfk.a.b),
      a("textures/entity/player/wide/ari.png", gfk.a.b),
      a("textures/entity/player/wide/efe.png", gfk.a.b),
      a("textures/entity/player/wide/kai.png", gfk.a.b),
      a("textures/entity/player/wide/makena.png", gfk.a.b),
      a("textures/entity/player/wide/noor.png", gfk.a.b),
      a("textures/entity/player/wide/steve.png", gfk.a.b),
      a("textures/entity/player/wide/sunny.png", gfk.a.b),
      a("textures/entity/player/wide/zuri.png", gfk.a.b)
   };

   public static ahg a() {
      return a[6].a();
   }

   public static gfk a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gfk a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gfk a(String $$0, gfk.a $$1) {
      return new gfk(new ahg($$0), null, null, null, $$1, true);
   }
}
