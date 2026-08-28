import java.util.Map.Entry;
import org.joml.Vector3f;

public class gqc implements gpy.a {
   private final fli a;
   private static final int b = 2;
   private static final float c = 0.09375F;

   public gqc(fli $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fft $$0, glx $$1, double $$2, double $$3, double $$4) {
      dgi $$5 = this.a.s;
      ffx $$6 = $$1.getBuffer(gmh.B());
      ji $$7 = ji.a($$2, 0.0, $$4);

      for (int $$8 = -2; $$8 <= 2; $$8++) {
         for (int $$9 = -2; $$9 <= 2; $$9++) {
            dyr $$10 = $$5.y($$7.b($$8 * 16, 0, $$9 * 16));

            for (Entry<ecr.a, ecr> $$11 : $$10.e()) {
               ecr.a $$12 = $$11.getKey();
               dfn $$13 = $$10.f();
               Vector3f $$14 = this.a($$12);

               for (int $$15 = 0; $$15 < 16; $$15++) {
                  for (int $$16 = 0; $$16 < 16; $$16++) {
                     int $$17 = kk.a($$13.h, $$15);
                     int $$18 = kk.a($$13.i, $$16);
                     float $$19 = (float)((double)((float)$$5.a($$12, $$17, $$18) + (float)$$12.ordinal() * 0.09375F) - $$3);
                     gmr.b(
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

   private Vector3f a(ecr.a $$0) {
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
