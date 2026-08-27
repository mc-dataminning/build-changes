import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gff {
   private static final gfm[] a = new gfm[]{
      a("textures/entity/player/slim/alex.png", gfm.a.a),
      a("textures/entity/player/slim/ari.png", gfm.a.a),
      a("textures/entity/player/slim/efe.png", gfm.a.a),
      a("textures/entity/player/slim/kai.png", gfm.a.a),
      a("textures/entity/player/slim/makena.png", gfm.a.a),
      a("textures/entity/player/slim/noor.png", gfm.a.a),
      a("textures/entity/player/slim/steve.png", gfm.a.a),
      a("textures/entity/player/slim/sunny.png", gfm.a.a),
      a("textures/entity/player/slim/zuri.png", gfm.a.a),
      a("textures/entity/player/wide/alex.png", gfm.a.b),
      a("textures/entity/player/wide/ari.png", gfm.a.b),
      a("textures/entity/player/wide/efe.png", gfm.a.b),
      a("textures/entity/player/wide/kai.png", gfm.a.b),
      a("textures/entity/player/wide/makena.png", gfm.a.b),
      a("textures/entity/player/wide/noor.png", gfm.a.b),
      a("textures/entity/player/wide/steve.png", gfm.a.b),
      a("textures/entity/player/wide/sunny.png", gfm.a.b),
      a("textures/entity/player/wide/zuri.png", gfm.a.b)
   };

   public static ahg a() {
      return a[6].a();
   }

   public static gfm a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gfm a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gfm a(String $$0, gfm.a $$1) {
      return new gfm(new ahg($$0), null, null, null, $$1, true);
   }
}
