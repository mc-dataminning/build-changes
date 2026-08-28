import java.util.function.Function;

public enum hhq {
   a("movement", hhl::new),
   b("find_tree", hhk::new),
   c("punch_tree", hhn::new),
   d("open_inventory", hhm::new),
   e("craft_planks", hhj::new),
   f("none", hhi::new);

   private final String g;
   private final Function<hho, ? extends hhp> h;

   private <T extends hhp> hhq(final String $$0, final Function<hho, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hhp a(hho $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hhq a(String $$0) {
      for (hhq $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
