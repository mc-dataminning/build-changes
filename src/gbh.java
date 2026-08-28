public class gbh {
   private final gbj a;
   private final gbi b;

   private gbh(gbj $$0, gbi $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gbh a(gbk $$0) {
      return new gbh($$0.apply(this.a), this.b);
   }

   public gbb a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gbh a(gbj $$0, int $$1, int $$2) {
      return new gbh($$0, new gbi($$1, $$2));
   }
}
