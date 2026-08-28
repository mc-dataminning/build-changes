import java.util.function.Function;

public enum hky {
   a("movement", hkt::new),
   b("find_tree", hks::new),
   c("punch_tree", hkv::new),
   d("open_inventory", hku::new),
   e("craft_planks", hkr::new),
   f("none", hkq::new);

   private final String g;
   private final Function<hkw, ? extends hkx> h;

   private <T extends hkx> hky(final String $$0, final Function<hkw, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hkx a(hkw $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hky a(String $$0) {
      for (hky $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
