import com.google.common.collect.Maps;
import java.util.Map;

public final class gtt extends grt<cjy, gzz, gdl> {
   private static final Map<ckf, aku> a = Maps.newEnumMap(
      Map.of(
         ckf.a,
         aku.b("textures/entity/horse/horse_white.png"),
         ckf.b,
         aku.b("textures/entity/horse/horse_creamy.png"),
         ckf.c,
         aku.b("textures/entity/horse/horse_chestnut.png"),
         ckf.d,
         aku.b("textures/entity/horse/horse_brown.png"),
         ckf.e,
         aku.b("textures/entity/horse/horse_black.png"),
         ckf.f,
         aku.b("textures/entity/horse/horse_gray.png"),
         ckf.g,
         aku.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gtt(gtd.a $$0) {
      super($$0, new gdl($$0.a(ggb.bf)), new gdl($$0.a(ggb.bh)));
      this.a(new gxg(this));
      this.a(new gxf(this, $$0.f(), $$0.h()));
   }

   public aku a(gzz $$0) {
      return a.get($$0.a);
   }

   public gzz b() {
      return new gzz();
   }

   public void a(cjy $$0, gzz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.aj().v();
   }
}
