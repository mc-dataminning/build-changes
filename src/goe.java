import java.util.List;

public class goe<T extends cll, M extends fwu<T>> extends gns<T, M> {
   private final akk a;
   private final goe.a<T> b;
   private final goe.b<T, M> c;

   public goe(glc<T, M> $$0, akk $$1, goe.a<T> $$2, goe.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fag $$0, gdx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         this.a();
         fak $$10 = $$1.getBuffer(gef.j(this.a));
         this.c().a($$0, $$10, $$2, gkh.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fxi> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cll> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cll, M extends fui<T>> {
      List<fxi> getPartsToDraw(M var1);
   }
}
