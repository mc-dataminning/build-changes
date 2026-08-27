import com.google.common.collect.Maps;
import java.util.Map;

public class gji extends gjt<ceh, fqx<ceh>> {
   private static final Map<cej, ajt> a = ac.a(Maps.newEnumMap(cej.class), $$0 -> {
      $$0.put(cej.a, null);
      $$0.put(cej.b, new ajt("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cej.c, new ajt("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cej.d, new ajt("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cej.e, new ajt("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gji(ghd<ceh, fqx<ceh>> $$0) {
      super($$0);
   }

   public void a(ewi $$0, fzz $$1, int $$2, ceh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ajt $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ce()) {
         ewm $$11 = $$1.getBuffer(gah.i($$10));
         this.c().a($$0, $$11, $$2, ggj.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
