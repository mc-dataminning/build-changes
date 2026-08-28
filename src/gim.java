public class gim {
   private final gio a;
   private final gin b;

   private gim(gio $$0, gin $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public gim a(gip $$0) {
      return new gim($$0.apply(this.a), this.b);
   }

   public gig a() {
      return this.a.a().a(this.b.a, this.b.b);
   }

   public static gim a(gio $$0, int $$1, int $$2) {
      return new gim($$0, new gin($$1, $$2));
   }
}
