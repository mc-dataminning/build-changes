import com.google.common.collect.Maps;
import java.util.Map;

public final class gkc extends gig<cgx, fuz<cgx>> {
   private static final Map<che, akk> a = ac.a(Maps.newEnumMap(che.class), $$0 -> {
      $$0.put(che.a, new akk("textures/entity/horse/horse_white.png"));
      $$0.put(che.b, new akk("textures/entity/horse/horse_creamy.png"));
      $$0.put(che.c, new akk("textures/entity/horse/horse_chestnut.png"));
      $$0.put(che.d, new akk("textures/entity/horse/horse_brown.png"));
      $$0.put(che.e, new akk("textures/entity/horse/horse_black.png"));
      $$0.put(che.f, new akk("textures/entity/horse/horse_gray.png"));
      $$0.put(che.g, new akk("textures/entity/horse/horse_darkbrown.png"));
   });

   public gkc(gjm.a $$0) {
      super($$0, new fuz<>($$0.a(fxn.ap)), 1.1F);
      this.a(new gnn(this));
      this.a(new gnm(this, $$0.f()));
   }

   public akk a(cgx $$0) {
      return a.get($$0.s());
   }
}
