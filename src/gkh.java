import java.util.function.Function;

public enum gkh {
   a("movement", gkc::new),
   b("find_tree", gkb::new),
   c("punch_tree", gke::new),
   d("open_inventory", gkd::new),
   e("craft_planks", gka::new),
   f("none", gjz::new);

   private final String g;
   private final Function<gkf, ? extends gkg> h;

   private <T extends gkg> gkh(String $$0, Function<gkf, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gkg a(gkf $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gkh a(String $$0) {
      for (gkh $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
