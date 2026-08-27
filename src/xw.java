import java.util.UUID;

public record xw(UUID a, xw.a b) implements xg<xr> {
   public xw(uj $$0) {
      this($$0.p(), $$0.b(xw.a.class));
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(xr $$0) {
      $$0.a(this);
   }

   public xw.a d() {
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
