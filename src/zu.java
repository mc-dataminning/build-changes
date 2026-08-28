import java.util.UUID;

public record zu(UUID b, zu.a c) implements yw<zp> {
   public static final yn<vl, zu> a = yw.a(zu::a, zu::new);

   private zu(vl $$0) {
      this($$0.n(), $$0.b(zu.a.class));
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yy<zu> a() {
      return zo.p;
   }

   public void a(zp $$0) {
      $$0.a(this);
   }

   public zu.a e() {
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
