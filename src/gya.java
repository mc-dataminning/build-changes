import com.google.common.collect.Maps;
import java.util.Map;

public class gya extends gvn<cjq, hee, gga> {
   private static final Map<cjq.a, alg> a = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjq.a.b, alg.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cjq.a.a, alg.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gya(gwt.a $$0) {
      super($$0, new gga($$0.a(gjn.bN)), new gga($$0.a(gjn.bO)), 0.7F);
      this.a(new hbc(this, $$0.d()));
   }

   public alg a(hee $$0) {
      return a.get($$0.a);
   }

   public hee b() {
      return new hee();
   }

   public void a(cjq $$0, hee $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
