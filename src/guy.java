import java.util.function.Function;

public enum guy {
   a("movement", gut::new),
   b("find_tree", gus::new),
   c("punch_tree", guv::new),
   d("open_inventory", guu::new),
   e("craft_planks", gur::new),
   f("none", guq::new);

   private final String g;
   private final Function<guw, ? extends gux> h;

   private <T extends gux> guy(final String $$0, final Function<guw, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gux a(guw $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static guy a(String $$0) {
      for (guy $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
