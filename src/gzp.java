import com.google.common.collect.Maps;
import java.util.Map;

public class gzp extends gxc<ckb, hfu, ghq> {
   private static final Map<ckb.a, ali> a = ag.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ckb.a.b, ali.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(ckb.a.a, ali.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gzp(gyi.a $$0) {
      super($$0, new ghq($$0.a(gld.bN)), new ghq($$0.a(gld.bO)), 0.7F);
      this.a(new hcr(this, $$0.d()));
   }

   public ali a(hfu $$0) {
      return a.get($$0.a);
   }

   public hfu b() {
      return new hfu();
   }

   public void a(ckb $$0, hfu $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
