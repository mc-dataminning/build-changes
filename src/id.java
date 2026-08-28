import java.util.List;

public class id<T extends ey<T>> implements ia<T> {
   private final im<T> a;
   private final et b;
   private final boolean c;

   public id(im<T> $$0, et $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hw<T> $$1, hy $$2) {
      $$1.e();
      List<ia<T>> $$3 = this.a.b();
      hz $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hy.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hy $$7 = new hy($$5, this.b, $$6);
      ie.a($$1, $$7, $$3, ($$1x, $$2x) -> new hs<>($$1x, $$2x.bind($$0)));
   }
}
