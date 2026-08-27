import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gng {
   private static final gnn[] a = new gnn[]{
      a("textures/entity/player/slim/alex.png", gnn.a.a),
      a("textures/entity/player/slim/ari.png", gnn.a.a),
      a("textures/entity/player/slim/efe.png", gnn.a.a),
      a("textures/entity/player/slim/kai.png", gnn.a.a),
      a("textures/entity/player/slim/makena.png", gnn.a.a),
      a("textures/entity/player/slim/noor.png", gnn.a.a),
      a("textures/entity/player/slim/steve.png", gnn.a.a),
      a("textures/entity/player/slim/sunny.png", gnn.a.a),
      a("textures/entity/player/slim/zuri.png", gnn.a.a),
      a("textures/entity/player/wide/alex.png", gnn.a.b),
      a("textures/entity/player/wide/ari.png", gnn.a.b),
      a("textures/entity/player/wide/efe.png", gnn.a.b),
      a("textures/entity/player/wide/kai.png", gnn.a.b),
      a("textures/entity/player/wide/makena.png", gnn.a.b),
      a("textures/entity/player/wide/noor.png", gnn.a.b),
      a("textures/entity/player/wide/steve.png", gnn.a.b),
      a("textures/entity/player/wide/sunny.png", gnn.a.b),
      a("textures/entity/player/wide/zuri.png", gnn.a.b)
   };

   public static akf a() {
      return a[6].a();
   }

   public static gnn a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gnn a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gnn a(String $$0, gnn.a $$1) {
      return new gnn(new akf($$0), null, null, null, $$1, true);
   }
}
