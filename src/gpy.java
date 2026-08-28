public class gpy extends gqd {
   public gpy(gpb $$0) {
      super($$0, new alf("textures/atlas/mob_effects.png"), new alf("mob_effects"));
   }

   public gpa a(ji<bsb> $$0) {
      if ($$0 == bsf.E) {
         fxw $$1 = ffg.Q().r;
         if ($$1 != null && $$1.J().b(cpo.c)) {
            return this.a(new alf("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(ale::a).orElseGet(goq::b));
   }
}
