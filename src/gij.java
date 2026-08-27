import com.google.common.collect.Maps;
import java.util.Map;

public final class gij extends ggn<cgk, fth<cgk>> {
   private static final Map<cgr, akm> a = ac.a(Maps.newEnumMap(cgr.class), $$0 -> {
      $$0.put(cgr.a, new akm("textures/entity/horse/horse_white.png"));
      $$0.put(cgr.b, new akm("textures/entity/horse/horse_creamy.png"));
      $$0.put(cgr.c, new akm("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cgr.d, new akm("textures/entity/horse/horse_brown.png"));
      $$0.put(cgr.e, new akm("textures/entity/horse/horse_black.png"));
      $$0.put(cgr.f, new akm("textures/entity/horse/horse_gray.png"));
      $$0.put(cgr.g, new akm("textures/entity/horse/horse_darkbrown.png"));
   });

   public gij(ght.a $$0) {
      super($$0, new fth<>($$0.a(fvv.ap)), 1.1F);
      this.a(new glu(this));
      this.a(new glt(this, $$0.f()));
   }

   public akm a(cgk $$0) {
      return a.get($$0.s());
   }
}
