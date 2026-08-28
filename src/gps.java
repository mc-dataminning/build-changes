public class gps extends gpx {
   public gps(gov $$0) {
      super($$0, new alb("textures/atlas/mob_effects.png"), new alb("mob_effects"));
   }

   public gou a(ji<brv> $$0) {
      if ($$0 == brz.E) {
         fxq $$1 = ffa.Q().r;
         if ($$1 != null && $$1.J().b(cpi.c)) {
            return this.a(new alb("bad_omen_121"));
         }
      }

      return this.a($$0.e().map(ala::a).orElseGet(gok::b));
   }
}
