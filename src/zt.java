import java.util.UUID;

public record zt(UUID b, zt.a c) implements yv<zo> {
   public static final ym<vl, zt> a = yv.a(zt::a, zt::new);

   private zt(vl $$0) {
      this($$0.n(), $$0.b(zt.a.class));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yx<zt> a() {
      return zn.p;
   }

   public void a(zo $$0) {
      $$0.a(this);
   }

   public zt.a e() {
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
