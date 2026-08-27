import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxb extends fxk<buy, ffn<buy>> {
   private static final Map<buy.a, aeu> a = ImmutableMap.of(
      buy.a.b,
      new aeu("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buy.a.c,
      new aeu("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buy.a.d,
      new aeu("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fxb(fux<buy, ffn<buy>> $$0) {
      super($$0);
   }

   public void a(elk $$0, fnz $$1, int $$2, buy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         buy.a $$10 = $$3.q();
         if ($$10 != buy.a.a) {
            aeu $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
