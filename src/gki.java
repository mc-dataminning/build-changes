import java.util.function.Function;

public enum gki {
   a("movement", gkd::new),
   b("find_tree", gkc::new),
   c("punch_tree", gkf::new),
   d("open_inventory", gke::new),
   e("craft_planks", gkb::new),
   f("none", gka::new);

   private final String g;
   private final Function<gkg, ? extends gkh> h;

   private <T extends gkh> gki(String $$0, Function<gkg, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gkh a(gkg $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gki a(String $$0) {
      for (gki $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
