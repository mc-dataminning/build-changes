import java.util.List;

public record zy(zy.a a, List<String> b) implements xf<za> {
   public zy(ui $$0) {
      this($$0.b(zy.a.class), $$0.a(ui::s));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ui::a);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public List<String> d() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
