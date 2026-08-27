import com.google.common.collect.Maps;
import java.util.Map;

public final class gij extends ggn<cgm, fth<cgm>> {
   private static final Map<cgt, akn> a = ac.a(Maps.newEnumMap(cgt.class), $$0 -> {
      $$0.put(cgt.a, new akn("textures/entity/horse/horse_white.png"));
      $$0.put(cgt.b, new akn("textures/entity/horse/horse_creamy.png"));
      $$0.put(cgt.c, new akn("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cgt.d, new akn("textures/entity/horse/horse_brown.png"));
      $$0.put(cgt.e, new akn("textures/entity/horse/horse_black.png"));
      $$0.put(cgt.f, new akn("textures/entity/horse/horse_gray.png"));
      $$0.put(cgt.g, new akn("textures/entity/horse/horse_darkbrown.png"));
   });

   public gij(ght.a $$0) {
      super($$0, new fth<>($$0.a(fvv.ap)), 1.1F);
      this.a(new glu(this));
      this.a(new glt(this, $$0.f()));
   }

   public akn a(cgm $$0) {
      return a.get($$0.s());
   }
}
