public class gfi {
   private final gfk a;
   private final gfj b;

   private gfi(gfk $$0, gfj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfi a(gfl $$0) {
      return new gfi($$0.apply(this.a), this.b);
   }

   public gfc a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gfi a(gfk $$0, int $$1, int $$2) {
      return new gfi($$0, new gfj($$1, $$2));
   }
}
