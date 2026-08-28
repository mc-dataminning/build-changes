import java.util.List;

public class hs<T extends em<T>> implements hp<T> {
   private final ia<T> a;
   private final eh b;
   private final boolean c;

   public hs(ia<T> $$0, eh $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hl<T> $$1, hn $$2) {
      $$1.e();
      List<hp<T>> $$3 = this.a.b();
      ho $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hn.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hn $$7 = new hn($$5, this.b, $$6);
      ht.a($$1, $$7, $$3, ($$1x, $$2x) -> new hh<>($$1x, $$2x.bind($$0)));
   }
}
