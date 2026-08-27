import java.util.List;

public class glk<T extends cjp, M extends fud<T>> extends gky<T, M> {
   private final akf a;
   private final glk.a<T> b;
   private final glk.b<T, M> c;

   public glk(gii<T, M> $$0, akf $$1, glk.a<T> $$2, glk.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(exn $$0, gbe $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cf()) {
         this.a();
         exr $$10 = $$1.getBuffer(gbm.j(this.a));
         this.c().a($$0, $$10, $$2, gho.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fur> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cjp> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cjp, M extends frr<T>> {
      List<fur> getPartsToDraw(M var1);
   }
}
