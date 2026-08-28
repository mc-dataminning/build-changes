import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class grb {
   private static final grj[] a = new grj[]{
      a("textures/entity/player/slim/alex.png", grj.a.a),
      a("textures/entity/player/slim/ari.png", grj.a.a),
      a("textures/entity/player/slim/efe.png", grj.a.a),
      a("textures/entity/player/slim/kai.png", grj.a.a),
      a("textures/entity/player/slim/makena.png", grj.a.a),
      a("textures/entity/player/slim/noor.png", grj.a.a),
      a("textures/entity/player/slim/steve.png", grj.a.a),
      a("textures/entity/player/slim/sunny.png", grj.a.a),
      a("textures/entity/player/slim/zuri.png", grj.a.a),
      a("textures/entity/player/wide/alex.png", grj.a.b),
      a("textures/entity/player/wide/ari.png", grj.a.b),
      a("textures/entity/player/wide/efe.png", grj.a.b),
      a("textures/entity/player/wide/kai.png", grj.a.b),
      a("textures/entity/player/wide/makena.png", grj.a.b),
      a("textures/entity/player/wide/noor.png", grj.a.b),
      a("textures/entity/player/wide/steve.png", grj.a.b),
      a("textures/entity/player/wide/sunny.png", grj.a.b),
      a("textures/entity/player/wide/zuri.png", grj.a.b)
   };

   public static akr a() {
      return a[6].a();
   }

   public static grj a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static grj a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static grj a(String $$0, grj.a $$1) {
      return new grj(akr.b($$0), null, null, null, $$1, true);
   }
}
