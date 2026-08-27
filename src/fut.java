import com.google.common.collect.Maps;
import java.util.Map;

public final class fut extends fta<bxv, fgi<bxv>> {
   private static final Map<byc, afw> a = ac.a(Maps.newEnumMap(byc.class), $$0 -> {
      $$0.put(byc.a, new afw("textures/entity/horse/horse_white.png"));
      $$0.put(byc.b, new afw("textures/entity/horse/horse_creamy.png"));
      $$0.put(byc.c, new afw("textures/entity/horse/horse_chestnut.png"));
      $$0.put(byc.d, new afw("textures/entity/horse/horse_brown.png"));
      $$0.put(byc.e, new afw("textures/entity/horse/horse_black.png"));
      $$0.put(byc.f, new afw("textures/entity/horse/horse_gray.png"));
      $$0.put(byc.g, new afw("textures/entity/horse/horse_darkbrown.png"));
   });

   public fut(fud.a $$0) {
      super($$0, new fgi<>($$0.a(fiv.aj)), 1.1F);
      this.a(new fya(this));
      this.a(new fxz(this, $$0.f()));
   }

   public afw a(bxv $$0) {
      return a.get($$0.t());
   }
}
