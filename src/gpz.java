public class gpz extends gnj<clp, gvk, fzs<gvk>> {
   private static final alb a = alb.b("textures/entity/zombie_villager/zombie_villager.png");

   public gpz(gms.a $$0) {
      super($$0, new fzs<>($$0.a(gaa.du)), new fzs<>($$0.a(gaa.dx)), 0.5F, gpn.a);
      this.a(new gqv<>(this, new fzs($$0.a(gaa.dv)), new fzs($$0.a(gaa.dw)), new fzs($$0.a(gaa.dy)), new fzs($$0.a(gaa.dz)), $$0.g()));
      this.a(new grp<>(this, $$0.e(), "zombie_villager"));
   }

   public alb a(gvk $$0) {
      return a;
   }

   public gvk c() {
      return new gvk();
   }

   public void a(clp $$0, gvk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
   }

   protected boolean b(gvk $$0) {
      return super.a($$0) || $$0.b;
   }
}
