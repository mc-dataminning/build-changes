import com.google.common.collect.Maps;
import java.util.Map;

public class gsm extends gsx<gvc, fyv> {
   private static final Map<ciz, ali> a = ae.a(Maps.newEnumMap(ciz.class), $$0 -> {
      $$0.put(ciz.a, null);
      $$0.put(ciz.b, ali.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(ciz.c, ali.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(ciz.d, ali.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(ciz.e, ali.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gsm(gqg<gvc, fyv> $$0) {
      super($$0);
   }

   public void a(feb $$0, gih $$1, int $$2, gvc $$3, float $$4, float $$5) {
      ali $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.u) {
         fef $$7 = $$1.getBuffer(gir.i($$6));
         this.d().a($$0, $$7, $$2, gpl.a($$3, 0.0F));
      }
   }
}
