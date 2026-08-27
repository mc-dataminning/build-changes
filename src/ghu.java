import com.google.common.collect.Maps;
import java.util.Map;

public class ghu extends ght<cdg, frk<cdg>> {
   private static final Map<cdg.a, akf> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cdg.a.b, new akf("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cdg.a.a, new akf("textures/entity/cow/red_mooshroom.png"));
   });

   public ghu(ggn.a $$0) {
      super($$0, new frk<>($$0.a(fuq.aC)), 0.7F);
      this.a(new gkt<>(this, $$0.c()));
   }

   public akf a(cdg $$0) {
      return a.get($$0.u());
   }
}
