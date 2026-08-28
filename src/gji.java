import com.google.common.collect.Maps;
import java.util.Map;

public final class gji extends ghm<chg, fug<chg>> {
   private static final Map<chn, alb> a = ac.a(Maps.newEnumMap(chn.class), $$0 -> {
      $$0.put(chn.a, new alb("textures/entity/horse/horse_white.png"));
      $$0.put(chn.b, new alb("textures/entity/horse/horse_creamy.png"));
      $$0.put(chn.c, new alb("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chn.d, new alb("textures/entity/horse/horse_brown.png"));
      $$0.put(chn.e, new alb("textures/entity/horse/horse_black.png"));
      $$0.put(chn.f, new alb("textures/entity/horse/horse_gray.png"));
      $$0.put(chn.g, new alb("textures/entity/horse/horse_darkbrown.png"));
   });

   public gji(gis.a $$0) {
      super($$0, new fug<>($$0.a(fwu.ap)), 1.1F);
      this.a(new gmt(this));
      this.a(new gms(this, $$0.f()));
   }

   public alb a(chg $$0) {
      return a.get($$0.s());
   }
}
