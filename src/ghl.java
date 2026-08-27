import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class ghl {
   private static final ghs[] a = new ghs[]{
      a("textures/entity/player/slim/alex.png", ghs.a.a),
      a("textures/entity/player/slim/ari.png", ghs.a.a),
      a("textures/entity/player/slim/efe.png", ghs.a.a),
      a("textures/entity/player/slim/kai.png", ghs.a.a),
      a("textures/entity/player/slim/makena.png", ghs.a.a),
      a("textures/entity/player/slim/noor.png", ghs.a.a),
      a("textures/entity/player/slim/steve.png", ghs.a.a),
      a("textures/entity/player/slim/sunny.png", ghs.a.a),
      a("textures/entity/player/slim/zuri.png", ghs.a.a),
      a("textures/entity/player/wide/alex.png", ghs.a.b),
      a("textures/entity/player/wide/ari.png", ghs.a.b),
      a("textures/entity/player/wide/efe.png", ghs.a.b),
      a("textures/entity/player/wide/kai.png", ghs.a.b),
      a("textures/entity/player/wide/makena.png", ghs.a.b),
      a("textures/entity/player/wide/noor.png", ghs.a.b),
      a("textures/entity/player/wide/steve.png", ghs.a.b),
      a("textures/entity/player/wide/sunny.png", ghs.a.b),
      a("textures/entity/player/wide/zuri.png", ghs.a.b)
   };

   public static aiy a() {
      return a[6].a();
   }

   public static ghs a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static ghs a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static ghs a(String $$0, ghs.a $$1) {
      return new ghs(new aiy($$0), null, null, null, $$1, true);
   }
}
