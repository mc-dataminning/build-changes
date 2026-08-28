import java.util.function.Function;

public enum hhn {
   a("movement", hhi::new),
   b("find_tree", hhh::new),
   c("punch_tree", hhk::new),
   d("open_inventory", hhj::new),
   e("craft_planks", hhg::new),
   f("none", hhf::new);

   private final String g;
   private final Function<hhl, ? extends hhm> h;

   private <T extends hhm> hhn(final String $$0, final Function<hhl, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hhm a(hhl $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hhn a(String $$0) {
      for (hhn $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
