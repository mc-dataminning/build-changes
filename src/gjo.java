import com.google.common.collect.Maps;
import java.util.Map;

public final class gjo extends ghs<chm, fum<chm>> {
   private static final Map<cht, alf> a = ac.a(Maps.newEnumMap(cht.class), $$0 -> {
      $$0.put(cht.a, new alf("textures/entity/horse/horse_white.png"));
      $$0.put(cht.b, new alf("textures/entity/horse/horse_creamy.png"));
      $$0.put(cht.c, new alf("textures/entity/horse/horse_chestnut.png"));
      $$0.put(cht.d, new alf("textures/entity/horse/horse_brown.png"));
      $$0.put(cht.e, new alf("textures/entity/horse/horse_black.png"));
      $$0.put(cht.f, new alf("textures/entity/horse/horse_gray.png"));
      $$0.put(cht.g, new alf("textures/entity/horse/horse_darkbrown.png"));
   });

   public gjo(giy.a $$0) {
      super($$0, new fum<>($$0.a(fxa.ap)), 1.1F);
      this.a(new gmz(this));
      this.a(new gmy(this, $$0.f()));
   }

   public alf a(chm $$0) {
      return a.get($$0.s());
   }
}
