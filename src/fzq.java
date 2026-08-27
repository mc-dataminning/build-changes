import com.google.common.collect.Maps;
import java.util.Map;

public final class fzq extends fxv<cag, fku<cag>> {
   private static final Map<can, ahh> a = ac.a(Maps.newEnumMap(can.class), $$0 -> {
      $$0.put(can.a, new ahh("textures/entity/horse/horse_white.png"));
      $$0.put(can.b, new ahh("textures/entity/horse/horse_creamy.png"));
      $$0.put(can.c, new ahh("textures/entity/horse/horse_chestnut.png"));
      $$0.put(can.d, new ahh("textures/entity/horse/horse_brown.png"));
      $$0.put(can.e, new ahh("textures/entity/horse/horse_black.png"));
      $$0.put(can.f, new ahh("textures/entity/horse/horse_gray.png"));
      $$0.put(can.g, new ahh("textures/entity/horse/horse_darkbrown.png"));
   });

   public fzq(fza.a $$0) {
      super($$0, new fku<>($$0.a(fni.al)), 1.1F);
      this.a(new gda(this));
      this.a(new gcz(this, $$0.f()));
   }

   public ahh a(cag $$0) {
      return a.get($$0.w());
   }
}
