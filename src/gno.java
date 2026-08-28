public class gno extends gky<ckx, fyb<ckx>> {
   private static final akr a = akr.b("textures/entity/zombie_villager/zombie_villager.png");

   public gno(gkh.a $$0) {
      super($$0, new fyb<>($$0.a(fyh.cl)), 0.5F);
      this.a(new goj<>(this, new fyb($$0.a(fyh.cm)), new fyb($$0.a(fyh.cn)), $$0.g()));
      this.a(new gpe<>(this, $$0.e(), "zombie_villager"));
   }

   public akr a(ckx $$0) {
      return a;
   }

   protected boolean b(ckx $$0) {
      return super.a($$0) || $$0.gv();
   }
}
