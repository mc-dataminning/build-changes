import java.util.List;

public class fyx<T extends ccb, M extends fij<T>> extends fyl<T, M> {
   private final afw a;
   private final fyx.a<T> b;
   private final fyx.b<T, M> c;

   public fyx(fvy<T, M> $$0, afw $$1, fyx.a<T> $$2, fyx.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(emh $$0, fpb $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         eml $$10 = $$1.getBuffer(fpj.j(this.a));
         this.c().a($$0, $$10, $$2, fve.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fiw> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends ccb> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends ccb, M extends ffx<T>> {
      List<fiw> getPartsToDraw(M var1);
   }
}
