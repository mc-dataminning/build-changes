import java.util.function.Function;

public enum hfk {
   a("movement", hff::new),
   b("find_tree", hfe::new),
   c("punch_tree", hfh::new),
   d("open_inventory", hfg::new),
   e("craft_planks", hfd::new),
   f("none", hfc::new);

   private final String g;
   private final Function<hfi, ? extends hfj> h;

   private <T extends hfj> hfk(final String $$0, final Function<hfi, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hfj a(hfi $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hfk a(String $$0) {
      for (hfk $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
