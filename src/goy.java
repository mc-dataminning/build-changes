import java.util.function.Function;

public enum goy {
   a("movement", got::new),
   b("find_tree", gos::new),
   c("punch_tree", gov::new),
   d("open_inventory", gou::new),
   e("craft_planks", gor::new),
   f("none", goq::new);

   private final String g;
   private final Function<gow, ? extends gox> h;

   private <T extends gox> goy(String $$0, Function<gow, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gox a(gow $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static goy a(String $$0) {
      for (goy $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
