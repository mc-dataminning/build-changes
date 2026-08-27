import com.google.common.collect.Maps;
import java.util.Map;

public final class fws extends fuz<byx, fif<byx>> {
   private static final Map<bze, agm> a = ac.a(Maps.newEnumMap(bze.class), $$0 -> {
      $$0.put(bze.a, new agm("textures/entity/horse/horse_white.png"));
      $$0.put(bze.b, new agm("textures/entity/horse/horse_creamy.png"));
      $$0.put(bze.c, new agm("textures/entity/horse/horse_chestnut.png"));
      $$0.put(bze.d, new agm("textures/entity/horse/horse_brown.png"));
      $$0.put(bze.e, new agm("textures/entity/horse/horse_black.png"));
      $$0.put(bze.f, new agm("textures/entity/horse/horse_gray.png"));
      $$0.put(bze.g, new agm("textures/entity/horse/horse_darkbrown.png"));
   });

   public fws(fwc.a $$0) {
      super($$0, new fif<>($$0.a(fks.aj)), 1.1F);
      this.a(new fzz(this));
      this.a(new fzy(this, $$0.f()));
   }

   public agm a(byx $$0) {
      return a.get($$0.w());
   }
}
