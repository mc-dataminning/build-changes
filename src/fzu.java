import com.google.common.collect.Maps;
import java.util.Map;

public class fzu extends fzt<byl, fjq<byl>> {
   private static final Map<byl.a, ahg> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(byl.a.b, new ahg("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(byl.a.a, new ahg("textures/entity/cow/red_mooshroom.png"));
   });

   public fzu(fyn.a $$0) {
      super($$0, new fjq<>($$0.a(fmw.az)), 0.7F);
      this.a(new gct<>(this, $$0.c()));
   }

   public ahg a(byl $$0) {
      return a.get($$0.w());
   }
}
