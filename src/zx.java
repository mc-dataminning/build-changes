import java.util.UUID;

public record zx(UUID b, zx.a c) implements zb<zs> {
   public static final ys<vr, zx> a = zb.a(zx::a, zx::new);

   private zx(vr $$0) {
      this($$0.n(), $$0.b(zx.a.class));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<zx> a() {
      return zr.n;
   }

   public void a(zs $$0) {
      $$0.a(this);
   }

   public zx.a e() {
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
