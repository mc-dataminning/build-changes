import java.util.UUID;

public record xv(UUID a, xv.a b) implements xf<xq> {
   public xv(ui $$0) {
      this($$0.p(), $$0.b(xv.a.class));
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(xq $$0) {
      $$0.a(this);
   }

   public xv.a d() {
      return this.b;
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
