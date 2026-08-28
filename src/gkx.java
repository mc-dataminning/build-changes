public class gkx {
   private final gkz a;
   private final gky b;

   private gkx(gkz $$0, gky $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gkx a(gla $$0) {
      return new gkx($$0.apply(this.a), this.b);
   }

   public gkr a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gkx a(gkz $$0, int $$1, int $$2) {
      return new gkx($$0, new gky($$1, $$2));
   }
}
