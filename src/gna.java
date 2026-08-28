import com.google.common.collect.Maps;
import java.util.Map;

public class gna extends gnl<chn, fun<chn>> {
   private static final Map<chp, alf> a = ac.a(Maps.newEnumMap(chp.class), $$0 -> {
      $$0.put(chp.a, null);
      $$0.put(chp.b, new alf("textures/entity/horse/horse_markings_white.png"));
      $$0.put(chp.c, new alf("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(chp.d, new alf("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(chp.e, new alf("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gna(gkv<chn, fun<chn>> $$0) {
      super($$0);
   }

   public void a(faa $$0, gdq $$1, int $$2, chn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      alf $$10 = a.get($$3.u());
      if ($$10 != null && !$$3.ch()) {
         fae $$11 = $$1.getBuffer(gdy.i($$10));
         this.c().a($$0, $$11, $$2, gka.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
