import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gbq extends gbz<bxu, fjn<bxu>> {
   private static final Map<bxu.a, agt> a = ImmutableMap.of(
      bxu.a.b,
      new agt("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bxu.a.c,
      new agt("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bxu.a.d,
      new agt("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gbq(fzj<bxu, fjn<bxu>> $$0) {
      super($$0);
   }

   public void a(epd $$0, fsi $$1, int $$2, bxu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         bxu.a $$10 = $$3.w();
         if ($$10 != bxu.a.a) {
            agt $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
