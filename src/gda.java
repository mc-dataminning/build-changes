import com.google.common.collect.Maps;
import java.util.Map;

public class gda extends gdl<cag, fku<cag>> {
   private static final Map<cai, ahh> a = ac.a(Maps.newEnumMap(cai.class), $$0 -> {
      $$0.put(cai.a, null);
      $$0.put(cai.b, new ahh("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cai.c, new ahh("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cai.d, new ahh("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cai.e, new ahh("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gda(gav<cag, fku<cag>> $$0) {
      super($$0);
   }

   public void a(eqk $$0, ftt $$1, int $$2, cag $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ahh $$10 = a.get($$3.gf());
      if ($$10 != null && !$$3.ce()) {
         eqo $$11 = $$1.getBuffer(fub.i($$10));
         this.c().a($$0, $$11, $$2, gab.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
