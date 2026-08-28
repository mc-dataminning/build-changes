import com.google.common.collect.Maps;
import java.util.Map;

public final class gwa extends gua<ckz, hcf, gfp> {
   private static final Map<clg, ale> a = Maps.newEnumMap(
      Map.of(
         clg.a,
         ale.b("textures/entity/horse/horse_white.png"),
         clg.b,
         ale.b("textures/entity/horse/horse_creamy.png"),
         clg.c,
         ale.b("textures/entity/horse/horse_chestnut.png"),
         clg.d,
         ale.b("textures/entity/horse/horse_brown.png"),
         clg.e,
         ale.b("textures/entity/horse/horse_black.png"),
         clg.f,
         ale.b("textures/entity/horse/horse_gray.png"),
         clg.g,
         ale.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gwa(gvk.a $$0) {
      super($$0, new gfp($$0.a(gif.bj)), new gfp($$0.a(gif.bm)));
      this.a(new gzm(this));
      this.a(new haa<>(this, $$0.h(), hkf.d.e, $$0x -> $$0x.i, new gfp($$0.a(gif.bk)), new gfp($$0.a(gif.bn))));
      this.a(new haa<>(this, $$0.h(), hkf.d.j, $$0x -> $$0x.b, new gfe($$0.a(gif.bl)), new gfe($$0.a(gif.bo))));
   }

   public ale a(hcf $$0) {
      return a.get($$0.a);
   }

   public hcf b() {
      return new hcf();
   }

   public void a(ckz $$0, hcf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.aj().v();
   }
}
