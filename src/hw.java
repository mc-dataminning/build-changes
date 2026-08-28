import java.util.List;

public class hw<T extends es<T>> implements ht<T> {
   private final ie<T> a;
   private final en b;
   private final boolean c;

   public hw(ie<T> $$0, en $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public void a(T $$0, hp<T> $$1, hr $$2) {
      $$1.e();
      List<ht<T>> $$3 = this.a.b();
      hs $$4 = $$1.b();
      if ($$4 != null) {
         $$4.a($$2.c(), this.a.a(), this.a.b().size());
      }

      int $$5 = $$2.c() + 1;
      hr.a $$6 = this.c ? $$2.e() : $$1.b($$5);
      hr $$7 = new hr($$5, this.b, $$6);
      hx.a($$1, $$7, $$3, ($$1x, $$2x) -> new hl<>($$1x, $$2x.bind($$0)));
   }
}
