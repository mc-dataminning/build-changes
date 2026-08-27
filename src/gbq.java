import com.google.common.collect.Maps;
import java.util.Map;

public final class gbq extends fzv<ccb, fmt<ccb>> {
   private static final Map<cci, aiy> a = ac.a(Maps.newEnumMap(cci.class), $$0 -> {
      $$0.put(cci.a, new aiy("textures/entity/horse/horse_white.png"));
      $$0.put(cci.b, new aiy("textures/entity/horse/horse_creamy.png"));
      $$0.put(cci.c, new aiy("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cci.d, new aiy("textures/entity/horse/horse_brown.png"));
      $$0.put(cci.e, new aiy("textures/entity/horse/horse_black.png"));
      $$0.put(cci.f, new aiy("textures/entity/horse/horse_gray.png"));
      $$0.put(cci.g, new aiy("textures/entity/horse/horse_darkbrown.png"));
   });

   public gbq(gba.a $$0) {
      super($$0, new fmt<>($$0.a(fpi.al)), 1.1F);
      this.a(new gfa(this));
      this.a(new gez(this, $$0.f()));
   }

   public aiy a(ccb $$0) {
      return a.get($$0.w());
   }
}
