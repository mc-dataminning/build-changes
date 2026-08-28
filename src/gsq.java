import com.google.common.collect.Maps;
import java.util.Map;

public class gsq extends gqd<cif, gyr, gav> {
   private static final Map<cif.a, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cif.a.b, alz.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cif.a.a, alz.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gsq(grj.a $$0) {
      super($$0, new gav($$0.a(geg.by)), new gav($$0.a(geg.bz)), 0.7F);
      this.a(new gvt(this, $$0.d()));
   }

   public alz a(gyr $$0) {
      return a.get($$0.a);
   }

   public gyr b() {
      return new gyr();
   }

   public void a(cif $$0, gyr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
