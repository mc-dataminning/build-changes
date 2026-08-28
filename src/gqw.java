import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gqw extends grf<gtn, fxp> {
   private static final Map<btg.a, alb> a = ImmutableMap.of(
      btg.a.b,
      alb.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      btg.a.c,
      alb.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      btg.a.d,
      alb.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gqw(goo<gtn, fxp> $$0) {
      super($$0);
   }

   public void a(fcu $$0, ggv $$1, int $$2, gtn $$3, float $$4, float $$5) {
      if (!$$3.u) {
         btg.a $$6 = $$3.c;
         if ($$6 != btg.a.a) {
            alb $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
