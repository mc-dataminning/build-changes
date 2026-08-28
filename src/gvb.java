import java.util.function.Function;

public enum gvb {
   a("movement", guw::new),
   b("find_tree", guv::new),
   c("punch_tree", guy::new),
   d("open_inventory", gux::new),
   e("craft_planks", guu::new),
   f("none", gut::new);

   private final String g;
   private final Function<guz, ? extends gva> h;

   private <T extends gva> gvb(final String $$0, final Function<guz, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gva a(guz $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gvb a(String $$0) {
      for (gvb $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
