import java.util.function.Function;

public enum hla {
   a("movement", hkv::new),
   b("find_tree", hku::new),
   c("punch_tree", hkx::new),
   d("open_inventory", hkw::new),
   e("craft_planks", hkt::new),
   f("none", hks::new);

   private final String g;
   private final Function<hky, ? extends hkz> h;

   private <T extends hkz> hla(final String $$0, final Function<hky, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hkz a(hky $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hla a(String $$0) {
      for (hla $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
