public class gcr {
   private final gct a;
   private final gcs b;

   private gcr(gct $$0, gcs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gcr a(gcu $$0) {
      return new gcr($$0.apply(this.a), this.b);
   }

   public gcl a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gcr a(gct $$0, int $$1, int $$2) {
      return new gcr($$0, new gcs($$1, $$2));
   }
}
