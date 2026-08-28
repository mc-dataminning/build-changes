import com.google.common.collect.Maps;
import java.util.Map;

public class gsw extends gqj<cij, gyx, gbb> {
   private static final Map<cij.a, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cij.a.b, alz.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cij.a.a, alz.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gsw(grp.a $$0) {
      super($$0, new gbb($$0.a(gem.by)), new gbb($$0.a(gem.bz)), 0.7F);
      this.a(new gvz(this, $$0.d()));
   }

   public alz a(gyx $$0) {
      return a.get($$0.a);
   }

   public gyx b() {
      return new gyx();
   }

   public void a(cij $$0, gyx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
