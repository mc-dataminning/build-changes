import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gbz {
   private static final gch[] a = new gch[]{
      a("textures/entity/player/slim/alex.png", gch.a.a),
      a("textures/entity/player/slim/ari.png", gch.a.a),
      a("textures/entity/player/slim/efe.png", gch.a.a),
      a("textures/entity/player/slim/kai.png", gch.a.a),
      a("textures/entity/player/slim/makena.png", gch.a.a),
      a("textures/entity/player/slim/noor.png", gch.a.a),
      a("textures/entity/player/slim/steve.png", gch.a.a),
      a("textures/entity/player/slim/sunny.png", gch.a.a),
      a("textures/entity/player/slim/zuri.png", gch.a.a),
      a("textures/entity/player/wide/alex.png", gch.a.b),
      a("textures/entity/player/wide/ari.png", gch.a.b),
      a("textures/entity/player/wide/efe.png", gch.a.b),
      a("textures/entity/player/wide/kai.png", gch.a.b),
      a("textures/entity/player/wide/makena.png", gch.a.b),
      a("textures/entity/player/wide/noor.png", gch.a.b),
      a("textures/entity/player/wide/steve.png", gch.a.b),
      a("textures/entity/player/wide/sunny.png", gch.a.b),
      a("textures/entity/player/wide/zuri.png", gch.a.b)
   };

   public static agg a() {
      return a[6].a();
   }

   public static gch a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gch a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gch a(String $$0, gch.a $$1) {
      return new gch(new agg($$0), null, null, null, $$1, true);
   }
}
