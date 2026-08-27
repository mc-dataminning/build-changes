import java.util.List;

public class gt<T extends du<T>> implements gq<T> {
   private final hb<T> a;
   private final dp b;
   private final boolean c;

   public gt(hb<T> $$0, dp $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, gm<T> $$1, go $$2) {
      $$1.e();
      List<gq<T>> $$3 = this.a.b();
      gp $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      go.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      go $$7 = new go($$5, this.b, $$6);
      gu.a($$1, $$7, $$3, ($$1x, $$2x) -> new gi<>($$1x, $$2x.bind($$0)));
   }
}
