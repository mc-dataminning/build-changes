import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fww extends fxf<buv, ffi<buv>> {
   private static final Map<buv.a, aer> a = ImmutableMap.of(
      buv.a.b,
      new aer("textures/entity/iron_golem/iron_golem_crackiness_low.png"),
      buv.a.c,
      new aer("textures/entity/iron_golem/iron_golem_crackiness_medium.png"),
      buv.a.d,
      new aer("textures/entity/iron_golem/iron_golem_crackiness_high.png")
   );

   public fww(fus<buv, ffi<buv>> $$0) {
      super($$0);
   }

   public void a(elf $$0, fnu $$1, int $$2, buv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         buv.a $$10 = $$3.q();
         if ($$10 != buv.a.a) {
            aer $$11 = a.get($$10);
            a(this.c(), $$11, $$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F);
         }
      }
   }
}
