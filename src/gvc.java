import java.util.function.Function;

public enum gvc {
   a("movement", gux::new),
   b("find_tree", guw::new),
   c("punch_tree", guz::new),
   d("open_inventory", guy::new),
   e("craft_planks", guv::new),
   f("none", guu::new);

   private final String g;
   private final Function<gva, ? extends gvb> h;

   private <T extends gvb> gvc(final String $$0, final Function<gva, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gvb a(gva $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gvc a(String $$0) {
      for (gvc $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
