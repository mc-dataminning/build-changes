import java.util.List;

public record zm(zm.a a, List<String> b) implements wu<yo> {
   public zm(ue $$0) {
      this($$0.b(zm.a.class), $$0.a(ue::s));
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b, ue::a);
   }

   public void a(yo $$0) {
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
