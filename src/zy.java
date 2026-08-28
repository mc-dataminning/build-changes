import java.util.UUID;

public record zy(zy.a c) implements zz {
   public static final yn<vl, zy> a = zz.a(zy::a, zy::new);
   public static final zz.b<zy> b = zz.a("debug/breeze");

   private zy(vl $$0) {
      this(new zy.a($$0));
   }

   private void a(vl $$0) {
      this.c.a($$0);
   }

   @Override
   public zz.b<zy> a() {
      return b;
   }

   public zy.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, Integer c, ji d) {
      public a(vl $$0) {
         this($$0.n(), $$0.readInt(), $$0.c(vl::readInt), $$0.c(ji.b));
      }

      public void a(vl $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c, vl::q);
         $$0.a(this.d, ji.b);
      }

      public String a() {
         return agb.a(this.a);
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

      public ji e() {
         return this.d;
      }
   }
}
