public class gpx extends gqc {
   public gpx(gpa $$0) {
      super($$0, new alf("textures/atlas/mob_effects.png"), new alf("mob_effects"));
   }

   public goz a(ji<bsa> $$0) {
      if ($$0 == bse.E) {
         fxv $$1 = fff.Q().r;
         if ($$1 != null && $$1.J().b(cpn.c)) {
            return this.a(new alf("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(ale::a).orElseGet(gop::b));
   }
}
