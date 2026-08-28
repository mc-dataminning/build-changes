import com.google.common.collect.Maps;
import java.util.Map;

public class gkn extends gkm<cfb, fub<cfb>> {
   private static final Map<cfb.a, akk> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfb.a.b, new akk("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cfb.a.a, new akk("textures/entity/cow/red_mooshroom.png"));
   });

   public gkn(gjg.a $$0) {
      super($$0, new fub<>($$0.a(fxh.aC)), 0.7F);
      this.a(new gnn<>(this, $$0.c()));
   }

   public akk a(cfb $$0) {
      return a.get($$0.u());
   }
}
