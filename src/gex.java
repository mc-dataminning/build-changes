import java.util.function.Function;

public enum gex {
   a("movement", ges::new),
   b("find_tree", ger::new),
   c("punch_tree", geu::new),
   d("open_inventory", get::new),
   e("craft_planks", geq::new),
   f("none", gep::new);

   private final String g;
   private final Function<gev, ? extends gew> h;

   private <T extends gew> gex(String $$0, Function<gev, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gew a(gev $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gex a(String $$0) {
      for (gex $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
