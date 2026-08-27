import java.util.UUID;

public record yx(UUID b, yx.a c) implements yb<ys> {
   public static final xs<uu, yx> a = yb.a(yx::a, yx::new);

   private yx(uu $$0) {
      this($$0.n(), $$0.b(yx.a.class));
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<yx> a() {
      return yr.n;
   }

   public void a(ys $$0) {
      $$0.a(this);
   }

   public yx.a e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g,
      h;

      public boolean a() {
         return this != d && this != e;
      }
   }
}
