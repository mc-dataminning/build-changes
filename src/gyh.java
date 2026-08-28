import com.google.common.collect.Maps;
import java.util.Map;

public class gyh extends gyt<hba, gem> {
   private static final ald a = ald.b("invisible");
   private static final Map<ckr, ald> b = Maps.newEnumMap(
      Map.of(
         ckr.a,
         a,
         ckr.b,
         ald.b("textures/entity/horse/horse_markings_white.png"),
         ckr.c,
         ald.b("textures/entity/horse/horse_markings_whitefield.png"),
         ckr.d,
         ald.b("textures/entity/horse/horse_markings_whitedots.png"),
         ckr.e,
         ald.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public gyh(gwc<hba, gem> $$0) {
      super($$0);
   }

   public void a(fho $$0, gny $$1, int $$2, hba $$3, float $$4, float $$5) {
      ald $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         fhs $$7 = $$1.getBuffer(goi.j($$6));
         this.d().a($$0, $$7, $$2, gvg.a($$3, 0.0F));
      }
   }
}
