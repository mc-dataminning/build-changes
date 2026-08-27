import java.util.function.Function;

public enum gts {
   a("movement", gtn::new),
   b("find_tree", gtm::new),
   c("punch_tree", gtp::new),
   d("open_inventory", gto::new),
   e("craft_planks", gtl::new),
   f("none", gtk::new);

   private final String g;
   private final Function<gtq, ? extends gtr> h;

   private <T extends gtr> gts(String $$0, Function<gtq, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gtr a(gtq $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gts a(String $$0) {
      for (gts $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
