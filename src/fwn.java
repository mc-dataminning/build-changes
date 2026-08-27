import com.google.common.collect.Maps;
import java.util.Map;

public final class fwn extends fuu<bys, fia<bys>> {
   private static final Map<byz, agi> a = ac.a(Maps.newEnumMap(byz.class), $$0 -> {
      $$0.put(byz.a, new agi("textures/entity/horse/horse_white.png"));
      $$0.put(byz.b, new agi("textures/entity/horse/horse_creamy.png"));
      $$0.put(byz.c, new agi("textures/entity/horse/horse_chestnut.png"));
      $$0.put(byz.d, new agi("textures/entity/horse/horse_brown.png"));
      $$0.put(byz.e, new agi("textures/entity/horse/horse_black.png"));
      $$0.put(byz.f, new agi("textures/entity/horse/horse_gray.png"));
      $$0.put(byz.g, new agi("textures/entity/horse/horse_darkbrown.png"));
   });

   public fwn(fvx.a $$0) {
      super($$0, new fia<>($$0.a(fkn.aj)), 1.1F);
      this.a(new fzu(this));
      this.a(new fzt(this, $$0.f()));
   }

   public agi a(bys $$0) {
      return a.get($$0.w());
   }
}
