import java.util.function.Function;

public enum hmz {
   a("movement", hmu::new),
   b("find_tree", hmt::new),
   c("punch_tree", hmw::new),
   d("open_inventory", hmv::new),
   e("craft_planks", hms::new),
   f("none", hmr::new);

   private final String g;
   private final Function<hmx, ? extends hmy> h;

   private <T extends hmy> hmz(final String $$0, final Function<hmx, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hmy a(hmx $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hmz a(String $$0) {
      for (hmz $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
