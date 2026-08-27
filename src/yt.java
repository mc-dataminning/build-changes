import java.util.UUID;

public record yt(UUID b, yt.a c) implements xx<yo> {
   public static final xo<uq, yt> a = xx.a(yt::a, yt::new);

   private yt(uq $$0) {
      this($$0.p(), $$0.b(yt.a.class));
   }

   private void a(uq $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public xz<yt> a() {
      return yn.n;
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public yt.a e() {
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
