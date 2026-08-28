import java.util.List;

public class ig<T extends ez<T>> implements ic<T> {
   private final io<T> a;
   private final eu b;
   private final boolean c;

   public ig(io<T> $$0, eu $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hy<T> $$1, ia $$2) {
      $$1.e();
      List<ic<T>> $$3 = this.a.b();
      ib $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      ia.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      ia $$7 = new ia($$5, this.b, $$6);
      ih.a($$1, $$7, $$3, ($$1x, $$2x) -> new hu<>($$1x, $$2x.bind($$0)));
   }
}
