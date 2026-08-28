public class gpv extends gqa {
   public gpv(goy $$0) {
      super($$0, new ale("textures/atlas/mob_effects.png"), new ale("mob_effects"));
   }

   public gox a(ji<bry> $$0) {
      if ($$0 == bsc.E) {
         fxt $$1 = ffd.Q().r;
         if ($$1 != null && $$1.J().b(cpl.c)) {
            return this.a(new ale("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(ald::a).orElseGet(gon::b));
   }
}
