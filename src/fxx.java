import java.util.List;

public class fxx<T extends cbe, M extends fhk<T>> extends fxl<T, M> {
   private final aez a;
   private final fxx.a<T> b;
   private final fxx.b<T, M> c;

   public fxx(fuy<T, M> $$0, aez $$1, fxx.a<T> $$2, fxx.b<T, M> $$3) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public void a(elj $$0, foa $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.cd()) {
         this.a();
         eln $$10 = $$1.getBuffer(foi.j(this.a));
         this.c().a($$0, $$10, $$2, fue.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, this.b.apply($$3, $$6, $$7));
         this.b();
      }
   }

   private void a() {
      List<fhx> $$0 = this.c.getPartsToDraw(this.c());
      this.c().a().e().forEach($$0x -> $$0x.l = true);
      $$0.forEach($$0x -> $$0x.l = false);
   }

   private void b() {
      this.c().a().e().forEach($$0 -> $$0.l = false);
   }

   public interface a<T extends cbe> {
      float apply(T var1, float var2, float var3);
   }

   public interface b<T extends cbe, M extends fey<T>> {
      List<fhx> getPartsToDraw(M var1);
   }
}
