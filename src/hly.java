import java.util.function.Function;

public enum hly {
   a("movement", hlt::new),
   b("find_tree", hls::new),
   c("punch_tree", hlv::new),
   d("open_inventory", hlu::new),
   e("craft_planks", hlr::new),
   f("none", hlq::new);

   private final String g;
   private final Function<hlw, ? extends hlx> h;

   private <T extends hlx> hly(final String $$0, final Function<hlw, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hlx a(hlw $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hly a(String $$0) {
      for (hly $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
