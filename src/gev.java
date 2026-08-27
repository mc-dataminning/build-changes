import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gev extends gfe<caf, fmq<caf>> {
   private static final Map<caf.a, aiy> a = ImmutableMap.of(
      caf.a.b,
      new aiy("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      caf.a.c,
      new aiy("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      caf.a.d,
      new aiy("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gev(gco<caf, fmq<caf>> $$0) {
      super($$0);
   }

   public void a(esa $$0, fvm $$1, int $$2, caf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         caf.a $$10 = $$3.w();
         if ($$10 != caf.a.a) {
            aiy $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
