public class goa extends gli<cjy, fyl<cjy>> {
   private static final akt a = new akt("textures/entity/zombie_villager/zombie_villager.png");

   public goa(gkq.a $$0) {
      super($$0, new fyl<>($$0.a(fyr.cq)), 0.5F);
      this.a(new gov<>(this, new fyl($$0.a(fyr.cr)), new fyl($$0.a(fyr.cs)), $$0.g()));
      this.a(new gpt<>(this, $$0.e(), "zombie_villager"));
   }

   public akt a(cjy $$0) {
      return a;
   }

   protected boolean b(cjy $$0) {
      return super.a($$0) || $$0.gC();
   }
}
