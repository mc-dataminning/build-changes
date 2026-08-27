import com.google.common.collect.Maps;
import java.util.Map;

public final class ggh extends gel<ceo, frg<ceo>> {
   private static final Map<cev, ajv> a = ac.a(Maps.newEnumMap(cev.class), $$0 -> {
      $$0.put(cev.a, new ajv("textures/entity/horse/horse_white.png"));
      $$0.put(cev.b, new ajv("textures/entity/horse/horse_creamy.png"));
      $$0.put(cev.c, new ajv("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cev.d, new ajv("textures/entity/horse/horse_brown.png"));
      $$0.put(cev.e, new ajv("textures/entity/horse/horse_black.png"));
      $$0.put(cev.f, new ajv("textures/entity/horse/horse_gray.png"));
      $$0.put(cev.g, new ajv("textures/entity/horse/horse_darkbrown.png"));
   });

   public ggh(gfr.a $$0) {
      super($$0, new frg<>($$0.a(ftu.ap)), 1.1F);
      this.a(new gjr(this));
      this.a(new gjq(this, $$0.f()));
   }

   public ajv a(ceo $$0) {
      return a.get($$0.r());
   }
}
