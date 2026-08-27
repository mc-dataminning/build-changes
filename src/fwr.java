import com.google.common.collect.Maps;
import java.util.Map;

public class fwr extends fwq<bww, fgv<bww>> {
   private static final Map<bww.a, agg> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bww.a.b, new agg("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bww.a.a, new agg("textures/entity/cow/red_mooshroom.png"));
   });

   public fwr(fvk.a $$0) {
      super($$0, new fgv<>($$0.a(fka.aw)), 0.7F);
      this.a(new fzn<>(this, $$0.c()));
   }

   public agg a(bww $$0) {
      return a.get($$0.t());
   }
}
