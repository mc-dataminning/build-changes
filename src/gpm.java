import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gpm {
   private static final gpu[] a = new gpu[]{
      a("textures/entity/player/slim/alex.png", gpu.a.a),
      a("textures/entity/player/slim/ari.png", gpu.a.a),
      a("textures/entity/player/slim/efe.png", gpu.a.a),
      a("textures/entity/player/slim/kai.png", gpu.a.a),
      a("textures/entity/player/slim/makena.png", gpu.a.a),
      a("textures/entity/player/slim/noor.png", gpu.a.a),
      a("textures/entity/player/slim/steve.png", gpu.a.a),
      a("textures/entity/player/slim/sunny.png", gpu.a.a),
      a("textures/entity/player/slim/zuri.png", gpu.a.a),
      a("textures/entity/player/wide/alex.png", gpu.a.b),
      a("textures/entity/player/wide/ari.png", gpu.a.b),
      a("textures/entity/player/wide/efe.png", gpu.a.b),
      a("textures/entity/player/wide/kai.png", gpu.a.b),
      a("textures/entity/player/wide/makena.png", gpu.a.b),
      a("textures/entity/player/wide/noor.png", gpu.a.b),
      a("textures/entity/player/wide/steve.png", gpu.a.b),
      a("textures/entity/player/wide/sunny.png", gpu.a.b),
      a("textures/entity/player/wide/zuri.png", gpu.a.b)
   };

   public static alb a() {
      return a[6].a();
   }

   public static gpu a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gpu a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gpu a(String $$0, gpu.a $$1) {
      return new gpu(new alb($$0), null, null, null, $$1, true);
   }
}
