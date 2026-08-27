import com.google.common.collect.Maps;
import java.util.Map;

public final class ghd extends gfh<cez, fsc<cez>> {
   private static final Map<cfg, akf> a = ac.a(Maps.newEnumMap(cfg.class), $$0 -> {
      $$0.put(cfg.a, new akf("textures/entity/horse/horse_white.png"));
      $$0.put(cfg.b, new akf("textures/entity/horse/horse_creamy.png"));
      $$0.put(cfg.c, new akf("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cfg.d, new akf("textures/entity/horse/horse_brown.png"));
      $$0.put(cfg.e, new akf("textures/entity/horse/horse_black.png"));
      $$0.put(cfg.f, new akf("textures/entity/horse/horse_gray.png"));
      $$0.put(cfg.g, new akf("textures/entity/horse/horse_darkbrown.png"));
   });

   public ghd(ggn.a $$0) {
      super($$0, new fsc<>($$0.a(fuq.ap)), 1.1F);
      this.a(new gkn(this));
      this.a(new gkm(this, $$0.f()));
   }

   public akf a(cez $$0) {
      return a.get($$0.r());
   }
}
