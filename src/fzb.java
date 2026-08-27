import com.google.common.collect.Maps;
import java.util.Map;

public final class fzb extends fxh<bzy, fkg<bzy>> {
   private static final Map<caf, ahg> a = ac.a(Maps.newEnumMap(caf.class), $$0 -> {
      $$0.put(caf.a, new ahg("textures/entity/horse/horse_white.png"));
      $$0.put(caf.b, new ahg("textures/entity/horse/horse_creamy.png"));
      $$0.put(caf.c, new ahg("textures/entity/horse/horse_chestnut.png"));
      $$0.put(caf.d, new ahg("textures/entity/horse/horse_brown.png"));
      $$0.put(caf.e, new ahg("textures/entity/horse/horse_black.png"));
      $$0.put(caf.f, new ahg("textures/entity/horse/horse_gray.png"));
      $$0.put(caf.g, new ahg("textures/entity/horse/horse_darkbrown.png"));
   });

   public fzb(fyl.a $$0) {
      super($$0, new fkg<>($$0.a(fmu.am)), 1.1F);
      this.a(new gcl(this));
      this.a(new gck(this, $$0.f()));
   }

   public ahg a(bzy $$0) {
      return a.get($$0.w());
   }
}
