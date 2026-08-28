import javax.annotation.Nullable;

public class hhe extends hfp {
   private static final ali j = ali.b("textures/entity/wolf/wolf.png");
   public boolean a;
   public boolean b;
   public float c = (float) (Math.PI / 5);
   public float d;
   public float e;
   public float f = 1.0F;
   public ali g = j;
   @Nullable
   public cyw h;
   public czy i = czy.k;

   public float a(float $$0) {
      float $$1 = (this.e + $$0) / 1.8F;
      if ($$1 < 0.0F) {
         $$1 = 0.0F;
      } else if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return azo.a($$1 * (float) Math.PI) * azo.a($$1 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }
}
