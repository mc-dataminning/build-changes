import com.google.common.collect.Maps;
import java.util.Map;

public class gch extends gcg<cak, fmb<cak>> {
   private static final Map<cak.a, aiy> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cak.a.b, new aiy("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cak.a.a, new aiy("textures/entity/cow/red_mooshroom.png"));
   });

   public gch(gba.a $$0) {
      super($$0, new fmb<>($$0.a(fpi.ay)), 0.7F);
      this.a(new gfg<>(this, $$0.c()));
   }

   public aiy a(cak $$0) {
      return a.get($$0.w());
   }
}
