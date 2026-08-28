import java.util.function.Function;

public enum hhp {
   a("movement", hhk::new),
   b("find_tree", hhj::new),
   c("punch_tree", hhm::new),
   d("open_inventory", hhl::new),
   e("craft_planks", hhi::new),
   f("none", hhh::new);

   private final String g;
   private final Function<hhn, ? extends hho> h;

   private <T extends hho> hhp(final String $$0, final Function<hhn, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hho a(hhn $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hhp a(String $$0) {
      for (hhp $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
