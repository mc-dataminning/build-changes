import com.google.common.collect.Maps;
import java.util.Map;

public class gwe extends gwq<gyx, gcj> {
   private static final Map<cje, aku> a = af.a(Maps.newEnumMap(cje.class), $$0 -> {
      $$0.put(cje.a, null);
      $$0.put(cje.b, aku.b("textures/entity/horse/horse_markings_white.png"));
      $$0.put(cje.c, aku.b("textures/entity/horse/horse_markings_whitefield.png"));
      $$0.put(cje.d, aku.b("textures/entity/horse/horse_markings_whitedots.png"));
      $$0.put(cje.e, aku.b("textures/entity/horse/horse_markings_blackdots.png"));
   });

   public gwe(gty<gyx, gcj> $$0) {
      super($$0);
   }

   public void a(ffs $$0, glv $$1, int $$2, gyx $$3, float $$4, float $$5) {
      aku $$6 = a.get($$3.h);
      if ($$6 != null && !$$3.z) {
         ffw $$7 = $$1.getBuffer(gmf.j($$6));
         this.d().a($$0, $$7, $$2, gtc.a($$3, 0.0F));
      }
   }
}
