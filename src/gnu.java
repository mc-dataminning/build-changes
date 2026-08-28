import java.util.List;

public class gnu<T extends cma, M extends fwl<T>> extends gni<T, M> {
   private final ale a;
   private final gnu.a<T> b;
   private final gnu.b<T, M> c;

   public gnu(gks<T, M> $$0, ale $$1, gnu.a<T> $$2, gnu.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(ezx $$0, gdn $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         this.a();
         fab $$10 = $$1.getBuffer(gdv.j(this.a));
         this.c().a($$0, $$10, $$2, gjx.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fwz> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cma> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cma, M extends ftz<T>> {
      List<fwz> getPartsToDraw(M var1);
   }
}
