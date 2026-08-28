import com.google.common.collect.Maps;
import java.util.Map;

public final class gza extends gxa<clx, hfh, gio> {
   private static final Map<cme, alk> a = Maps.newEnumMap(
      Map.of(
         cme.a,
         alk.b("textures/entity/horse/horse_white.png"),
         cme.b,
         alk.b("textures/entity/horse/horse_creamy.png"),
         cme.c,
         alk.b("textures/entity/horse/horse_chestnut.png"),
         cme.d,
         alk.b("textures/entity/horse/horse_brown.png"),
         cme.e,
         alk.b("textures/entity/horse/horse_black.png"),
         cme.f,
         alk.b("textures/entity/horse/horse_gray.png"),
         cme.g,
         alk.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gza(gyk.a $$0) {
      super($$0, new gio($$0.a(glf.bn)), new gio($$0.a(glf.bq)));
      this.a(new hcm(this));
      this.a(new hdb<>(this, $$0.h(), hni.d.e, $$0x -> $$0x.i, new gio($$0.a(glf.bo)), new gio($$0.a(glf.br))));
      this.a(new hdb<>(this, $$0.h(), hni.d.j, $$0x -> $$0x.b, new gid($$0.a(glf.bp)), new gid($$0.a(glf.bs))));
   }

   public alk a(hfh $$0) {
      return a.get($$0.a);
   }

   public hfh b() {
      return new hfh();
   }

   public void a(clx $$0, hfh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fY().v();
   }
}
