public class gpw extends gqb {
   public gpw(goz $$0) {
      super($$0, new ale("textures/atlas/mob_effects.png"), new ale("mob_effects"));
   }

   public goy a(ji<brz> $$0) {
      if ($$0 == bsd.E) {
         fxu $$1 = ffe.Q().r;
         if ($$1 != null && $$1.J().b(cpm.c)) {
            return this.a(new ale("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(ald::a).orElseGet(goo::b));
   }
}
