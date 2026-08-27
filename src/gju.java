import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gju {
   private static final gkb[] a = new gkb[]{
      a("textures/entity/player/slim/alex.png", gkb.a.a),
      a("textures/entity/player/slim/ari.png", gkb.a.a),
      a("textures/entity/player/slim/efe.png", gkb.a.a),
      a("textures/entity/player/slim/kai.png", gkb.a.a),
      a("textures/entity/player/slim/makena.png", gkb.a.a),
      a("textures/entity/player/slim/noor.png", gkb.a.a),
      a("textures/entity/player/slim/steve.png", gkb.a.a),
      a("textures/entity/player/slim/sunny.png", gkb.a.a),
      a("textures/entity/player/slim/zuri.png", gkb.a.a),
      a("textures/entity/player/wide/alex.png", gkb.a.b),
      a("textures/entity/player/wide/ari.png", gkb.a.b),
      a("textures/entity/player/wide/efe.png", gkb.a.b),
      a("textures/entity/player/wide/kai.png", gkb.a.b),
      a("textures/entity/player/wide/makena.png", gkb.a.b),
      a("textures/entity/player/wide/noor.png", gkb.a.b),
      a("textures/entity/player/wide/steve.png", gkb.a.b),
      a("textures/entity/player/wide/sunny.png", gkb.a.b),
      a("textures/entity/player/wide/zuri.png", gkb.a.b)
   };

   public static ajh a() {
      return a[6].a();
   }

   public static gkb a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gkb a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gkb a(String $$0, gkb.a $$1) {
      return new gkb(new ajh($$0), null, null, null, $$1, true);
   }
}
