import java.util.function.Function;

public enum hkz {
   a("movement", hku::new),
   b("find_tree", hkt::new),
   c("punch_tree", hkw::new),
   d("open_inventory", hkv::new),
   e("craft_planks", hks::new),
   f("none", hkr::new);

   private final String g;
   private final Function<hkx, ? extends hky> h;

   private <T extends hky> hkz(final String $$0, final Function<hkx, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hky a(hkx $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hkz a(String $$0) {
      for (hkz $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
