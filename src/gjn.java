import com.google.common.collect.Maps;
import java.util.Map;

public final class gjn extends ghr<chl, ful<chl>> {
   private static final Map<chs, alf> a = ac.a(Maps.newEnumMap(chs.class), $$0 -> {
      $$0.put(chs.a, new alf("textures/entity/horse/horse_white.png"));
      $$0.put(chs.b, new alf("textures/entity/horse/horse_creamy.png"));
      $$0.put(chs.c, new alf("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chs.d, new alf("textures/entity/horse/horse_brown.png"));
      $$0.put(chs.e, new alf("textures/entity/horse/horse_black.png"));
      $$0.put(chs.f, new alf("textures/entity/horse/horse_gray.png"));
      $$0.put(chs.g, new alf("textures/entity/horse/horse_darkbrown.png"));
   });

   public gjn(gix.a $$0) {
      super($$0, new ful<>($$0.a(fwz.ap)), 1.1F);
      this.a(new gmy(this));
      this.a(new gmx(this, $$0.f()));
   }

   public alf a(chl $$0) {
      return a.get($$0.s());
   }
}
