import java.util.List;

public class ic<T extends ex<T>> implements hz<T> {
   private final il<T> a;
   private final es b;
   private final boolean c;

   public ic(il<T> $$0, es $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hv<T> $$1, hx $$2) {
      $$1.e();
      List<hz<T>> $$3 = this.a.b();
      hy $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hx.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hx $$7 = new hx($$5, this.b, $$6);
      id.a($$1, $$7, $$3, ($$1x, $$2x) -> new hr<>($$1x, $$2x.bind($$0)));
   }
}
