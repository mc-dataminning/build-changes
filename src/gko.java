import java.util.List;

public class gko<T extends cje, M extends fth<T>> extends gkc<T, M> {
   private final ajv a;
   private final gko.a<T> b;
   private final gko.b<T, M> c;

   public gko(ghm<T, M> $$0, ajv $$1, gko.a<T> $$2, gko.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(ewr $$0, gai $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ce()) {
         this.a();
         ewv $$10 = $$1.getBuffer(gaq.j(this.a));
         this.c().a($$0, $$10, $$2, ggs.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<ftv> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cje> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cje, M extends fqv<T>> {
      List<ftv> getPartsToDraw(M var1);
   }
}
