import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gsc extends grx<cje, gyr, gbx> {
   private static final Map<cje.e, aku> a = af.a(Maps.newHashMap(), $$0 -> {
      for (cje.e $$1 : cje.e.values()) {
         $$0.put($$1, aku.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gsc(gtd.a $$0) {
      super($$0, new gbx($$0.a(ggb.m)), new gbx($$0.a(ggb.n)), 0.5F);
   }

   public aku a(gyr $$0) {
      return a.get($$0.a);
   }

   public gyr a() {
      return new gyr();
   }

   public void a(cje $$0, gyr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bM.a($$2);
      $$1.d = $$0.bN.a($$2);
      $$1.e = $$0.bO.a($$2);
      $$1.c = $$0.bP.a($$2);
   }
}
