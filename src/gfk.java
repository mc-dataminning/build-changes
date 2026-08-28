public class gfk {
   private final gfm a;
   private final gfl b;

   private gfk(gfm $$0, gfl $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfk a(gfn $$0) {
      return new gfk($$0.apply(this.a), this.b);
   }

   public gfe a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gfk a(gfm $$0, int $$1, int $$2) {
      return new gfk($$0, new gfl($$1, $$2));
   }
}
