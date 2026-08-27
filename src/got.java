public class got extends goy {
   public got(gnw $$0) {
      super($$0, new akm("textures/atlas/mob_effects.png"), new akm("mob_effects"));
   }

   public gnv a(ix<bra> $$0) {
      if ($$0 == bre.E) {
         fwr $$1 = fdz.Q().r;
         if ($$1 != null && $$1.J().b(col.c)) {
            return this.a(new akm("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(akl::a).orElseGet(gnl::b));
   }
}
