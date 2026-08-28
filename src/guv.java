import java.util.function.Function;

public enum guv {
   a("movement", guq::new),
   b("find_tree", gup::new),
   c("punch_tree", gus::new),
   d("open_inventory", gur::new),
   e("craft_planks", guo::new),
   f("none", gun::new);

   private final String g;
   private final Function<gut, ? extends guu> h;

   private <T extends guu> guv(final String $$0, final Function<gut, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public guu a(gut $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static guv a(String $$0) {
      for (guv $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
