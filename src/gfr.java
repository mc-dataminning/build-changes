import java.util.function.Function;

public enum gfr {
   a("movement", gfm::new),
   b("find_tree", gfl::new),
   c("punch_tree", gfo::new),
   d("open_inventory", gfn::new),
   e("craft_planks", gfk::new),
   f("none", gfj::new);

   private final String g;
   private final Function<gfp, ? extends gfq> h;

   private <T extends gfq> gfr(String $$0, Function<gfp, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gfq a(gfp $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gfr a(String $$0) {
      for (gfr $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
