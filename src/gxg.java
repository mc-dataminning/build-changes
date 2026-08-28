import com.google.common.collect.Maps;
import java.util.Map;

public class gxg extends gxs<gzz, gdl> {
   private static final aku a = aku.b("invisible");
   private static final Map<cka, aku> b = Maps.newEnumMap(
      Map.of(
         cka.a,
         a,
         cka.b,
         aku.b("textures/entity/horse/horse_markings_white.png"),
         cka.c,
         aku.b("textures/entity/horse/horse_markings_whitefield.png"),
         cka.d,
         aku.b("textures/entity/horse/horse_markings_whitedots.png"),
         cka.e,
         aku.b("textures/entity/horse/horse_markings_blackdots.png")
      )
   );

   public gxg(gva<gzz, gdl> $$0) {
      super($$0);
   }

   public void a(fgr $$0, gmx $$1, int $$2, gzz $$3, float $$4, float $$5) {
      aku $$6 = b.get($$3.h);
      if ($$6 != a && !$$3.z) {
         fgv $$7 = $$1.getBuffer(gnh.j($$6));
         this.d().a($$0, $$7, $$2, gue.a($$3, 0.0F));
      }
   }
}
