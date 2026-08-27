import java.util.List;

public class gz<T extends dw<T>> implements gw<T> {
   private final hh<T> a;
   private final dr b;
   private final boolean c;

   public gz(hh<T> $$0, dr $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, gs<T> $$1, gu $$2) {
      $$1.e();
      List<gw<T>> $$3 = this.a.b();
      gv $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      gu.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      gu $$7 = new gu($$5, this.b, $$6);
      ha.a($$1, $$7, $$3, ($$1x, $$2x) -> new go<>($$1x, $$2x.bind($$0)));
   }
}
