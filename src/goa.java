import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class goa extends gnv<cih, gum, fyb> {
   private static final Map<cih.e, all> a = ae.a(Maps.newHashMap(), $$0 -> {
      for (cih.e $$1 : cih.e.values()) {
         $$0.put($$1, all.b(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", $$1.b())));
      }
   });

   public goa(gpa.a $$0) {
      super($$0, new fyb($$0.a(gcb.k)), new fyb($$0.a(gcb.l)), 0.5F);
   }

   public all a(gum $$0) {
      return a.get($$0.a);
   }

   public gum a() {
      return new gum();
   }

   public void a(cih $$0, gum $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gv();
      $$1.b = $$0.cf.a($$2);
      $$1.d = $$0.cg.a($$2);
      $$1.e = $$0.ch.a($$2);
      $$1.c = $$0.ci.a($$2);
   }
}
