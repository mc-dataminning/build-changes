public class got extends goy {
   public got(gnw $$0) {
      super($$0, new akn("textures/atlas/mob_effects.png"), new akn("mob_effects"));
   }

   public gnv a(ix<brc> $$0) {
      if ($$0 == brg.E) {
         fwr $$1 = feb.Q().r;
         if ($$1 != null && $$1.J().b(coo.c)) {
            return this.a(new akn("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(akm::a).orElseGet(gnl::b));
   }
}
