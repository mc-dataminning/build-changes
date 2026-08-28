public class gpz extends gqe {
   public gpz(gpc $$0) {
      super($$0, new alf("textures/atlas/mob_effects.png"), new alf("mob_effects"));
   }

   public gpb a(ji<bsc> $$0) {
      if ($$0 == bsg.E) {
         fxx $$1 = ffh.Q().r;
         if ($$1 != null && $$1.J().b(cpp.c)) {
            return this.a(new alf("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(ale::a).orElseGet(gor::b));
   }
}
