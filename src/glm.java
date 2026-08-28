public class glm {
   private final glo a;
   private final gln b;

   private glm(glo $$0, gln $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public glm a(glp $$0) {
      return new glm($$0.apply(this.a), this.b);
   }

   public glg a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static glm a(glo $$0, int $$1, int $$2) {
      return new glm($$0, new gln($$1, $$2));
   }
}
