import java.util.function.Function;

public enum hej {
   a("movement", hee::new),
   b("find_tree", hed::new),
   c("punch_tree", heg::new),
   d("open_inventory", hef::new),
   e("craft_planks", hec::new),
   f("none", heb::new);

   private final String g;
   private final Function<heh, ? extends hei> h;

   private <T extends hei> hej(final String $$0, final Function<heh, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hei a(heh $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hej a(String $$0) {
      for (hej $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
