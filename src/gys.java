public class gys extends gwb<coo, heg, ghx<heg>> {
   private static final ale a = ale.b("textures/entity/zombie_villager/zombie_villager.png");

   public gys(gvk.a $$0) {
      super($$0, new ghx<>($$0.a(gif.ek)), new ghx<>($$0.a(gif.el)), 0.5F, gyg.a);
      this.a(new gzn<>(this, new ghx($$0.a(gif.eo)), new ghx($$0.a(gif.ep)), new ghx($$0.a(gif.em)), new ghx($$0.a(gif.en)), $$0.h()));
      this.a(new hai<>(this, $$0.e(), "zombie_villager"));
   }

   public ale a(heg $$0) {
      return a;
   }

   public heg b() {
      return new heg();
   }

   public void a(coo $$0, heg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gx();
      $$1.c = $$0.gy();
      $$1.a = $$0.gh();
   }

   protected boolean b(heg $$0) {
      return super.a($$0) || $$0.b;
   }
}
