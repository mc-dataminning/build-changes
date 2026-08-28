import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gxh extends gxc<ckz, hdw, ggu> {
   private static final Map<ckz.e, ali> a = ag.a(Maps.newHashMap(), $$0 -> {
      for (ckz.e $$1 : ckz.e.values()) {
         $$0.put($$1, ali.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public gxh(gyi.a $$0) {
      super($$0, new ggu($$0.a(gld.m)), new ggu($$0.a(gld.n)), 0.5F);
   }

   public ali a(hdw $$0) {
      return a.get($$0.a);
   }

   public hdw a() {
      return new hdw();
   }

   public void a(ckz $$0, hdw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bP.a($$2);
      $$1.d = $$0.bQ.a($$2);
      $$1.e = $$0.bR.a($$2);
      $$1.c = $$0.bS.a($$2);
   }
}
