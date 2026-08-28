import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class grd {
   private static final grl[] a = new grl[]{
      a("textures/entity/player/slim/alex.png", grl.a.a),
      a("textures/entity/player/slim/ari.png", grl.a.a),
      a("textures/entity/player/slim/efe.png", grl.a.a),
      a("textures/entity/player/slim/kai.png", grl.a.a),
      a("textures/entity/player/slim/makena.png", grl.a.a),
      a("textures/entity/player/slim/noor.png", grl.a.a),
      a("textures/entity/player/slim/steve.png", grl.a.a),
      a("textures/entity/player/slim/sunny.png", grl.a.a),
      a("textures/entity/player/slim/zuri.png", grl.a.a),
      a("textures/entity/player/wide/alex.png", grl.a.b),
      a("textures/entity/player/wide/ari.png", grl.a.b),
      a("textures/entity/player/wide/efe.png", grl.a.b),
      a("textures/entity/player/wide/kai.png", grl.a.b),
      a("textures/entity/player/wide/makena.png", grl.a.b),
      a("textures/entity/player/wide/noor.png", grl.a.b),
      a("textures/entity/player/wide/steve.png", grl.a.b),
      a("textures/entity/player/wide/sunny.png", grl.a.b),
      a("textures/entity/player/wide/zuri.png", grl.a.b)
   };

   public static akr a() {
      return a[6].a();
   }

   public static grl a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static grl a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static grl a(String $$0, grl.a $$1) {
      return new grl(akr.b($$0), null, null, null, $$1, true);
   }
}
