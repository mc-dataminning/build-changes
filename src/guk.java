import com.google.common.collect.Maps;
import java.util.Map;

public class guk extends grx<cic, hao, gcq> {
   private static final Map<cic.a, aku> a = af.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cic.a.b, aku.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cic.a.a, aku.b("textures/entity/cow/red_mooshroom.png"));
   });

   public guk(gtd.a $$0) {
      super($$0, new gcq($$0.a(ggb.bD)), new gcq($$0.a(ggb.bE)), 0.7F);
      this.a(new gxn(this, $$0.d()));
   }

   public aku a(hao $$0) {
      return a.get($$0.a);
   }

   public hao b() {
      return new hao();
   }

   public void a(cic $$0, hao $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
