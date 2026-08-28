import java.util.function.Function;

public enum hdy {
   a("movement", hdt::new),
   b("find_tree", hds::new),
   c("punch_tree", hdv::new),
   d("open_inventory", hdu::new),
   e("craft_planks", hdr::new),
   f("none", hdq::new);

   private final String g;
   private final Function<hdw, ? extends hdx> h;

   private <T extends hdx> hdy(final String $$0, final Function<hdw, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public hdx a(hdw $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static hdy a(String $$0) {
      for (hdy $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
