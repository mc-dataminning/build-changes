import java.util.Map.Entry;
import org.joml.Vector3f;

public class ghe implements gha.a {
   private final fff a;
   private static final int b = 2;
   private static final float c = 0.09375F;

   public ghe(fff $$0) {
      this.a = $$0;
   }

   @Override
   public void a(ezy $$0, gdo $$1, double $$2, double $$3, double $$4) {
      dbz $$5 = this.a.r;
      fac $$6 = $$1.getBuffer(gdw.A());
      iz $$7 = iz.a($$2, 0.0, $$4);

      for (int $$8 = -2; $$8 <= 2; $$8++) {
         for (int $$9 = -2; $$9 <= 2; $$9++) {
            dty $$10 = $$5.y($$7.b($$8 * 16, 0, $$9 * 16));

            for (Entry<dxu.a, dxu> $$11 : $$10.e()) {
               dxu.a $$12 = $$11.getKey();
               dbf $$13 = $$10.f();
               Vector3f $$14 = this.a($$12);

               for (int $$15 = 0; $$15 < 16; $$15++) {
                  for (int $$16 = 0; $$16 < 16; $$16++) {
                     int $$17 = kb.a($$13.e, $$15);
                     int $$18 = kb.a($$13.f, $$16);
                     float $$19 = (float)((double)((float)$$5.a($$12, $$17, $$18) + (float)$$12.ordinal() * 0.09375F) - $$3);
                     gdm.b(
                        $$0,
                        $$6,
                        (double)((float)$$17 + 0.25F) - $$2,
                        (double)$$19,
                        (double)((float)$$18 + 0.25F) - $$4,
                        (double)((float)$$17 + 0.75F) - $$2,
                        (double)($$19 + 0.09375F),
                        (double)((float)$$18 + 0.75F) - $$4,
                        $$14.x(),
                        $$14.y(),
                        $$14.z(),
                        1.0F
                     );
                  }
               }
            }
         }
      }
   }

   private Vector3f a(dxu.a $$0) {
      return switch ($$0) {
         case a -> new Vector3f(1.0F, 1.0F, 0.0F);
         case c -> new Vector3f(1.0F, 0.0F, 1.0F);
         case b -> new Vector3f(0.0F, 0.7F, 0.0F);
         case d -> new Vector3f(0.0F, 0.0F, 0.5F);
         case e -> new Vector3f(0.0F, 0.3F, 0.3F);
         case f -> new Vector3f(0.0F, 0.5F, 0.5F);
      };
   }
}
