public class gjz {
   private final gkb a;
   private final gka b;

   private gjz(gkb $$0, gka $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gjz a(gkc $$0) {
      return new gjz($$0.apply(this.a), this.b);
   }

   public gjt a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gjz a(gkb $$0, int $$1, int $$2) {
      return new gjz($$0, new gka($$1, $$2));
   }
}
