import java.util.List;

public class gx<T extends dw<T>> implements gu<T> {
   private final hf<T> a;
   private final dr b;
   private final boolean c;

   public gx(hf<T> $$0, dr $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, gq<T> $$1, gs $$2) {
      $$1.e();
      List<gu<T>> $$3 = this.a.b();
      gt $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      gs.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      gs $$7 = new gs($$5, this.b, $$6);
      gy.a($$1, $$7, $$3, ($$1x, $$2x) -> new gm<>($$1x, $$2x.bind($$0)));
   }
}
