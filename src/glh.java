import com.google.common.collect.Maps;
import java.util.Map;

public final class glh extends gjj<cgk, fwb<cgk>> {
   private static final Map<cgr, akt> a = ad.a(Maps.newEnumMap(cgr.class), $$0 -> {
      $$0.put(cgr.a, new akt("textures/entity/horse/horse_white.png"));
      $$0.put(cgr.b, new akt("textures/entity/horse/horse_creamy.png"));
      $$0.put(cgr.c, new akt("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cgr.d, new akt("textures/entity/horse/horse_brown.png"));
      $$0.put(cgr.e, new akt("textures/entity/horse/horse_black.png"));
      $$0.put(cgr.f, new akt("textures/entity/horse/horse_gray.png"));
      $$0.put(cgr.g, new akt("textures/entity/horse/horse_darkbrown.png"));
   });

   public glh(gkq.a $$0) {
      super($$0, new fwb<>($$0.a(fyr.at)), 1.1F);
      this.a(new gou(this));
      this.a(new got(this, $$0.f()));
   }

   public akt a(cgk $$0) {
      return a.get($$0.r());
   }
}
