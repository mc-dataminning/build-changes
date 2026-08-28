import com.google.common.collect.Maps;
import java.util.Map;

public class gzc extends gwp<ckm, hfj, ghd> {
   private static final Map<ckm.a, alr> a = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ckm.a.b, alr.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(ckm.a.a, alr.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gzc(gxv.a $$0) {
      super($$0, new ghd($$0.a(gkq.bN)), new ghd($$0.a(gkq.bO)), 0.7F);
      this.a(new hce(this, $$0.d()));
   }

   public alr a(hfj $$0) {
      return a.get($$0.a);
   }

   public hfj b() {
      return new hfj();
   }

   public void a(ckm $$0, hfj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.p();
   }
}
