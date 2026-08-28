import javax.annotation.Nullable;

public class gxr extends gwb {
   private static final all j = all.b("textures/entity/wolf/wolf.png");
   public boolean a;
   public boolean b;
   public float c = (float) (Math.PI / 5);
   public float d;
   public float e;
   public float f = 1.0F;
   public all g = j;
   @Nullable
   public cvc h;
   public cwf i = cwf.k;

   public float a(float $$0) {
      float $$1 = (this.e + $$0) / 1.8F;
      if ($$1 < 0.0F) {
         $$1 = 0.0F;
      } else if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return azn.a($$1 * (float) Math.PI) * azn.a($$1 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }
}
