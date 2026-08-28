public class his implements hia {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final gkx e;
   private final hjw f;
   private int g = 0;

   public his(gkx $$0, hjw $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bo()) {
         float $$0 = this.e.dV().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hiq)(new hit.a(this.e, awa.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hiq)(new hit.a(this.e, awa.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hiq)(new hit.a(this.e, awa.A)));
         }
      }
   }
}
