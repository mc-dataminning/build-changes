import java.util.function.Function;

public enum hde {
   a("movement", hcz::new),
   b("find_tree", hcy::new),
   c("punch_tree", hdb::new),
   d("open_inventory", hda::new),
   e("craft_planks", hcx::new),
   f("none", hcw::new);

   private final String g;
   private final Function<hdc, ? extends hdd> h;

   private <T extends hdd> hde(final String $$0, final Function<hdc, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hdd a(hdc $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hde a(String $$0) {
      for (hde $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
