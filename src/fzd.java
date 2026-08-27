import com.google.common.collect.Maps;
import java.util.Map;

public final class fzd extends fxj<bzz, fki<bzz>> {
   private static final Map<cag, ahg> a = ac.a(Maps.newEnumMap(cag.class), $$0 -> {
      $$0.put(cag.a, new ahg("textures/entity/horse/horse_white.png"));
      $$0.put(cag.b, new ahg("textures/entity/horse/horse_creamy.png"));
      $$0.put(cag.c, new ahg("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cag.d, new ahg("textures/entity/horse/horse_brown.png"));
      $$0.put(cag.e, new ahg("textures/entity/horse/horse_black.png"));
      $$0.put(cag.f, new ahg("textures/entity/horse/horse_gray.png"));
      $$0.put(cag.g, new ahg("textures/entity/horse/horse_darkbrown.png"));
   });

   public fzd(fyn.a $$0) {
      super($$0, new fki<>($$0.a(fmw.am)), 1.1F);
      this.a(new gcn(this));
      this.a(new gcm(this, $$0.f()));
   }

   public ahg a(bzz $$0) {
      return a.get($$0.w());
   }
}
