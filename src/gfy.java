import com.google.common.collect.Maps;
import java.util.Map;

public final class gfy extends gec<ceh, fqx<ceh>> {
   private static final Map<ceo, ajt> a = ac.a(Maps.newEnumMap(ceo.class), $$0 -> {
      $$0.put(ceo.a, new ajt("textures/entity/horse/horse_white.png"));
      $$0.put(ceo.b, new ajt("textures/entity/horse/horse_creamy.png"));
      $$0.put(ceo.c, new ajt("textures/entity/horse/horse_chestnut.png"));
      $$0.put(ceo.d, new ajt("textures/entity/horse/horse_brown.png"));
      $$0.put(ceo.e, new ajt("textures/entity/horse/horse_black.png"));
      $$0.put(ceo.f, new ajt("textures/entity/horse/horse_gray.png"));
      $$0.put(ceo.g, new ajt("textures/entity/horse/horse_darkbrown.png"));
   });

   public gfy(gfi.a $$0) {
      super($$0, new fqx<>($$0.a(ftl.ap)), 1.1F);
      this.a(new gji(this));
      this.a(new gjh(this, $$0.f()));
   }

   public ajt a(ceh $$0) {
      return a.get($$0.r());
   }
}
