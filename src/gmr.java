import java.util.List;

public class gmr<T extends clc, M extends fvi<T>> extends gmf<T, M> {
   private final akn a;
   private final gmr.a<T> b;
   private final gmr.b<T, M> c;

   public gmr(gjp<T, M> $$0, akn $$1, gmr.a<T> $$2, gmr.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(eyu $$0, gck $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.ch()) {
         this.a();
         eyy $$10 = $$1.getBuffer(gcs.j(this.a));
         this.c().a($$0, $$10, $$2, giu.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fvw> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends clc> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends clc, M extends fsw<T>> {
      List<fvw> getPartsToDraw(M var1);
   }
}
