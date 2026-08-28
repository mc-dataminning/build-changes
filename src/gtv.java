public class gtv implements gtd {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gdv e;
   private final guy f;
   private int g = 0;

   public gtv(gdv $$0, guy $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bk()) {
         float $$0 = this.e.dQ().z.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((gtt)(new gtw.a(this.e, avo.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((gtt)(new gtw.a(this.e, avo.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((gtt)(new gtw.a(this.e, avo.A)));
         }
      }
   }
}
