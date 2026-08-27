import java.util.List;

public class fxi<T extends car, M extends fha<T>> extends fww<T, M> {
   private final aer a;
   private final fxi.a<T> b;
   private final fxi.b<T, M> c;

   public fxi(fuj<T, M> $$0, aer $$1, fxi.a<T> $$2, fxi.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(elg $$0, fnl $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         elk $$10 = $$1.getBuffer(fnt.j(this.a));
         this.c().a($$0, $$10, $$2, ftp.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fhn> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends car> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends car, M extends feo<T>> {
      List<fhn> getPartsToDraw(M var1);
   }
}
