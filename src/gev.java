import java.util.function.Function;

public enum gev {
   a("movement", geq::new),
   b("find_tree", gep::new),
   c("punch_tree", ges::new),
   d("open_inventory", ger::new),
   e("craft_planks", geo::new),
   f("none", gen::new);

   private final String g;
   private final Function<get, ? extends geu> h;

   private <T extends geu> gev(String $$0, Function<get, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public geu a(get $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gev a(String $$0) {
      for (gev $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
