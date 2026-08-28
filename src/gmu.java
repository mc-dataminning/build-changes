public class gmu extends gmr<coa, gsw> {
   private static final alb a = alb.b("textures/entity/illager/evoker_fangs.png");
   private final fxb b;

   public gmu(gms.a $$0) {
      super($$0);
      this.b = new fxb($$0.a(gaa.ay));
   }

   public void a(gsw $$0, fcu $$1, ggv $$2, int $$3) {
      float $$4 = $$0.b;
      if ($$4 != 0.0F) {
         $$1.a();
         $$1.a(a.d.rotationDegrees(90.0F - $$0.a));
         $$1.b(-1.0F, -1.0F, 1.0F);
         $$1.a(0.0F, -1.501F, 0.0F);
         this.b.a($$0);
         fcy $$5 = $$2.getBuffer(this.b.a(a));
         this.b.a($$1, $$5, $$3, gwb.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public alb a(gsw $$0) {
      return a;
   }

   public gsw a() {
      return new gsw();
   }

   public void a(coa $$0, gsw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dI();
      $$1.b = $$0.a($$2);
   }
}
