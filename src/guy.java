import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class guy extends gut<ckj, hbm, gel> {
   private static final Map<ckj.e, alg> a = af.a(Maps.newHashMap(), $$0 -> {
      for (ckj.e $$1 : ckj.e.values()) {
         $$0.put($$1, alg.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public guy(gvz.a $$0) {
      super($$0, new gel($$0.a(git.m)), new gel($$0.a(git.n)), 0.5F);
   }

   public alg a(hbm $$0) {
      return a.get($$0.a);
   }

   public hbm a() {
      return new hbm();
   }

   public void a(ckj $$0, hbm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
      $$1.b = $$0.bM.a($$2);
      $$1.d = $$0.bN.a($$2);
      $$1.e = $$0.bO.a($$2);
      $$1.c = $$0.bP.a($$2);
   }
}
