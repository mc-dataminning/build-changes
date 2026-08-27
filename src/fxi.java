import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fxi extends fxr<bvf, ffu<bvf>> {
   private static final Map<bvf.a, aey> a = ImmutableMap.of(
      bvf.a.b,
      new aey("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvf.a.c,
      new aey("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvf.a.d,
      new aey("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fxi(fve<bvf, ffu<bvf>> $$0) {
      super($$0);
   }

   public void a(elr $$0, fog $$1, int $$2, bvf $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         bvf.a $$10 = $$3.t();
         if ($$10 != bvf.a.a) {
            aey $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
