import java.util.function.Function;

public enum hhr {
   a("movement", hhm::new),
   b("find_tree", hhl::new),
   c("punch_tree", hho::new),
   d("open_inventory", hhn::new),
   e("craft_planks", hhk::new),
   f("none", hhj::new);

   private final String g;
   private final Function<hhp, ? extends hhq> h;

   private <T extends hhq> hhr(final String $$0, final Function<hhp, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hhq a(hhp $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hhr a(String $$0) {
      for (hhr $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
