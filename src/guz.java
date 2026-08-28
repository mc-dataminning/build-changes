import java.util.function.Function;

public enum guz {
   a("movement", guu::new),
   b("find_tree", gut::new),
   c("punch_tree", guw::new),
   d("open_inventory", guv::new),
   e("craft_planks", gus::new),
   f("none", gur::new);

   private final String g;
   private final Function<gux, ? extends guy> h;

   private <T extends guy> guz(final String $$0, final Function<gux, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public guy a(gux $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static guz a(String $$0) {
      for (guz $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
