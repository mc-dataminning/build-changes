import java.util.function.Function;

public enum gva {
   a("movement", guv::new),
   b("find_tree", guu::new),
   c("punch_tree", gux::new),
   d("open_inventory", guw::new),
   e("craft_planks", gut::new),
   f("none", gus::new);

   private final String g;
   private final Function<guy, ? extends guz> h;

   private <T extends guz> gva(final String $$0, final Function<guy, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public guz a(guy $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gva a(String $$0) {
      for (gva $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
