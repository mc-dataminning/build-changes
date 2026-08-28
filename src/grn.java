import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class grn extends grw<gue, fxz> {
   private static final Map<btl.a, alc> a = ImmutableMap.of(
      btl.a.b,
      alc.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      btl.a.c,
      alc.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      btl.a.d,
      alc.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public grn(gpf<gue, fxz> $$0) {
      super($$0);
   }

   public void a(fde $$0, ghg $$1, int $$2, gue $$3, float $$4, float $$5) {
      if (!$$3.u) {
         btl.a $$6 = $$3.c;
         if ($$6 != btl.a.a) {
            alc $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
