public class gfj {
   private final gfl a;
   private final gfk b;

   private gfj(gfl $$0, gfk $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gfj a(gfm $$0) {
      return new gfj($$0.apply(this.a), this.b);
   }

   public gfd a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gfj a(gfl $$0, int $$1, int $$2) {
      return new gfj($$0, new gfk($$1, $$2));
   }
}
