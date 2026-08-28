import com.google.common.collect.Maps;
import java.util.Map;

public final class gke extends gii<cgy, fvb<cgy>> {
   private static final Map<chf, akk> a = ac.a(Maps.newEnumMap(chf.class), $$0 -> {
      $$0.put(chf.a, new akk("textures/entity/horse/horse_white.png"));
      $$0.put(chf.b, new akk("textures/entity/horse/horse_creamy.png"));
      $$0.put(chf.c, new akk("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chf.d, new akk("textures/entity/horse/horse_brown.png"));
      $$0.put(chf.e, new akk("textures/entity/horse/horse_black.png"));
      $$0.put(chf.f, new akk("textures/entity/horse/horse_gray.png"));
      $$0.put(chf.g, new akk("textures/entity/horse/horse_darkbrown.png"));
   });

   public gke(gjo.a $$0) {
      super($$0, new fvb<>($$0.a(fxp.ap)), 1.1F);
      this.a(new gnp(this));
      this.a(new gno(this, $$0.f()));
   }

   public akk a(cgy $$0) {
      return a.get($$0.s());
   }
}
