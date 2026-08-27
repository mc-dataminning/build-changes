import java.util.function.Function;

public enum gkj {
   a("movement", gke::new),
   b("find_tree", gkd::new),
   c("punch_tree", gkg::new),
   d("open_inventory", gkf::new),
   e("craft_planks", gkc::new),
   f("none", gkb::new);

   private final String g;
   private final Function<gkh, ? extends gki> h;

   private <T extends gki> gkj(String $$0, Function<gkh, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gki a(gkh $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gkj a(String $$0) {
      for (gkj $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
