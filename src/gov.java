import java.util.function.Function;

public enum gov {
   a("movement", goq::new),
   b("find_tree", gop::new),
   c("punch_tree", gos::new),
   d("open_inventory", gor::new),
   e("craft_planks", goo::new),
   f("none", gon::new);

   private final String g;
   private final Function<got, ? extends gou> h;

   private <T extends gou> gov(String $$0, Function<got, T> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public gou a(got $$0) {
      return this.h.apply($$0);
   }

   public String a() {
      return this.g;
   }

   public static gov a(String $$0) {
      for (gov $$1 : values()) {
         if ($$1.g.equals($$0)) {
            return $$1;
         }
      }

      return f;
   }
}
