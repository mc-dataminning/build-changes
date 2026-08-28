public class hgr extends hgw {
   public hgr(hft $$0) {
      super($$0, aku.b("textures/atlas/mob_effects.png"), aku.b("mob_effects"));
   }

   public hfr a(jr<buc> $$0) {
      return this.a($$0.e().map(akt::a).orElseGet(hfg::c));
   }
}
