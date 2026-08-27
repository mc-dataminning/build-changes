import java.util.UUID;

public record zv(UUID b, zv.a c) implements yz<zq> {
   public static final yq<vs, zv> a = yz.a(zv::a, zv::new);

   private zv(vs $$0) {
      this($$0.n(), $$0.b(zv.a.class));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<zv> a() {
      return zp.n;
   }

   public void a(zq $$0) {
      $$0.a(this);
   }

   public zv.a e() {
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
