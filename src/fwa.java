import com.google.common.collect.Maps;
import java.util.Map;

public final class fwa extends fuh<byk, fhn<byk>> {
   private static final Map<byr, agg> a = ac.a(Maps.newEnumMap(byr.class), $$0 -> {
      $$0.put(byr.a, new agg("textures/entity/horse/horse_white.png"));
      $$0.put(byr.b, new agg("textures/entity/horse/horse_creamy.png"));
      $$0.put(byr.c, new agg("textures/entity/horse/horse_chestnut.png"));
      $$0.put(byr.d, new agg("textures/entity/horse/horse_brown.png"));
      $$0.put(byr.e, new agg("textures/entity/horse/horse_black.png"));
      $$0.put(byr.f, new agg("textures/entity/horse/horse_gray.png"));
      $$0.put(byr.g, new agg("textures/entity/horse/horse_darkbrown.png"));
   });

   public fwa(fvk.a $$0) {
      super($$0, new fhn<>($$0.a(fka.aj)), 1.1F);
      this.a(new fzh(this));
      this.a(new fzg(this, $$0.f()));
   }

   public agg a(byk $$0) {
      return a.get($$0.t());
   }
}
