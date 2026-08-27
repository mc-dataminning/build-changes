import java.util.UUID;

public record xz(xz.a b) implements ya {
   public static final ahg a = new ahg("debug/breeze");

   public xz(ui $$0) {
      this(new xz.a($$0));
   }

   @Override
   public void a(ui $$0) {
      this.b.a($$0);
   }

   @Override
   public ahg a() {
      return a;
   }

   public static record a(UUID a, int b, Integer c, hx d) {
      public a(ui $$0) {
         this($$0.p(), $$0.readInt(), $$0.c(ui::readInt), $$0.c(ui::e));
      }

      public void a(ui $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c, ui::p);
         $$0.a(this.d, ui::a);
      }

      public String a() {
         return adh.a(this.a);
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

      public hx e() {
         return this.d;
      }
   }
}
