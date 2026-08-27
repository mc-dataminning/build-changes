import java.util.UUID;

public record zn(zn.a c) implements zo {
   public static final ye<vg, zn> a = zo.a(zn::a, zn::new);
   public static final zo.b<zn> b = zo.a("debug/breeze");

   private zn(vg $$0) {
      this(new zn.a($$0));
   }

   private void a(vg $$0) {
      this.c.a($$0);
   }

   @Override
   public zo.b<zn> a() {
      return b;
   }

   public zn.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, ib d) {
      public a(vg $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vg::readInt), $$0.c(ib.b));
      }

      public void a(vg $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, vg::p);
         $$0.a(this.d, ib.b);
      }

      public String a() {
         return afh.a(this.a);
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

      public ib e() {
         return this.d;
      }
   }
}
