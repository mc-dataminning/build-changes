import java.util.UUID;

public record zl(UUID b, zl.a c) implements yp<zg> {
   public static final yg<vi, zl> a = yp.a(zl::a, zl::new);

   private zl(vi $$0) {
      this($$0.n(), $$0.b(zl.a.class));
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<zl> a() {
      return zf.n;
   }

   public void a(zg $$0) {
      $$0.a(this);
   }

   public zl.a e() {
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
