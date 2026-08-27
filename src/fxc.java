import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxc extends fxl<bvj, ffn<bvj>> {
   private static final Map<bvj.a, aez> a = ImmutableMap.of(
      bvj.a.b,
      new aez("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvj.a.c,
      new aez("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvj.a.d,
      new aez("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fxc(fuy<bvj, ffn<bvj>> $$0) {
      super($$0);
   }

   public void a(elj $$0, foa $$1, int $$2, bvj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         bvj.a $$10 = $$3.t();
         if ($$10 != bvj.a.a) {
            aez $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
