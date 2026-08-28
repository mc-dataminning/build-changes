import com.google.common.collect.Maps;
import java.util.Map;

public final class gjw extends gia<cgu, fut<cgu>> {
   private static final Map<chb, akk> a = ac.a(Maps.newEnumMap(chb.class), $$0 -> {
      $$0.put(chb.a, new akk("textures/entity/horse/horse_white.png"));
      $$0.put(chb.b, new akk("textures/entity/horse/horse_creamy.png"));
      $$0.put(chb.c, new akk("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chb.d, new akk("textures/entity/horse/horse_brown.png"));
      $$0.put(chb.e, new akk("textures/entity/horse/horse_black.png"));
      $$0.put(chb.f, new akk("textures/entity/horse/horse_gray.png"));
      $$0.put(chb.g, new akk("textures/entity/horse/horse_darkbrown.png"));
   });

   public gjw(gjg.a $$0) {
      super($$0, new fut<>($$0.a(fxh.ap)), 1.1F);
      this.a(new gnh(this));
      this.a(new gng(this, $$0.f()));
   }

   public akk a(cgu $$0) {
      return a.get($$0.s());
   }
}
