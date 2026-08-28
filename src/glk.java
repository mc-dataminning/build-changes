public class glk {
   private final glm a;
   private final gll b;

   private glk(glm $$0, gll $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public glk a(gln $$0) {
      return new glk($$0.apply(this.a), this.b);
   }

   public gle a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static glk a(glm $$0, int $$1, int $$2) {
      return new glk($$0, new gll($$1, $$2));
   }
}
