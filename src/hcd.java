public class hcd extends hci {
   public hcd(hbf $$0) {
      super($$0, alz.b("textures/atlas/mob_effects.png"), alz.b("mob_effects"));
   }

   public hbe a(jq<bui> $$0) {
      return this.a($$0.e().map(aly::a).orElseGet(hau::b));
   }
}
