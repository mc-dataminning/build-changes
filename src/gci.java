public class gci {
   private final gck a;
   private final gcj b;

   private gci(gck $$0, gcj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gci a(gcl $$0) {
      return new gci($$0.apply(this.a), this.b);
   }

   public gcc a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gci a(gck $$0, int $$1, int $$2) {
      return new gci($$0, new gcj($$1, $$2));
   }
}
