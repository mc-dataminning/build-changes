import java.util.UUID;

public record zj(UUID b, zj.a c) implements yn<ze> {
   public static final ye<vg, zj> a = yn.a(zj::a, zj::new);

   private zj(vg $$0) {
      this($$0.n(), $$0.b(zj.a.class));
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yp<zj> a() {
      return zd.n;
   }

   public void a(ze $$0) {
      $$0.a(this);
   }

   public zj.a e() {
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
