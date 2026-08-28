import java.util.function.Function;

public enum hhk {
   a("movement", hhf::new),
   b("find_tree", hhe::new),
   c("punch_tree", hhh::new),
   d("open_inventory", hhg::new),
   e("craft_planks", hhd::new),
   f("none", hhc::new);

   private final String g;
   private final Function<hhi, ? extends hhj> h;

   private <T extends hhj> hhk(final String $$0, final Function<hhi, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hhj a(hhi $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hhk a(String $$0) {
      for (hhk $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
