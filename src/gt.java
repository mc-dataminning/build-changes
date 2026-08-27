import java.util.List;

public class gt<T> implements gq<T> {
   private final gz<T> a;

   public gt(gz<T> $$0) {
      this.a = $$0;
   }

   @Override
   public void execute(T $$0, gn<T> $$1, int $$2) {
      $$1.e();
      List<gq<T>> $$3 = this.a.b();
      gp $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2, this.a.a(), this.a.b().size());
      }

      gu.a($$1, $$2 + 1, $$3, ($$1x, $$2x) -> new gj<>($$1x, $$2x.bind($$0)));
   }
}
