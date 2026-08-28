import com.google.common.collect.Maps;
import java.util.Map;

public class gxo extends gvb<cjl, hds, gfo> {
   private static final Map<cjl.a, alg> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjl.a.b, alg.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cjl.a.a, alg.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gxo(gwh.a $$0) {
      super($$0, new gfo($$0.a(gjb.bN)), new gfo($$0.a(gjb.bO)), 0.7F);
      this.a(new haq(this, $$0.d()));
   }

   public alg a(hds $$0) {
      return a.get($$0.a);
   }

   public hds b() {
      return new hds();
   }

   public void a(cjl $$0, hds $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
