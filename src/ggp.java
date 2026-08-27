import com.google.common.collect.Maps;
import java.util.Map;

public class ggp extends ggo<ccq, fqf<ccq>> {
   private static final Map<ccq.a, ajt> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ccq.a.b, new ajt("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(ccq.a.a, new ajt("textures/entity/cow/red_mooshroom.png"));
   });

   public ggp(gfi.a $$0) {
      super($$0, new fqf<>($$0.a(ftl.aC)), 0.7F);
      this.a(new gjo<>(this, $$0.c()));
   }

   public ajt a(ccq $$0) {
      return a.get($$0.u());
   }
}
