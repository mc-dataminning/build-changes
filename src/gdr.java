import com.google.common.collect.Maps;
import java.util.Map;

public final class gdr extends gbv<cdi, fop<cdi>> {
   private static final Map<cdp, ajh> a = ac.a(Maps.newEnumMap(cdp.class), $$0 -> {
      $$0.put(cdp.a, new ajh("textures/entity/horse/horse_white.png"));
      $$0.put(cdp.b, new ajh("textures/entity/horse/horse_creamy.png"));
      $$0.put(cdp.c, new ajh("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cdp.d, new ajh("textures/entity/horse/horse_brown.png"));
      $$0.put(cdp.e, new ajh("textures/entity/horse/horse_black.png"));
      $$0.put(cdp.f, new ajh("textures/entity/horse/horse_gray.png"));
      $$0.put(cdp.g, new ajh("textures/entity/horse/horse_darkbrown.png"));
   });

   public gdr(gdb.a $$0) {
      super($$0, new fop<>($$0.a(fre.ap)), 1.1F);
      this.a(new ghb(this));
      this.a(new gha(this, $$0.f()));
   }

   public ajh a(cdi $$0) {
      return a.get($$0.r());
   }
}
