public class gsq implements gry {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gcr e;
   private final gtw f;
   private int g = 0;

   public gsq(gcr $$0, gtw $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bj()) {
         float $$0 = this.e.dP().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gso)(new gsr.a(this.e, awa.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gso)(new gsr.a(this.e, awa.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gso)(new gsr.a(this.e, awa.A)));
         }
      }
   }
}
