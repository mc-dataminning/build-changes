public class ghv extends ghw {
   protected final gjc a;

   public ghv(gjc $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gjk a() {
      gjk $$0 = new gjk();
      gjm $$1 = $$0.a();
      $$1.a("head", gjh.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gje.a);
      return $$0;
   }

   public static gji b() {
      gjk $$0 = a();
      gjm $$1 = $$0.a();
      $$1.b("head").a("hat", gjh.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gjg(0.25F)), gje.a);
      return gji.a($$0, 64, 64);
   }

   public static gji c() {
      gjk $$0 = a();
      return gji.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
