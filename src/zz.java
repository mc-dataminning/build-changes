import java.util.UUID;

public record zz(zz.a c) implements aaa {
   public static final yq<vs, zz> a = aaa.a(zz::a, zz::new);
   public static final aaa.b<zz> b = aaa.a("debug/breeze");

   private zz(vs $$0) {
      this(new zz.a($$0));
   }

   private void a(vs $$0) {
      this.c.a($$0);
   }

   @Override
   public aaa.b<zz> a() {
      return b;
   }

   public zz.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, im d) {
      public a(vs $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vs::readInt), $$0.c(im.b));
      }

      public void a(vs $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vs::p);
         $$0.a(this.d, im.b);
      }

      public String a() {
         return aft.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public Integer d() {
         return this.c;
      }

      public im e() {
         return this.d;
      }
   }
}
