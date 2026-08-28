import com.google.common.collect.Maps;
import java.util.Map;

public class hcm extends hcy<hfh, gio> {
   private static final alk a = alk.b("invisible");
   private static final Map<clz, alk> b = Maps.newEnumMap(
      Map.of(
         clz.a,
         a,
         clz.b,
         alk.b("textures/entity/horse/horse_markings_white.png"),
         clz.c,
         alk.b("textures/entity/horse/horse_markings_whitefield.png"),
         clz.d,
         alk.b("textures/entity/horse/horse_markings_whitedots.png"),
         clz.e,
         alk.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public hcm(hah<hfh, gio> $$0) {
      super($$0);
   }

   public void a(flq $$0, gsc $$1, int $$2, hfh $$3, float $$4, float $$5) {
      alk $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         flt $$7 = $$1.getBuffer(gsn.j($$6));
         this.d().a($$0, $$7, $$2, gzl.a($$3, 0.0F));
      }
   }
}
