import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hcc {
   private static final hcl[] a = new hcl[]{
      a("textures/entity/player/slim/alex.png", hcl.a.a),
      a("textures/entity/player/slim/ari.png", hcl.a.a),
      a("textures/entity/player/slim/efe.png", hcl.a.a),
      a("textures/entity/player/slim/kai.png", hcl.a.a),
      a("textures/entity/player/slim/makena.png", hcl.a.a),
      a("textures/entity/player/slim/noor.png", hcl.a.a),
      a("textures/entity/player/slim/steve.png", hcl.a.a),
      a("textures/entity/player/slim/sunny.png", hcl.a.a),
      a("textures/entity/player/slim/zuri.png", hcl.a.a),
      a("textures/entity/player/wide/alex.png", hcl.a.b),
      a("textures/entity/player/wide/ari.png", hcl.a.b),
      a("textures/entity/player/wide/efe.png", hcl.a.b),
      a("textures/entity/player/wide/kai.png", hcl.a.b),
      a("textures/entity/player/wide/makena.png", hcl.a.b),
      a("textures/entity/player/wide/noor.png", hcl.a.b),
      a("textures/entity/player/wide/steve.png", hcl.a.b),
      a("textures/entity/player/wide/sunny.png", hcl.a.b),
      a("textures/entity/player/wide/zuri.png", hcl.a.b)
   };

   public static alz a() {
      return b().a();
   }

   public static hcl b() {
      return a[6];
   }

   public static hcl a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hcl a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hcl a(String $$0, hcl.a $$1) {
      return new hcl(alz.b($$0), null, null, null, $$1, true);
   }
}
