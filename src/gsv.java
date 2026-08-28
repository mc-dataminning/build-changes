import com.google.common.collect.Maps;
import java.util.Map;

public class gsv extends gqi<cij, gyw, gba> {
   private static final Map<cij.a, alz> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cij.a.b, alz.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cij.a.a, alz.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gsv(gro.a $$0) {
      super($$0, new gba($$0.a(gel.by)), new gba($$0.a(gel.bz)), 0.7F);
      this.a(new gvy(this, $$0.d()));
   }

   public alz a(gyw $$0) {
      return a.get($$0.a);
   }

   public gyw b() {
      return new gyw();
   }

   public void a(cij $$0, gyw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
