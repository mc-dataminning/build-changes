import java.util.List;

public class hz<T extends ev<T>> implements hw<T> {
   private final ii<T> a;
   private final eq b;
   private final boolean c;

   public hz(ii<T> $$0, eq $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hs<T> $$1, hu $$2) {
      $$1.e();
      List<hw<T>> $$3 = this.a.b();
      hv $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hu.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hu $$7 = new hu($$5, this.b, $$6);
      ia.a($$1, $$7, $$3, ($$1x, $$2x) -> new ho<>($$1x, $$2x.bind($$0)));
   }
}
