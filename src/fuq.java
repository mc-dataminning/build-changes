import com.google.common.collect.Maps;
import java.util.Map;

public class fuq extends fup<bvg, fey<bvg>> {
   private static final Map<bvg.a, aey> a = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(bvg.a.b, new aey("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(bvg.a.a, new aey("textures/entity/cow/red_mooshroom.png"));
   });

   public fuq(ftj.a $$0) {
      super($$0, new fey<>($$0.a(fid.aw)), 0.7F);
      this.a(new fxm<>(this, $$0.c()));
   }

   public aey a(bvg $$0) {
      return a.get($$0.t());
   }
}
