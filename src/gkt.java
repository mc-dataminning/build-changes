import com.google.common.collect.Maps;
import java.util.Map;

public final class gkt extends gix<chi, fvp<chi>> {
   private static final Map<chp, akq> a = ad.a(Maps.newEnumMap(chp.class), $$0 -> {
      $$0.put(chp.a, akq.b("textures/entity/horse/horse_white.png"));
      $$0.put(chp.b, akq.b("textures/entity/horse/horse_creamy.png"));
      $$0.put(chp.c, akq.b("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chp.d, akq.b("textures/entity/horse/horse_brown.png"));
      $$0.put(chp.e, akq.b("textures/entity/horse/horse_black.png"));
      $$0.put(chp.f, akq.b("textures/entity/horse/horse_gray.png"));
      $$0.put(chp.g, akq.b("textures/entity/horse/horse_darkbrown.png"));
   });

   public gkt(gkd.a $$0) {
      super($$0, new fvp<>($$0.a(fyd.aq)), 1.1F);
      this.a(new goe(this));
      this.a(new god(this, $$0.f()));
   }

   public akq a(chi $$0) {
      return a.get($$0.s());
   }
}
