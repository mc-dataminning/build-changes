import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxg extends fxp<bvd, ffs<bvd>> {
   private static final Map<bvd.a, aex> a = ImmutableMap.of(
      bvd.a.b,
      new aex("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvd.a.c,
      new aex("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvd.a.d,
      new aex("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fxg(fvc<bvd, ffs<bvd>> $$0) {
      super($$0);
   }

   public void a(elp $$0, foe $$1, int $$2, bvd $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         bvd.a $$10 = $$3.t();
         if ($$10 != bvd.a.a) {
            aex $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
