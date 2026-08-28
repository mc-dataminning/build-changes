import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gog extends gop<cfo, fvt<cfo>> {
   private static final Map<bso.a, akq> a = ImmutableMap.of(
      bso.a.b,
      akq.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bso.a.c,
      akq.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bso.a.d,
      akq.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gog(glz<cfo, fvt<cfo>> $$0) {
      super($$0);
   }

   public void a(fbc $$0, get $$1, int $$2, cfo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ci()) {
         bso.a $$10 = $$3.t();
         if ($$10 != bso.a.a) {
            akq $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
