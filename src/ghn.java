import com.google.common.collect.Maps;
import java.util.Map;

public final class ghn extends gfr<cfv, fsm<cfv>> {
   private static final Map<cgc, akh> a = ac.a(Maps.newEnumMap(cgc.class), $$0 -> {
      $$0.put(cgc.a, new akh("textures/entity/horse/horse_white.png"));
      $$0.put(cgc.b, new akh("textures/entity/horse/horse_creamy.png"));
      $$0.put(cgc.c, new akh("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cgc.d, new akh("textures/entity/horse/horse_brown.png"));
      $$0.put(cgc.e, new akh("textures/entity/horse/horse_black.png"));
      $$0.put(cgc.f, new akh("textures/entity/horse/horse_gray.png"));
      $$0.put(cgc.g, new akh("textures/entity/horse/horse_darkbrown.png"));
   });

   public ghn(ggx.a $$0) {
      super($$0, new fsm<>($$0.a(fva.ap)), 1.1F);
      this.a(new gkx(this));
      this.a(new gkw(this, $$0.f()));
   }

   public akh a(cfv $$0) {
      return a.get($$0.r());
   }
}
