import com.google.common.collect.Maps;
import java.util.Map;

public final class fyv extends fxb<bzt, fka<bzt>> {
   private static final Map<caa, ahd> a = ac.a(Maps.newEnumMap(caa.class), $$0 -> {
      $$0.put(caa.a, new ahd("textures/entity/horse/horse_white.png"));
      $$0.put(caa.b, new ahd("textures/entity/horse/horse_creamy.png"));
      $$0.put(caa.c, new ahd("textures/entity/horse/horse_chestnut.png"));
      $$0.put(caa.d, new ahd("textures/entity/horse/horse_brown.png"));
      $$0.put(caa.e, new ahd("textures/entity/horse/horse_black.png"));
      $$0.put(caa.f, new ahd("textures/entity/horse/horse_gray.png"));
      $$0.put(caa.g, new ahd("textures/entity/horse/horse_darkbrown.png"));
   });

   public fyv(fyf.a $$0) {
      super($$0, new fka<>($$0.a(fmo.am)), 1.1F);
      this.a(new gcf(this));
      this.a(new gce(this, $$0.f()));
   }

   public ahd a(bzt $$0) {
      return a.get($$0.w());
   }
}
