import java.util.List;

public class ib<T extends ew<T>> implements hy<T> {
   private final ik<T> a;
   private final er b;
   private final boolean c;

   public ib(ik<T> $$0, er $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hu<T> $$1, hw $$2) {
      $$1.e();
      List<hy<T>> $$3 = this.a.b();
      hx $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hw.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hw $$7 = new hw($$5, this.b, $$6);
      ic.a($$1, $$7, $$3, ($$1x, $$2x) -> new hq<>($$1x, $$2x.bind($$0)));
   }
}
