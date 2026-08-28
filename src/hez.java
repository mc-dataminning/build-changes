import java.util.function.Function;

public enum hez {
   a("movement", heu::new),
   b("find_tree", het::new),
   c("punch_tree", hew::new),
   d("open_inventory", hev::new),
   e("craft_planks", hes::new),
   f("none", her::new);

   private final String g;
   private final Function<hex, ? extends hey> h;

   private <T extends hey> hez(final String $$0, final Function<hex, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hey a(hex $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hez a(String $$0) {
      for (hez $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
