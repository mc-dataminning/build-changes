import com.google.common.collect.Maps;
import java.util.Map;

public final class gco extends gat<ccq, fnp<ccq>> {
   private static final Map<ccx, ajc> a = ac.a(Maps.newEnumMap(ccx.class), $$0 -> {
      $$0.put(ccx.a, new ajc("textures/entity/horse/horse_white.png"));
      $$0.put(ccx.b, new ajc("textures/entity/horse/horse_creamy.png"));
      $$0.put(ccx.c, new ajc("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ccx.d, new ajc("textures/entity/horse/horse_brown.png"));
      $$0.put(ccx.e, new ajc("textures/entity/horse/horse_black.png"));
      $$0.put(ccx.f, new ajc("textures/entity/horse/horse_gray.png"));
      $$0.put(ccx.g, new ajc("textures/entity/horse/horse_darkbrown.png"));
   });

   public gco(gby.a $$0) {
      super($$0, new fnp<>($$0.a(fqe.al)), 1.1F);
      this.a(new gfy(this));
      this.a(new gfx(this, $$0.f()));
   }

   public ajc a(ccq $$0) {
      return a.get($$0.u());
   }
}
