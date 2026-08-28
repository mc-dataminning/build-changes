public class gsh extends gpr<cmp, gxt, gbt<gxt>> {
   private static final all a = all.b("textures/entity/zombie_villager/zombie_villager.png");

   public gsh(gpa.a $$0) {
      super($$0, new gbt<>($$0.a(gcb.dv)), new gbt<>($$0.a(gcb.dy)), 0.5F, grv.a);
      this.a(new gtd<>(this, new gbt($$0.a(gcb.dw)), new gbt($$0.a(gcb.dx)), new gbt($$0.a(gcb.dz)), new gbt($$0.a(gcb.dA)), $$0.h()));
      this.a(new gtx<>(this, $$0.e(), "zombie_villager"));
   }

   public all a(gxt $$0) {
      return a;
   }

   public gxt c() {
      return new gxt();
   }

   public void a(cmp $$0, gxt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gE();
      $$1.c = $$0.gF();
      $$1.a = $$0.gk();
   }

   protected boolean b(gxt $$0) {
      return super.a($$0) || $$0.b;
   }
}
