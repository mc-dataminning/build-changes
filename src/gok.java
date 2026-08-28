import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gok extends got<cfq, fvx<cfq>> {
   private static final Map<bsp.a, akr> a = ImmutableMap.of(
      bsp.a.b,
      akr.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bsp.a.c,
      akr.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bsp.a.d,
      akr.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gok(gmd<cfq, fvx<cfq>> $$0) {
      super($$0);
   }

   public void a(fbg $$0, gex $$1, int $$2, cfq $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         bsp.a $$10 = $$3.t();
         if ($$10 != bsp.a.a) {
            akr $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
