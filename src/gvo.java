import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class gvo extends gvy<gyh, gbu> {
   private static final Map<bvc.a, alz> a = ImmutableMap.of(
      bvc.a.b,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      bvc.a.c,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      bvc.a.d,
      alz.b("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public gvo(gtg<gyh, gbu> $$0) {
      super($$0);
   }

   public void a(fgl $$0, gle $$1, int $$2, gyh $$3, float $$4, float $$5) {
      if (!$$3.u) {
         bvc.a $$6 = $$3.c;
         if ($$6 != bvc.a.a) {
            alz $$7 = a.get($$6);
            b(this.d(), $$7, $$0, $$1, $$2, $$3, -1);
         }
      }
   }
}
