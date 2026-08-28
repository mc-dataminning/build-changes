public class gfg {
   private final gfi a;
   private final gfh b;

   private gfg(gfi $$0, gfh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfg a(gfj $$0) {
      return new gfg($$0.apply(this.a), this.b);
   }

   public gfa a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gfg a(gfi $$0, int $$1, int $$2) {
      return new gfg($$0, new gfh($$1, $$2));
   }
}
