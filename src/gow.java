public class gow extends gov {
   private final fpd c;

   public gow(fpd $$0) {
      this.c = $$0;
   }

   private static float a(boolean $$0, boolean $$1) {
      if ($$0 == $$1) {
         return 0.0F;
      } else {
         return $$0 ? 1.0F : -1.0F;
      }
   }

   @Override
   public void a() {
      this.a = new cra(this.c.v.e(), this.c.x.e(), this.c.w.e(), this.c.y.e(), this.c.z.e(), this.c.A.e(), this.c.B.e());
      float $$0 = a(this.a.a(), this.a.b());
      float $$1 = a(this.a.c(), this.a.d());
      this.b = new fep($$1, $$0).a();
   }
}
