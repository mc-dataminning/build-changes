import com.google.common.collect.Maps;
import java.util.Map;

public class gca extends gbz<cag, flu<cag>> {
   private static final Map<cag.a, aiy> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cag.a.b, new aiy("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(cag.a.a, new aiy("textures/entity/cow/red_mooshroom.png"));
   });

   public gca(gat.a $$0) {
      super($$0, new flu<>($$0.a(fpb.ay)), 0.7F);
      this.a(new gez<>(this, $$0.c()));
   }

   public aiy a(cag $$0) {
      return a.get($$0.w());
   }
}
