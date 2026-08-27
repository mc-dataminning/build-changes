public class gio extends gfz<cht, ftf<cht>> {
   private static final ajt a = new ajt("textures/entity/zombie_villager/zombie_villager.png");

   public gio(gfi.a $$0) {
      super($$0, new ftf<>($$0.a(ftl.ck)), 0.5F);
      this.a(new gjj<>(this, new ftf($$0.a(ftl.cl)), new ftf($$0.a(ftl.cm)), $$0.g()));
      this.a(new gke<>(this, $$0.e(), "zombie_villager"));
   }

   public ajt a(cht $$0) {
      return a;
   }

   protected boolean b(cht $$0) {
      return super.a($$0) || $$0.gx();
   }
}
