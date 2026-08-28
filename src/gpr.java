import com.google.common.collect.Maps;
import java.util.Map;

public class gpr extends gnf<che, gvq, fyb> {
   private static final Map<che.a, ali> a = ae.a(Maps.newHashMap(), $$0 -> {
      $$0.put(che.a.b, ali.b("textures/entity/cow/brown_mooshroom.png"));
      $$0.put(che.a.a, ali.b("textures/entity/cow/red_mooshroom.png"));
   });

   public gpr(gok.a $$0) {
      super($$0, new fyb($$0.a(gbl.bj)), new fyb($$0.a(gbl.bk)), 0.7F);
      this.a(new gss(this, $$0.d()));
   }

   public ali a(gvq $$0) {
      return a.get($$0.a);
   }

   public gvq c() {
      return new gvq();
   }

   public void a(che $$0, gvq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
