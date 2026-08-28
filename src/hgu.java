import javax.annotation.Nullable;

public class hgu extends hfe {
   private static final alr j = alr.b("textures/entity/wolf/wolf.png");
   public boolean a;
   public boolean b;
   public float c = (float) (Math.PI / 5);
   public float d;
   public float e;
   public float f = 1.0F;
   public alr g = j;
   @Nullable
   public czi h;
   public dak i = dak.l;

   public float a(float $$0) {
      float $$1 = (this.e + $$0) / 1.8F;
      if ($$1 < 0.0F) {
         $$1 = 0.0F;
      } else if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return azz.a($$1 * (float) Math.PI) * azz.a($$1 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }
}
