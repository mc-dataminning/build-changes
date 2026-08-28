import com.google.common.collect.Maps;
import java.util.Map;

public final class gjp extends ght<chn, fun<chn>> {
   private static final Map<chu, alf> a = ac.a(Maps.newEnumMap(chu.class), $$0 -> {
      $$0.put(chu.a, new alf("textures/entity/horse/horse_white.png"));
      $$0.put(chu.b, new alf("textures/entity/horse/horse_creamy.png"));
      $$0.put(chu.c, new alf("textures/entity/horse/horse_chestnut.png"));
      $$0.put(chu.d, new alf("textures/entity/horse/horse_brown.png"));
      $$0.put(chu.e, new alf("textures/entity/horse/horse_black.png"));
      $$0.put(chu.f, new alf("textures/entity/horse/horse_gray.png"));
      $$0.put(chu.g, new alf("textures/entity/horse/horse_darkbrown.png"));
   });

   public gjp(giz.a $$0) {
      super($$0, new fun<>($$0.a(fxb.ap)), 1.1F);
      this.a(new gna(this));
      this.a(new gmz(this, $$0.f()));
   }

   public alf a(chn $$0) {
      return a.get($$0.s());
   }
}
