import com.google.common.collect.Maps;
import java.util.Map;

public class gxg extends gut<cjh, hdk, gfg> {
   private static final Map<cjh.a, alg> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjh.a.b, alg.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cjh.a.a, alg.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gxg(gvz.a $$0) {
      super($$0, new gfg($$0.a(git.bL)), new gfg($$0.a(git.bM)), 0.7F);
      this.a(new hai(this, $$0.d()));
   }

   public alg a(hdk $$0) {
      return a.get($$0.a);
   }

   public hdk b() {
      return new hdk();
   }

   public void a(cjh $$0, hdk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
