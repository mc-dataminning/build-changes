import java.util.UUID;

public record yv(UUID b, yv.a c) implements xz<yq> {
   public static final xq<us, yv> a = xz.a(yv::a, yv::new);

   private yv(us $$0) {
      this($$0.n(), $$0.b(yv.a.class));
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yb<yv> a() {
      return yp.n;
   }

   public void a(yq $$0) {
      $$0.a(this);
   }

   public yv.a e() {
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
