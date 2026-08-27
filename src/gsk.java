import java.util.function.Function;

public enum gsk {
   a("movement", gsf::new),
   b("find_tree", gse::new),
   c("punch_tree", gsh::new),
   d("open_inventory", gsg::new),
   e("craft_planks", gsd::new),
   f("none", gsc::new);

   private final String g;
   private final Function<gsi, ? extends gsj> h;

   private <T extends gsj> gsk(String $$0, Function<gsi, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gsj a(gsi $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gsk a(String $$0) {
      for (gsk $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
