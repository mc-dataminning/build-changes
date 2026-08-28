public class gss extends gqb<cms, gye, gcc<gye>> {
   private static final alj a = alj.b("textures/entity/zombie_villager/zombie_villager.png");

   public gss(gpk.a $$0) {
      super($$0, new gcc<>($$0.a(gck.dN)), new gcc<>($$0.a(gck.dO)), 0.5F, gsg.a);
      this.a(new gto<>(this, new gcc($$0.a(gck.dR)), new gcc($$0.a(gck.dS)), new gcc($$0.a(gck.dP)), new gcc($$0.a(gck.dQ)), $$0.h()));
      this.a(new gui<>(this, $$0.e(), "zombie_villager"));
   }

   public alj a(gye $$0) {
      return a;
   }

   public gye b() {
      return new gye();
   }

   public void a(cms $$0, gye $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gw();
      $$1.c = $$0.gx();
      $$1.a = $$0.gb();
   }

   protected boolean b(gye $$0) {
      return super.a($$0) || $$0.b;
   }
}
