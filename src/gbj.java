import com.google.common.collect.Maps;
import java.util.Map;

public final class gbj extends fzo<cbx, fmm<cbx>> {
   private static final Map<cce, aiy> a = ac.a(Maps.newEnumMap(cce.class), $$0 -> {
      $$0.put(cce.a, new aiy("textures/entity/horse/horse_white.png"));
      $$0.put(cce.b, new aiy("textures/entity/horse/horse_creamy.png"));
      $$0.put(cce.c, new aiy("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cce.d, new aiy("textures/entity/horse/horse_brown.png"));
      $$0.put(cce.e, new aiy("textures/entity/horse/horse_black.png"));
      $$0.put(cce.f, new aiy("textures/entity/horse/horse_gray.png"));
      $$0.put(cce.g, new aiy("textures/entity/horse/horse_darkbrown.png"));
   });

   public gbj(gat.a $$0) {
      super($$0, new fmm<>($$0.a(fpb.al)), 1.1F);
      this.a(new get(this));
      this.a(new ges(this, $$0.f()));
   }

   public aiy a(cbx $$0) {
      return a.get($$0.w());
   }
}
