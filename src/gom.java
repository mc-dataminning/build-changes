import java.util.List;

public class gom<T extends clp, M extends fxc<T>> extends goa<T, M> {
   private final akk a;
   private final gom.a<T> b;
   private final gom.b<T, M> c;

   public gom(glk<T, M> $$0, akk $$1, gom.a<T> $$2, gom.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(fao $$0, gef $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cj()) {
         this.a();
         fas $$10 = $$1.getBuffer(gen.j(this.a));
         this.c().a($$0, $$10, $$2, gkp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fxq> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends clp> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends clp, M extends fuq<T>> {
      List<fxq> getPartsToDraw(M var1);
   }
}
