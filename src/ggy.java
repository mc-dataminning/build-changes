public class ggy implements ggg {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final frk e;
   private final gia f;
   private int g = 0;

   public ggy(frk $$0, gia $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.be()) {
         float $$0 = this.e.dM().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((ggw)(new ggz.a(this.e, arc.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((ggw)(new ggz.a(this.e, arc.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((ggw)(new ggz.a(this.e, arc.A)));
         }
      }
   }
}
