import com.google.common.collect.Maps;
import java.util.Map;

public final class gdo extends gbt<cdh, fon<cdh>> {
   private static final Map<cdo, ajh> a = ac.a(Maps.newEnumMap(cdo.class), $$0 -> {
      $$0.put(cdo.a, new ajh("textures/entity/horse/horse_white.png"));
      $$0.put(cdo.b, new ajh("textures/entity/horse/horse_creamy.png"));
      $$0.put(cdo.c, new ajh("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cdo.d, new ajh("textures/entity/horse/horse_brown.png"));
      $$0.put(cdo.e, new ajh("textures/entity/horse/horse_black.png"));
      $$0.put(cdo.f, new ajh("textures/entity/horse/horse_gray.png"));
      $$0.put(cdo.g, new ajh("textures/entity/horse/horse_darkbrown.png"));
   });

   public gdo(gcy.a $$0) {
      super($$0, new fon<>($$0.a(frc.al)), 1.1F);
      this.a(new ggy(this));
      this.a(new ggx(this, $$0.f()));
   }

   public ajh a(cdh $$0) {
      return a.get($$0.r());
   }
}
