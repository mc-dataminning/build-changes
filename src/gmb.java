import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gmb {
   private static final gmi[] a = new gmi[]{
      a("textures/entity/player/slim/alex.png", gmi.a.a),
      a("textures/entity/player/slim/ari.png", gmi.a.a),
      a("textures/entity/player/slim/efe.png", gmi.a.a),
      a("textures/entity/player/slim/kai.png", gmi.a.a),
      a("textures/entity/player/slim/makena.png", gmi.a.a),
      a("textures/entity/player/slim/noor.png", gmi.a.a),
      a("textures/entity/player/slim/steve.png", gmi.a.a),
      a("textures/entity/player/slim/sunny.png", gmi.a.a),
      a("textures/entity/player/slim/zuri.png", gmi.a.a),
      a("textures/entity/player/wide/alex.png", gmi.a.b),
      a("textures/entity/player/wide/ari.png", gmi.a.b),
      a("textures/entity/player/wide/efe.png", gmi.a.b),
      a("textures/entity/player/wide/kai.png", gmi.a.b),
      a("textures/entity/player/wide/makena.png", gmi.a.b),
      a("textures/entity/player/wide/noor.png", gmi.a.b),
      a("textures/entity/player/wide/steve.png", gmi.a.b),
      a("textures/entity/player/wide/sunny.png", gmi.a.b),
      a("textures/entity/player/wide/zuri.png", gmi.a.b)
   };

   public static ajt a() {
      return a[6].a();
   }

   public static gmi a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gmi a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gmi a(String $$0, gmi.a $$1) {
      return new gmi(new ajt($$0), null, null, null, $$1, true);
   }
}
