public class hpb implements hoj {
   public static final float a = 0.01F;
   public static final float b = 0.001F;
   public static final float c = 1.0E-4F;
   private static final int d = 0;
   private final grb e;
   private final hqf f;
   private int g = 0;

   public hpb(grb $$0, hqf $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   public void a() {
      this.g--;
      if (this.g <= 0 && this.e.bm()) {
         float $$0 = this.e.dV().A.i();
         if ($$0 < 1.0E-4F) {
            this.g = 0;
            this.f.a((hoz)(new hpc.a(this.e, awr.C)));
         } else if ($$0 < 0.001F) {
            this.g = 0;
            this.f.a((hoz)(new hpc.a(this.e, awr.B)));
         } else if ($$0 < 0.01F) {
            this.g = 0;
            this.f.a((hoz)(new hpc.a(this.e, awr.A)));
         }
      }
   }
}
