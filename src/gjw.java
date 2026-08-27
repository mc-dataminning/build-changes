import java.util.function.Function;

public enum gjw {
   a("movement", gjr::new),
   b("find_tree", gjq::new),
   c("punch_tree", gjt::new),
   d("open_inventory", gjs::new),
   e("craft_planks", gjp::new),
   f("none", gjo::new);

   private final String g;
   private final Function<gju, ? extends gjv> h;

   private <T extends gjv> gjw(String $$0, Function<gju, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gjv a(gju $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gjw a(String $$0) {
      for (gjw $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
