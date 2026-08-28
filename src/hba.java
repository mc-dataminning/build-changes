import com.google.common.collect.Maps;
import java.util.Map;

public class hba extends hbm<hdv, ghb> {
   private static final alg a = alg.b("invisible");
   private static final Map<clm, alg> b = Maps.newEnumMap(
      Map.of(
         clm.a,
         a,
         clm.b,
         alg.b("textures/entity/horse/horse_markings_white.png"),
         clm.c,
         alg.b("textures/entity/horse/horse_markings_whitefield.png"),
         clm.d,
         alg.b("textures/entity/horse/horse_markings_whitedots.png"),
         clm.e,
         alg.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public hba(gyv<hdv, ghb> $$0) {
      super($$0);
   }

   public void a(fkd $$0, gqr $$1, int $$2, hdv $$3, float $$4, float $$5) {
      alg $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         fkh $$7 = $$1.getBuffer(grc.j($$6));
         this.d().a($$0, $$7, $$2, gxz.a($$3, 0.0F));
      }
   }
}
