import java.util.function.Function;

public enum ghq {
   a("movement", ghl::new),
   b("find_tree", ghk::new),
   c("punch_tree", ghn::new),
   d("open_inventory", ghm::new),
   e("craft_planks", ghj::new),
   f("none", ghi::new);

   private final String g;
   private final Function<gho, ? extends ghp> h;

   private <T extends ghp> ghq(String $$0, Function<gho, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public ghp a(gho $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static ghq a(String $$0) {
      for (ghq $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
